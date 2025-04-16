package com.ssafy.mvc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.ssafy.mvc.interceptor.AInterceptor;
import com.ssafy.mvc.interceptor.BInterceptor;
import com.ssafy.mvc.interceptor.CInterceptor;

@Configuration
public class WebConfig implements WebMvcConfigurer{
	private AInterceptor aInterceptor;
	private BInterceptor bInterceptor;
	private CInterceptor cInterceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		
	}
	
}
