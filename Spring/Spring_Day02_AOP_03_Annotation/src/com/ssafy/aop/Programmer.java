package com.ssafy.aop;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class Programmer implements Person{
	
	
	// 프로그래머의 일상
	public int coding() throws DiseaseException {
		// 핵심적인 부가적인 기능에 대한 코드만 짜면 된다.
		// 그 외 겹치는 부가적인 기능은 어차피 다른 하나의 파일에 관리한다.
		System.out.println("프로그래머는 코드를 작성한다.");
		
		if(new Random().nextBoolean())
			throw new DiseaseException();
		
		return (int)(Math.random() * 10) + 1;
	}
	
	
	
	
	
}


