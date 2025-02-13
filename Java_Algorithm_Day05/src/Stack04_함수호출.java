
public class Stack04_함수호출 {
	public static void main(String[] args) {
		System.out.println("Main 실행");
		func1();
		System.out.println("Main 종료");
	}
	
	static void func1() {
		System.out.println("func1 실행");
		func1();
		System.out.println("func1 종료");
	}
	
	static void func2() {
		System.out.println("func2 실행");
		System.out.println("func2 종료");
	}
	
}
