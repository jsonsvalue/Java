import java.util.*;

public class 그래프최소비용07_플로이드워셜 {
	static final int INF = Integer.MAX_VALUE;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int V = sc.nextInt();
		int E = sc.nextInt();
		
		int[][] dist = new int[V][V];
		
		for(int i=0; i < V; i++) {
			for(int j=0; j<V; j++) {
				if(i!=j)
					dist[i][j] = INF;
			}
			
		}
		
		// 입력을 받아서, 정점 간 간선 정보를 등록한다.
		for(int i=0; i < E; i++) {
			int s = sc.nextInt();
			int e = sc.nextInt();
			int cost = sc.nextInt();
			
			// 유향이기 때문에 해당되는 방향에 대해서만 입력 값을 받는다.
			dist[s][e] = cost;
		}
		
		// 경유지
		for(int k=0; k<V; k++) {
			// 출발지
			for (int i=0; i<V; i++) {
				// 출발지에서 경유지까지의 간선이 존재하지 않는다면, continue한다.
				if(dist[i][k] == INF)
					continue;
				// 도착지 
				for(int j = 0; j<V; j++) {
					// 경유지에서 도착지까지의 간선이 존재하지 않는다면, continue한다.
					if(dist[k][j] == INF)
						continue;
					// 출발지에서 도착지로 가는 거리보다 경유지를 통해서 가는 거리가 더 짧은 경우, 최단 거리를 갱신한다.
					dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
					
				}
			}
		}
		
		// 음수 사이클을 검사한다.
		boolean negativeCycle = false;
		
		for(int i=0; i<V; i++) {
			if(dist[i][i]<0) {
				negativeCycle = true;
				break;
			}
		}
		
		if(negativeCycle) {
			System.out.println("음의 사이클 존재");
		}else {
			for(int i=0; i<V; i++) {
				System.out.println(Arrays.toString(dist[i]));
			}
		}
		
		
		
		
		
	}
	
}

//플로이드 워셜 - 음의 사이클  X
//5 9
//0 1 3
//0 2 8
//0 4 -4
//1 3 1
//1 4 7
//2 1 4
//3 0 2
//3 2 -5
//4 3 6

//플로이등 워셜 - 음의 사이클 O
//4 5
//0 1 1
//0 3 4
//1 2 1
//2 0 -3
//3 2 2
