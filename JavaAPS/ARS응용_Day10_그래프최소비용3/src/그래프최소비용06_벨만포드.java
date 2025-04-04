import java.util.*;

public class 그래프최소비용06_벨만포드 {
	static class Edge{
		int s, e, cost;
		
		public Edge(int s, int e, int cost) {
			this.s = s;
			this.e = e;
			this.cost = cost;
		}
	}
	
	static int[] dist;
	static final int INF = Integer.MAX_VALUE;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int V = sc.nextInt();
		int E = sc.nextInt();
		List<Edge> edges = new ArrayList<>();
		
		dist = new int[V];

		for(int i=0; i<E; i++) {
			int s = sc.nextInt();
			int e = sc.nextInt();
			int cost = sc.nextInt();
			
			edges.add(new Edge(s, e, cost));
						
		}
		
		
		bellmanFord(V, 0, edges);
		
		
	}
	
	// V: 전체 정점의 개수
	// start: 시작 정점
	// edges: 간선의 배열
	static void bellmanFord(int V, int start, List<Edge> edges) {
		// dist 배열을 초기화한다.
		Arrays.fill(dist, INF);
		dist[start] = 0;
		
		// 1.모든 간선을 V-1번 반복한다.
		for(int i=0; i<V-1; i++) {
			boolean flag = false;
			// 시작점이 무한대가 아닌 노드에 대해서만 처리한다.
			for(Edge edge: edges) {
				if(dist[edge.s] != INF && dist[edge.s] + edge.cost <dist[edge.e]) {
					dist[edge.e] = dist[edge.s] + edge.cost;
					flag = true;
				}
			}
			// 사이클을 다 돌았는데도 갱신이 안된다면, 조기 종료한다.
			if(!flag)
				break;
		
		}
		
		// 2. 음수 사이클을 확인한다.
		boolean negativeCycle = false;
		for(Edge edge:edges) {
			if(dist[edge.s]!= INF && dist[edge.s] + edge.cost < dist[edge.e] ) {
				negativeCycle = true;
				
			}
		}
		
		
		if(negativeCycle) {
			System.out.println("음의 사이클");
		}else {
			System.out.println(Arrays.toString(dist));
		}
		
	}
	
}

//벨만포드 예제 - 음의 사이클 X
//6 7
//0 1 4
//0 2 5
//1 3 -2
//2 4 8
//3 5 7
//4 2 -3
//4 5 6
//
//
//벨만포드 예제 - 음의 사이클 O
//
//4 4
//0 1 5
//1 2 -8
//2 1 3
//2 3 6
