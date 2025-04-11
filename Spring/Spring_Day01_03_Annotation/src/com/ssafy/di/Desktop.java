package com.ssafy.di;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer{
	private String CPU;
	private String RAM;
	private String SSD;
	private String power;
	
	
	//생성자
	public Desktop() {
		System.out.println("Desktop 만들었다");
	}
	
	public String getInfo() {
		return "Desktop";
	}
	
	public static void main(String[] args) {
		
		
		
	}
}
