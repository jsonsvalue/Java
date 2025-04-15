package com.ssafy.mvc.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ssafy.mvc.filter.MyFilter;

// 설정 파일들의 모음집
@Configuration
public class FilterConfig {
	
	@Bean
	public FilterRegistrationBean<MyFilter> myfilter(){
		FilterRegistrationBean<MyFilter> registrationBean = new FilterRegistrationBean<>();
		
		// 어떤 filter를 등록할지를 설정한다.
		registrationBean.setFilter(new MyFilter());
		registrationBean.addUrlPatterns("/hello");
		registrationBean.setOrder(1);
		
		return registrationBean;
		
	}
	
	
}
