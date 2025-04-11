package com.ssafy.di;

import org.springframework.stereotype.Component;

//@Component
public class Laptop implements Computer{
	private String CPU;
	private String RAM;
	private String SSD;
	private String power;
	
	public String getInfo() {
		return "Notebook";
	}
	
	public static void main(String[] args) {
		
		
		
	}
}
