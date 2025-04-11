package com.ssafy.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("p")
public class Programmer {
	private String name;
	private int age;
	
	// Desktop 클래스를 가져와서 쓴다.
	private Computer computer;
		
	public Programmer() {
	}
	
	// 생성자 주입
	@Autowired
	public Programmer(Computer comp) { 
	   this.computer = comp;
	}
	
	// 설정자 주입
	// 서로 다른 자료형의 Computer를 받기 위해, 각 자료형에 부합하는 객체일 때만 의존성을 주입한다.
	// 즉, 해당되는 자료형의 객체일 때만 의존성을 주입받게 Qualifier Annotation을 쓴다.
//	@Autowired 
//	public void setComputer(@Qualifier ("laptop")Computer computer) {
//		this.computer = computer;
//	}
	 


	public void coding() {
		System.out.println(computer.getInfo()+"으로 개발할게");
	}


}



