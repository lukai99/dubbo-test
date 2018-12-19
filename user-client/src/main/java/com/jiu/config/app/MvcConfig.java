package com.jiu.config.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
@EnableWebMvc//开启springmvc
@ComponentScan(basePackages = {"com.jiu.controller"})//扫描controller
public class MvcConfig implements WebMvcConfigurer{


}
