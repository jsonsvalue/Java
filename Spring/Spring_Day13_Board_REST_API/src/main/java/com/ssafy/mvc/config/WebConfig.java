package com.ssafy.mvc.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.ssafy.mvc.interceptor.AdminInterceptor;

@Configuration
public class WebConfig implements WebMvcConfigurer{
	
	@Autowired
	AdminInterceptor adminInterceptor;
	
	// 어느 경로에서 adminInterceptor를 쓸지 지정한다.
	// 즉, admin페이지로 가지 못하도록 interceptor를 등록한다.
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(adminInterceptor).addPathPatterns("/users");		
	}
	
	
}
