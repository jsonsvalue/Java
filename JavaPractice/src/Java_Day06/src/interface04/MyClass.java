package interface04;

public class MyClass implements MyInterface, MyInterface2 {
	
	@Override
	public void method1() {
		System.out.println("두개의 인터페이스 default 메서드가 충돌나서 재정의한다.");
	}
	
	@Override
	public void method2() {
		System.out.println("클래스에서 재정의한 메서드");
	}
	
	@Override
	public void method3() {
		System.out.println("이건 클레스 메서드");
	}
	
	
}
