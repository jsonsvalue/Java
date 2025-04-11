package com.ssafy.proxy02;

import java.util.Random;

public class PersonProxy implements Person{
	
	// Proxy 객체에 주입할 Person
	private Person person;
	
	// 설정자 주입
	public void setPerson(Person person) {
		this.person = person;
	}
	
	@Override
	public void coding() {
		// TODO Auto-generated method stub
		
		System.out.println("커피를 마신다.");
		
		
		try{
			// 해당되는 사람에 맞는 코드를 실행한다.
			person.coding();
			
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
