package Inheritance04_overriding;

public class Person {
	String name;
	int age;
	
	public Person() {
		super();//Object의 기본 생성자를 호출한다.
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void eat() {
		System.out.println("음식을 먹는다.");
	}
	
}
