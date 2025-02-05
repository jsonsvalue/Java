package test05_객체직렬화;

import java.io.*;

//직렬화를 위한 serializable 인터페이스 상속한다.
public class Person implements Serializable{
	
	//private static final long serialVersionUID = 10000000000L;// 그냥 숫자를 쓰면 int 형으로 처리된다.
	private static final long serialVersionUID = 1;
	
	
	private String name;
	private int age;
	public Person(String string, int i) {
		this.name = string; 
		this.age = i;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}
