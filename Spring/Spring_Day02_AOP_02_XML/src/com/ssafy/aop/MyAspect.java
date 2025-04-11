package com.ssafy.aop;

import org.aspectj.lang.ProceedingJoinPoint;

// 공통 부가 기능을 저장할 클래스의 단위이다.
// 핵심 기능에 붙일 각각의 부가 기능 함수를 만든다.
public class MyAspect {
	
	
	public void before() {
		System.out.println("컴퓨터를 키고 커피를 한잔한다.");
	}
	
	// 정상적으로 코드가 실행됐을 때의 코드를 처리한다.
	public void afterReturning(Integer num) {
		System.out.println(num+" 시간을 투자한 코드를 Git Commit 한다.");
	}
	
	// 예외처리에 대한 코드를 실행한다.
	public void afterThrowing(Throwable th) {
		if(th instanceof DiseaseException) {
			((DiseaseException) th).handleException();	
		}
	}
	
	public void after() {
		System.out.println("침대에서 퍼질러 잔다.");
	}
	
	///////////////////////////////////////////////
	// 한번에 전체 코드를 실행하고 싶을 때, around 함수를 쓴다.
	public void around(ProceedingJoinPoint pjt) {
		//System.out.println("컴퓨터를 키고 커피 한잔을 때려 박는다.");
		this.before();
		
		// 실행 전 코드
		// 핵심 부가 기능 코드가 처리된다.
		try {
			int num = (int)pjt.proceed();
			this.afterReturning(num);
			
		}catch(Throwable e) {
			this.afterThrowing(e);
			
		}finally {
			this.after();
		}
		
		
		
	}
	
	
	
}


