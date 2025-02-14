import java.util.*;

public class Stack09_피보나치_2 {
	static int[] count= new int[100];
	
	public static void main(String[] args) {
		System.out.println(fibo2(5));
		//System.out.println(Arrays.toString(count));
	}	
	
	// 이미 계산된 값을 다시 계산하지 않는 방식을 채택한다.
	static int[] memo = new int[50];
	static {
		memo[0] = 0;
		memo[1] = 1;
		
	}
	
	public static int fibo2(int n) {
		// 인덱스가 2번째 이상이라서 피보나치 수열을 계산해야 하고, memo 값 중 계산하지 않는 값이 있다면 memo 배열에 계산한다.
		if(n>=2 && memo[n] == 0) {
			memo[n] = fibo2(n-1) + fibo2(n-2);
		}
		return memo[n];
		
	}
	
}
