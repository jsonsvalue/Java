package interface01;

public interface MyInterface {
	public void method1();
	
	
	//public static final이 생략된, 상수를 나타내는 방법이다.
	int NUMBER = 1;
	
	
	// public abstract를 생략해도 두 함수는 동일하다.
	public abstract void method();
	
	void method2();
	
}
