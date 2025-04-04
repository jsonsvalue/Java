import java.util.Scanner;

public class 동적계획법03_배낭문제 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int W = sc.nextInt();
		
		int[] weights = new int[N+1];
		int[] cost = new int[N+1];
		
		for(int i=1; i<=N; i++) {
			weights[i] = sc.nextInt();
			cost[i] = sc.nextInt();	
		}
		
		int[][] dp = new int[N+1][W+1];
		
		for(int i=1; i<=N; i++) {
			
			
		}
		
		
		
	}
}
