import java.util.*;

public class 동적계획법01_피보나치 {
	static int[] memo;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();		
		
		memo = new int[1000];
		Arrays.fill(memo, -1);
		memo[0]= 0;
		memo[1] = 1;
		
		System.out.println(fibo1(N));
		System.out.println(fibo2(N));
		System.out.println(fibo3(N));
		
		
	}
	
	// 피보나치 수열을 구하는 데 있어서 중복 호출이 너무 많이 일어난다.
	static int fibo1(int n) {
		if(n<=1)
			return n;
		
		return fibo1(n-1) + fibo1(n-2);
		
	}
	

	
	static int fibo2(int n) {
		if(memo[n]==-1) {
			memo[n] = fibo2(n-1)+ fibo2(n-2);
		}
		
		return memo[n];
	}
	
	
	static int fibo3(int n) {
		int[] dp = new int[n+1];
		dp[0] = 0;
		dp[1] = 1;
		for(int i=2; i<=n; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		
		return dp[n];
		
		
		
	}
	
}
