package com.ssafy.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDay09DynamicSQLTXSpringApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDay09DynamicSQLTXSpringApplication.class, args);
		
//		for(String name:context.getBeanDefinitionNames()) {
//			System.out.println(name);
//		}
		
	}

}
