import java.util.Arrays;
import java.util.Scanner;

public class 그래프최소비용_프림_반복문 {
	final static int INF = Integer.MAX_VALUE;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int V = sc.nextInt(); // 정점
		int E = sc.nextInt(); // 간선
		
		int[][] adj = new int[V][V];// 인접 행렬
		
		for(int i=0; i<E; i++) {
			int s = sc.nextInt();
			int e = sc.nextInt();
			int cost = sc.nextInt();
			
			// 무향 그래프
			adj[s][e] = adj[e][s] = cost;
		
		}
		
		
		int[] p = new int[V];    // 부모의 정보를 저장한다.
		int[] dist = new int[V]; // 각 노드에서부터 최소 거리를 저장하는 배열이다.
		boolean[] visited = new boolean[V]; // 현재 트리 소속인지를 기록한다.
		
		//1. dist 배열을 큰 값으로 초기화한다.
		for(int i=0; i<V; i++) {
			dist[i] = INF;
			p[i] = -1;
		}
		
		// 2.시작 정점을 고른다.
		dist[0] = 0;
		int result = 0;
		
		// 3.전체 반복문을 수행하면서, 정점을 뽑는다.
		for(int i=0; i<V; i++) {
			//3-1.각 정점에서의 가장 작은 거리를 가진 정점을 뽑는다.
			// 현재 최소 신장 트리에 추가될, 거리가 가장 짧은 새로운 정점을 찾는다.
			// 방문하지 않은 정점 중에서 dist[j] 가 가장 작은 정점 idx를 선택한다.
			int min = INF;
			int idx = -1;
			for(int j=0; j < V; j++) {
				// 방문을 하지 않았고, 해당 노드와 인접한 노드 중 최소 거리를 찾는다.
				if(!visited[j] && dist[j] < min) {
					min = dist[j];
					idx = j;
				}
			}
			
			visited[idx] = true;
			result += dist[idx];
			
			// 3-2. 가장 작은 정점을 뽑았으니, 해당 정점으로 노드를 갱신한다.
			// idx가 트리에 포함됐으니, idx를 통해 다른 정점과의 최소 거리 정보를 갱신한다.
			for(int j=0; j < V; j++) {
				// 해당 정점과 연결 돼 있는데 방문하지 않았으며, 갱신할 수 있는 정점을 찾는다.
				if(!visited[j] && adj[idx][j]!=0 && dist[j]> adj[idx][j]) {
					dist[j] = adj[idx][j];
					p[j] = idx; // 부모 정보를 갱신한다.
				}
			}
			
			
		}
		
		System.out.println(result);
		System.out.println(Arrays.deepToString(adj));
		System.out.println(Arrays.toString(dist));
		
		
		
		
		
		
		
		
	}
	
	
	
	
//7 11
//0 1 32
//0 2 31
//0 5 60
//0 6 51
//1 2 21
//2 4 46
//2 6 25
//3 4 34
//3 5 18
//4 5 40
//4 6 51
	
}

