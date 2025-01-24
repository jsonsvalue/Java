package Inheritance04_overriding;

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
	
	// Method overriding
	// 코드의 가독성을 높이기 위해서, Annotation을 추가한다.
	// 상속 관계에서 사용할 수 있다.
	// 부모 클래스에 정의된 메서드와 동일해야 한다.(메서드 이름, 매개변수, 반화타입 즉 동일한 함수를 덮어쓰는 것만 가능하다.)
	@Override
	public void eat() {
		System.out.println("지식을 배운다.");
	}
	
	// Method Overloading
	// 동일한 함수를 다른 자료형을 입력 받아서, 여러 개의 함수를 만든다.
	// 반환 타입만 다른 것은, Method Overloading에 해당되지 않는다.
	public void eat(int time) {
		System.out.println(time+ "시간만큼 배웠습니다.");
	}
	
	public String info() {
		return name+":"+age;
	}
	
	@Override
	public String toString() {
		return "Student [major=" + major + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
}
