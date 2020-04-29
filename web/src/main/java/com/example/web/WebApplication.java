package com.example.web;

import com.example.web.api.vo.HomePageVo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 *
 * SpringBootApplication中包含了以下几个注解
 * org.springframework.context.annotation.Configuration
 * EnableAutoConfiguration
 * ComponentScan
 */
@SpringBootApplication
@ServletComponentScan
public class WebApplication {
    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(WebApplication.class, args);
    }

    /**
     *  官网推荐main函数的类是比较好的bean配置的地方 , 当然不是必须的 , 可以@Configuration注解,
     *  demo中com.example.web.config.BeanAnnotation.ClassBeanConfiguration , springboot会自动扫描到它
     *  we generally recommend that your primary source be a single @Configuration class.
     *  Usually the class that defines the main method is a good candidate as the primary
     * @return
     */

    @Bean
    public HomePageVo home2(){
        HomePageVo homePageVo = new HomePageVo();
        homePageVo.setAddress(WebApplication.class.getSimpleName()+":成都");
        homePageVo.setName(WebApplication.class.getSimpleName()+":欢迎你");
        homePageVo.setPhone(WebApplication.class.getSimpleName()+":131414");
        return homePageVo;
    }

}
