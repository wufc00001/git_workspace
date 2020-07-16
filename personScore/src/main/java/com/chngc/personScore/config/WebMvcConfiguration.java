package com.chngc.personScore.config;

import com.chngc.personScore.interceptor.LogInterceptor;
import com.chngc.personScore.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer {
    @Bean
    public LoginInterceptor getLoginInterceptor(){
        return new LoginInterceptor();
    }
    @Bean
    public LogInterceptor getLogInterceptor(){
        return new LogInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(getLoginInterceptor()).addPathPatterns("/coreUser/*");
        registry.addInterceptor(getLogInterceptor()).addPathPatterns("/*");
    }
}
