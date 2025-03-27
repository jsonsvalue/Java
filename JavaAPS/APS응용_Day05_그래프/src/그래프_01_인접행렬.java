import java.util.*;

public class 그래프_01_인접행렬 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// V,E의 개수를 입력 받는다.
		int V = sc.nextInt(); // 정점의 개수
		int E = sc.nextInt(); // 간선의 개수
		
		int[][] adjArr = new int[V][V]; // 시작 정점이 1이라면, V+1로 만드는 것이 코드 짜기 편하다.
		
		for(int i = 0; i < E; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int W = sc.nextInt(); // 가중치
			
			adjArr[A][B] = 1;
			adjArr[B][A] = 1;
			
			// adjArr[A][B] = adjArr[B][A] = W;
				
		}
		
		
		
		
		
		
		
		
	}
	
}
