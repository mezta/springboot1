package com.itheima.config;

import org.apache.juli.WebappProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Locale;

@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
//    @Override
////    public void addInterceptors(InterceptorRegistry registry) {
////        WebMvcConfigurer.super.addInterceptors(registry);
////    }

    @Bean
    public ViewResolver viewResolver(){
        return new MyViewResolver();
    }

    //自定义视图解析器
    public static class MyViewResolver implements ViewResolver{

    @Override
    public View resolveViewName(String s, Locale locale) throws Exception {
        return null;
    }
}
}
