package com.example.web.config.BeanAnnotation;

import com.example.web.api.Interceptors.DemoInterceptor;
import com.example.web.api.vo.HomePageVo;
import com.example.web.api.vo.ProfileVo;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import java.util.Arrays;

@Configuration
public class MvcAppConfiguration implements WebMvcConfigurer {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 默认值为defauleValue字符串
     */
    @Value("${example.web.profileName:defauleValue}")
    private String profileName;

    /**
     * 默认值为空指针
     */
    @Value("${example.web.hostSystem:#{null}}")
    private String hostSystem;

    /**
     * yml中的list读取需要@ConfigurationProperties比较麻烦, 参考官方例子.
     * 如果不是频繁读取可以考虑使用split
     */
   // @Value("${example.web.dockerServers:#{null}}")
    private String[] dockerServers;

    /**
     * @ConfigurationProperties也可以用在这里, 也可以用在@Bean方法上 , 这里的例子是在@Bean方法上
     */
    @Data
    private static class DockerServers{
        /**
         * 这里也可以是List<String> , @ConfigurationProperties会根据情况判断自行注入
         *
         * @NotNull注解配合下面@Validated注解使用
         * javax.validation.constraints下还有NotBlank , NotEmpty , Digits , Max  , Min等有用注解
         */
        @NotNull
        private String[] dockerServers;

        @Max(99)
        /**
         * 最大不能超过99
         */
        private String version;

    }

    @Bean
    public static DockerServers staticDockerServers(){
        return new DockerServers();
    }

    @Bean
    @Validated
    @ConfigurationProperties(prefix="example.web")
    public DockerServers dockerServers(){
        return new DockerServers();
    }

    @Bean
    public ProfileVo profileVo(){
        ProfileVo profileVo = new ProfileVo();
        profileVo.setProfileName(profileName);
        profileVo.setSystem(hostSystem);
        profileVo.setServers(dockerServers().getDockerServers());
        return  profileVo;
    }

    @Bean
    public HomePageVo home(){
        HomePageVo homePageVo = new HomePageVo();
        homePageVo.setAddress(MvcAppConfiguration.class.getSimpleName()+":成都");
        homePageVo.setName(MvcAppConfiguration.class.getSimpleName()+":欢迎你");
        homePageVo.setPhone(MvcAppConfiguration.class.getSimpleName()+":131414");
        return homePageVo;
    }

    @Bean
    public CommandLineRunner commandLineRunner(){
        /**
         * 多个CommandLineRunner如果有先后顺序, 使用org.springframework.core.annotation.Order注解表示
         *
         * ApplicationRunner 也可用于同样的功能, 只是run方法参数不一样 , ApplicationRunner 参数是ApplicationArguments
         *
         * If you need to run some specific code once the SpringApplication has started, you can implement the ApplicationRunner or CommandLineRunner interfaces
         */

        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                logger.info("在Spring Application之前运行 commandLineRunner , 参数:"+Arrays.toString(args));
            }
        };
    }


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new DemoInterceptor(1)).order(1).addPathPatterns("/**");
        registry.addInterceptor(new DemoInterceptor(2)).order(2).addPathPatterns("/**");
    }

}
