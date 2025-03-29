import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 그래프최소비용_프림_우선순위큐 {
	final static int INF = Integer.MAX_VALUE;
	
	static class Edge implements Comparable<Edge>{
		int to, cost;
		
		public Edge(int to, int cost) {
			this.to = to;
			this.cost = cost;
		}
		
		@Override
		public int compareTo(Edge o) {
			return this.cost - o.cost;
		}
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int V = sc.nextInt(); // 정점
		int E = sc.nextInt(); // 간선
		
		List<Edge>[] adj = new ArrayList[V]; // 인접 리스트
		
		for(int i=0; i<V; i++) {
			adj[i] = new ArrayList<>();
		}
		
		for(int i=0; i<E; i++) {
			int s = sc.nextInt();
			int e = sc.nextInt();
			int cost = sc.nextInt();
			
			// 무향 그래프
			adj[s].add(new Edge(e, cost));
			adj[e].add(new Edge(s, cost));
		
		}
		
		int result = 0;
		PriorityQueue<Edge> pq = new PriorityQueue<>();
		boolean[] visited = new boolean[V]; // 현재 트리 소속인지를 기록한다.
		
		// 0번을 골랐으니, 0번과 연결 돼 있는 간선을 다 넣는다.
		int pick = 1;
		visited[0] = true;
		
		for(int i=0; i<adj[0].size(); i++) {
			pq.add(adj[0].get(i));
			
		}
		
		/*
		 * for(Edge e: adj[0]) { pq.add(e); }
		 */
		
		// 최초 정점에서 정점을 하나씩 추가해서, 해당 정점과 연결된 정점 중 최소 거리의 정점을 뽑는다.
		// 최소 거리의 정점에 연결된 정점을 모두 뽑고, 해당 과정을 다시 반복한다.
		while(pick < V) {
			Edge e = pq.poll();
			if(visited[e.to])
				continue;
			
			result += e.cost;
			visited[e.to] = true;
			pick++;
			
			pq.addAll(adj[e.to]);
		}
		
		
		
		System.out.println(result);
		// System.out.println(Arrays.deepToString(adj));
		
		
		
		
		
		
		
		
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

