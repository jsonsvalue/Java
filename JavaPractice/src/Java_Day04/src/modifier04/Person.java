package modifier04;

public class Person {
	protected String name;
	protected int age;
	
	protected void info() {
		// 클래스 내부에 있으니, 클래스 내 메서드에서 클래스 내 변수 접근 가능.
		name = "Yang";
		
	}

}
