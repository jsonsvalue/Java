import java.util.Arrays;

public class 순열03_방문체크 {
	static int[] nums;
	static int N;
	static int[] result;
	static boolean[] visited;

	public static void main(String[] args) {
		nums = new int[] {0, 1, 2};
		N = nums.length;
		
		result = new int[N];
		visited = new boolean[N];
		
		perm(0);
	}
	
	static void perm(int idx) {
		// 기저 조건
		if(idx == N) {
			System.out.println(Arrays.toString(result));
			return;
		}
		
		// 재귀 부분
		for(int i = 0; i<N; i++) {
			// 사용하지 않은 원소를 사용한다.
			// 1. 사용했으면 방문처리 한다.
			if(visited[i])
				continue;
			result[idx] = nums[i];
			visited[i] = true;
			perm(idx+1);
			// 원상복구한다.
			result[idx] = 0;
			visited[i] = false;
			
			
				
			
		}
			
	}
	
	
		
		
}
