package interface04;

public interface MyInterface {
	default void method1() {
		System.out.println("default method");
	}
	
	default void method2() {
		System.out.println("기본 메서드");
	}
	
	default void method3() {
		System.out.println("static method");
	}
	
	
	
}
