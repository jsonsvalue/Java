import java.util.*;

public class 그래프탐색_01_DFS {
	static int V, E;
	static int[][] adj;
	static boolean[] visited;
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		V = sc.nextInt();
		E = sc.nextInt();
		
		adj = new int[V+1][V+1];
		visited = new boolean[V+1];
		
		// 간선 입력
		for(int i=0; i<E; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			adj[A][B] = 1;
			adj[B][A] = 1;
		}
		
		
		dfs(1);
		System.out.println("------");
		dfsStack(1);
		
	}
	
	// v: 현재 방문하고 있는 정점
	static void dfs(int v) {
		visited[v] = true;
		System.out.println(v);
		
		for(int i=1; i<=V; i++) {
			// 방문했는지 여부를 확인한다.
			if(!visited[i] && adj[v][i]==1) {
				dfs(i);
			}
			
		}
		
		
	}
	
	// v: 시작 정점
	static void dfsStack(int v) {
		// 정점만 담을 것이다.
		Stack<Integer> s = new Stack<>();
		visited = new boolean[V+1];
		
		s.push(v);
		
		while(!s.isEmpty()) {
			int curr = s.pop();
			
			if(!visited[curr]) {
				visited[curr] = true;
				System.out.println(curr);
				
				// 방문 안한 노드가 있다면, Stack에 넣는다.
				for(int i=V; i>0; i--) {
					if(!visited[i] && adj[curr][i]==1) {
						s.push(i);
					}
					
				}
			}
			
		}
		
		
		
		
	}
	
	
//	7 9
//	1 2
//	1 3
//	1 6
//	2 4
//	2 7
//	3 4
//	4 7
//	5 6
//	5 7
}
