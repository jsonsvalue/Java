import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 그래프최소비용_다익스트라_배열 {
	
	static class Edge{
		int to, cost;
		public Edge(int to, int cost) {
			this.to = to;
			this.cost = cost;
		}
	}
	
	static final int INF = Integer.MAX_VALUE;
	static int V, E;
	static List<Edge>[] adj;
	static int[] dist;
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		V = sc.nextInt();
		E = sc.nextInt();
		adj = new ArrayList[V];
		
		for(int i=0; i<V; i++) {
			adj[i] = new ArrayList<>();
		}
		
		dist = new int[V];
		Arrays.fill(dist, INF);
		
		for(int i=0; i<E; i++) {
			int s = sc.nextInt();
			int e = sc.nextInt();
			int cost = sc.nextInt();
			
			adj[s].add(new Edge(e, cost));
			
		}
		
		dijkstra(0);
		
		System.out.println(Arrays.toString(dist));
		
		
	}


	static void dijkstra(int start) {
		boolean[] visited = new boolean[V];
		dist[start] = 0; // 시작 거리의 값을 0으로 갱신한다.
		
		
		for(int i=0; i < V; i++) {
			int min = INF;
			int idx = -1;
			
			// 1. 현재 정점과 연결된 정점들과의 최소 거리를, dist 배열에 저장한다.
			// 현재 정점과 연결된 정점 중 최소 거리를 가진 정점을 확인한다.
			for(int j = 0; j < V; j++) {
				if(!visited[j] && dist[j] < min) {
					min = dist[j];
					idx = j;
				}
			}
			
			visited[idx] = true;
			
			// 2. 최소 거리 갱신 작업
			// 현재 정점과 연결된 최소 거리를 가진 정점에서, 해당 정점과 연결된 노드를 통해서 갈 수 있는 다른 노드와의 거리를 찾고 최소 거리를 갱신한다.
			for(Edge e: adj[idx]) {
				// 현재 노드와 인접한 노드 중 방문하지 않았고, 특정 노드에서 도착 노드까지의 거리보다 다른 노드를 거쳤을 때의 거리가 더 짧으면 거리를 갱신한다.
				if(!visited[e.to] && dist[e.to] > dist[idx] + e.cost) {
					dist[e.to] = dist[idx] + e.cost;
				}
			}
		}
		
		
	}
	
//6 11
//0 1 4
//0 2 2
//0 5 25
//1 3 8
//1 4 7
//2 1 1
//2 4 4
//3 0 3
//3 5 6
//4 3 5
//4 5 12

	
	
}