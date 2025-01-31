package polymorphism01;

class Parent {
	String x= "parent";

	public String method() {
		return "Parent method";
	}
	
	public static String method2() {
		return "Static Parent method";
	}
	
}

class Child extends Parent{
	String x = "child";
	
	public String method() {
		return "Child method";
	}
	
	public static String method2() {
		return "Static Child method";
	}
}

public class BindingTest {
	public static void main(String[] args) {
		Parent p = new Child();
		Child c = new Child();
		
		System.out.println(p.x);
		System.out.println(c.x);
		
		// 동적 바인딩(Dynamic Binding)은 인스턴스 메서드가 실행되는데, 
		// 참조자료형과 상관 없이 상위 객체 타입의 메서드를 오버라이드 한 하위 객체 클래스의 메서드가 실행된다.
		System.out.println(p.method());
		System.out.println(c.method());
		
		// 정적 바인딩(Static Binding)은 말 그대로 클래스 메서드로서, 
		// 실제 객체 타입과 관계 없이 선언된 클래스의 메서드가 실행된다.
		System.out.println(p.method2());
		System.out.println(c.method2());
		
	}
}

