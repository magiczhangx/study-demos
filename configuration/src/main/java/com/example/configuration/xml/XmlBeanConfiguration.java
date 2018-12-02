package com.example.configuration.xml;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * SpringBoot 自动扫描到@Configuration
 */
@Configuration
//扫描classpath下的xml配置文件 , 也可以直接放到ConfigurationApplication , springboot中一般使用注解较多 , 尽量统一一种配置方式
@ImportResource({"classpath:/xmlBeanConfig/beansConfigurationChengdu.xml", "classpath:/xmlBeanConfig/beansConfigurationMianYang.xml"})
public class XmlBeanConfiguration {
}
