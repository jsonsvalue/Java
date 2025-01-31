package polymorphism01;

public class Student extends Person {
	String major;
	
	public Student() {
		
	}
	
	public Student(String name, int age, String major) {
		super(name, age);// 상위 클래스의 기본 생성자를 호출한다.
		this.major = major;
	}
	
	@Override
	public void eat() {
		System.out.println("학생은 지식을 먹는다.");
	}
	
	public void study() {
		System.out.println("학생은 공부를 한다.");
	}

	@Override
	public String toString() {
		return "Student [major=" + major + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}
