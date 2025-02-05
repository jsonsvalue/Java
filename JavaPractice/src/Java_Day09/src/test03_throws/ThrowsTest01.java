package test03_throws;

// Checked 예외를 발생시키면, 컴파일 시점에 잡힌다.

public class ThrowsTest01 {
	public static void main(String[] args) {
		// 여기에서도 예외를 다른 곳에서 처리하도록 할 수 있다.
		try {
			method1();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("이것도 실행하니?");
	}
	
	public static void method1() throws ClassNotFoundException {
		method2();
	}
	
	public static void method2() throws ClassNotFoundException {
		// Checked 계열의 Exception을 발생시켜보자.
		// 2 가지 선택
		// 1. 직접 처리하는 방법(try-catch)
		// 2. 내가 처리하는 것이 아닌 나를 부른 함수에서 예외를 처리하도록 만드는 것이다.(throw)
		Class.forName("HelloThereMotherFucker");
		
		
		
	}
	
}
