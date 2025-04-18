package com.ssafy.mvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.BeanNameViewResolver;

@Configuration
public class JavaConfig {
	
	@Bean
	public BeanNameViewResolver beanNameViewResolver() {
		// 등록한 bean이 최우선순위로 실행되도록 한다.
		BeanNameViewResolver beanNameViewResolver = new BeanNameViewResolver();
		beanNameViewResolver.setOrder(0);
		return beanNameViewResolver;
	}
	
}
