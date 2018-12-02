package com.example.configuration.annotation;

import com.example.configuration.City;
import com.example.configuration.People;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClassBeanConfiguration {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Bean
    public People annotationBeanPeople(){
        People p = new People();
        p.setName("annotation bean peter");
        p.setAge(18);
        return p;
    }

    @Bean
    public City annotationBeanCity(){
        City city = new City();
        city.setArea("annotation bean area");
        city.setName("annotation bean luzhou");
        city.setPopulation(14000000);
        return city;
    }

    @Bean
    public Object springApplicationArgs(ApplicationArguments args){

        /**
         * springboot中ApplicationArguments用于捕获启动时应用程序的参数
         * 比如: java -jar myApplication.jar --stage debug
         * --stage 是option参数 , option参数以"--"开始 , 可用containsOption判断
         * debug是nonOptionArg , 可用getNonOptionArgs获得
         */

        if(args.getNonOptionArgs().contains("debug")){
            logger.warn("NonOptionArg debug detected , 进入debug模式");
        }

        boolean debug = args.containsOption("stage");
        if(debug){
            logger.warn("ApplicationArguments包含 --stage 参数 , 运行stage环境");
        }
        return new Object();
    }
}
