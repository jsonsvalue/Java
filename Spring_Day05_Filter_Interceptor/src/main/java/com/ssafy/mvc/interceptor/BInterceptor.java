package com.ssafy.mvc.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//HandleInterceptor 인터페이스를 구현한다.
@Component
public class BInterceptor implements HandlerInterceptor{
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// Controller를 가기 전에 요청을 처리할지 여부를 결정한다.
		
		System.out.println("A: preHandle");
		return true;
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// Controller를 거쳤기 때문에, ModelAndView 값을 매개변수로 받는다.
		// Controller에서 예외 발생 시, 미실행 된다.
		System.out.println("A: PostHandle");
		
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// View가 전달된 후에 실행된다.
		// 예외가 발생될 때의 변수를 전달한다.
		System.out.println("A:After");
		
		
	}
	
}
