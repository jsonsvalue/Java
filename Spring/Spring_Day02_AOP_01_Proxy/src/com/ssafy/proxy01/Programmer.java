package com.ssafy.proxy01;

import java.util.Random;

public class Programmer {
	
	
	// 프로그래머의 일상
	public void coding() {
		System.out.println("커피를 마신다.");
		
		
		try{
			// 핵심 관심 사항
			System.out.println("코드를 작성한다.");
			
			if(new Random().nextBoolean())
				throw new DiseaseException();
			
			// 정상적으로 종료가 됐을 때 실행되는 코드이다.
			System.out.println("Git push한다.");
				
		}
		catch(DiseaseException e) {
			// 예외에 대한 처리
			e.handleException();
			System.out.println("집에 간다.");
			System.out.println("옆에 동료에게 일을 맡긴다.");
			
		}finally {
			// 가장 마지막으로 처리되는 코드
			System.out.println("집에 가서 잔다.");
			
		}
		
	}
	
	
}
