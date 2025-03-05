
public class Stack07_재귀함수 {
	static int cnt = 0;
	public static void main(String[] args) {
//		func1();
		func2(10);
		
	}
	
	public static void func1() {
		System.out.println("func1 호출"+ cnt++);
		func1();
	}
	
	public static void func2(int num) {
		// 재귀 끝내는 부분
		if(num<0) {
			return;
		}
		// 재귀 부분
		else {
			System.out.println("func2호출");
			System.out.println(cnt++);
			func2(num-1);
		}
		
	}
	
	
}
