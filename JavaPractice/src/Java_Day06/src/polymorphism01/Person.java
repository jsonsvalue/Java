package polymorphism01;

public class Person {
	String name;
	int age;
	
	public Person() {
		// super(); 상위 클래스의 기본 생성자 호출 함수가 생략된다.(Object의 기본 생성자)
		
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	public void eat() {
		System.out.println("사람은 음식을 먹는다.");
	}

	
	// Object 클래스의 toString 메서드를 오버라이딩해서 쓴다.
	// Person 객체의 주소가 필요한 것이 아니라, 해당 객체의 변수에 대한 값이 필요하기 때문이다.
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}	
	
	
	
}
