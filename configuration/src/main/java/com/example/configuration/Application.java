package com.example.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    private static Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

        /**
         * beansConfigurationChengdu.xml中的内容
         */
        Object obj = context.getBean("chengDu");
        logger.warn(obj.toString());
        obj = context.getBean("zhangSan");
        logger.warn(obj.toString());

        obj.hashCode();
        /**
         * beansConfigurationMianYang.xml中的内容
         */
        obj = context.getBean("mianYang");
        logger.warn(obj.toString());
        obj = context.getBean("liSi");
        logger.warn(obj.toString());

        /**
         * ClassBeanConfiguration.java中的内容
         */
        obj = context.getBean("annotationBeanCity");
        logger.warn(obj.toString());
        obj = context.getBean("annotationBeanPeople");
        logger.warn(obj.toString());
    }
}
