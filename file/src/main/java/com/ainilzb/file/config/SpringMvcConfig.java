package com.ainilzb.file.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SpringMvcConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/f/**").addResourceLocations("file:D:/file/ainilzb/course/");
    }

    //http://127.0.0.1:9003/file/f/teacher/kmO4zTEP-five.jpg
    //http://127.0.0.1:9000/file/D:/file/ainilzb/course/teacher/kmO4zTEP-five.jpg
}