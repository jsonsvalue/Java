import java.util.*;

public class Stack09_피보나치 {
	public static void main(String[] args) {
		System.out.println(fibo(1));
		System.out.println(fibo(2));
		System.out.println(fibo(3));
	}
	
	public static int fibo(int n) {
		// 피보나치 수열이 1부터 시작할 수 있게 변수 수정
		if(n==1)
			return n;
		else if(n<1)
			return 0;
		// fibo(n) = fibo(n-1) + fibo(n-2)
		// 0, 1, 1, 2, 3, 5
		return fibo(n-1) + fibo(n-2);
		
	}
	
	
	
}
