import java.util.*;

public class 그래프_02_인접행렬 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// V,E의 개수를 입력 받는다.
		int V = sc.nextInt(); // 정점의 개수
		int E = sc.nextInt(); // 간선의 개수
		
		List<Integer>[] adjList = new ArrayList[V];
		// Null Point Exception이 나오지 않게, adjList에 미리 List 객체를 선언해야 한다.
		for(int i=0; i<V; i++) {
			adjList[i] = new ArrayList<>();
		}
		
		for(int i = 0; i < E; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			adjList[A].add(B);
			adjList[B].add(A);
			// adjArr[A][B] = adjArr[B][A] = W;
				
		}
		
		
		
		
		
		
		
		
		
		
	}
	
}
