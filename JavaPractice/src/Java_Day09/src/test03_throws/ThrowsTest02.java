package test03_throws;

// Unchecked 예외를 발생시키면, 컴파일 시점에 잡힌다.

public class ThrowsTest02 {
	public static void main(String[] args) {
		// 여기에서도 예외를 다른 곳에서 처리하도록 할 수 있다.
		try {
			method1();
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println("수학적 오류 발생");
		}
		System.out.println("Main까지 실행되냐");
		//System.out.println("이것도 실행하니?");
	}
	
	public static void method1()  {
		method2();
	}
	
	public static void method2()  {
		// Unchecked 계열의 Exception을 발생시켜보자.
		// 2 가지 선택
		// 1. 직접 처리하는 방법(try-catch)
		// 2. 내가 처리하는 것이 아닌 나를 부른 함수에서 예외를 처리하도록 만드는 것이다.(throw)
		// 0으로 나누는 것은 허용되지 않는다.
		
		int i = 1/0;
		
		
	}
	
}
