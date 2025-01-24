package Inheritance03_Super;

public class Student extends Person {
	String major;
	
	public Student() {
		super();// 부모의 기본 생성자를 호출한다.
	}
	
//	public Student(String name, int age, String major) {
//		super();// 부모의 기본 생성자를 부르고, 그 뒤에 필드의 변수값을 참조한다.
//		this.name = name;
//		this.age = age;
//		this.major = major;
//	}
	
	public Student(String name, int age, String major) {
		super(name, age);// 부모의 기본 생성자를 부르고, 그 뒤에 필드의 변수값을 참조한다.
		this.major = major;
}
	
	
	public void study() {
		System.out.println("공부를 한다.");
	}
	
}
