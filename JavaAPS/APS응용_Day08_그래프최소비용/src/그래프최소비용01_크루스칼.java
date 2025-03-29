import java.util.*;

public class 그래프최소비용01_크루스칼 {
	static int[] p;
	static int[] rank;

	public static void main(String[] args) {
		// 간선을 저장한다.
		// 1. Edge 클래스를 생성한다.
		// 2. int[]

		Scanner sc = new Scanner(System.in);

		int V = sc.nextInt();
		int E = sc.nextInt();

		Edge[] edges = new Edge[E];
		
		// int[][] edges2 = new int[E][3];

		for (int i = 0; i < E; i++) {
			int s = sc.nextInt();
			int e = sc.nextInt();
			int cost = sc.nextInt();

			edges[i] = new Edge(s, e, cost);
			// edges2[i] = new int[] {s, e, cost};
		}

		// 1. 가중치 기준으로 오름차순으로 정렬한다.
		Arrays.sort(edges);

		for (Edge e : edges) {
			System.out.println(e);
		}

		// 2. 사이클을 형성하지 않는 V-1개의 간선을 뽑는다.
		// 서로소 집합(Union-Find)

		p = new int[V];

		// make-set을 통해서 각자 본인이 대표가 되도록 초기화 한다.
		for (int i = 0; i < V; i++) {
//			makeSet(i);
			p[i] = i;
		}

		// 내가 뽑은 개수를 관리하는 변수이다.
		int tot = 0;
		int pick = 0;
		for (int i = 0; i < E; i++) {
			int s = edges[i].s;
			int e = edges[i].e;
			
			int px = findSet(s);
			int py = findSet(e);
			
			// 사이클 검사를 수행한다.
//			if (findSet(s) != findSet(e)) {
			if (px != py) {
			// 서로 다른 노드 그룹을 합친다.
			// 해당 간선을 뽑았다.
				union(px, py);
				pick ++;
				tot += edges[i].cost;
				
			}
			
			if(pick == V-1)
				break;	
		}
		
		System.out.println(tot);

	}

	static void union(int x, int y) {
		// rank를 고려하고 있지는 않다.
		
		p[findSet(y)] = findSet(x);
		
		p[y] = x;
		
		
	}

	static int findSet(int x) {		
		  if(x==p[x]) 
			  return x;
		  
		  return findSet(p[x]);
		 

//		if (x != p[x])
//			p[x] = findSet(p[x]);
//
//		return p[x];

	}

	private static void makeSet(int i) {
		// TODO Auto-generated method stub

	}

	static class Edge implements Comparable<Edge> {
		int s, e, cost;

		public Edge(int s, int e, int cost) {
			this.s = s;
			this.e = e;
			this.cost = cost;
		}

		@Override
		public String toString() {
			return "Edge [s=" + s + ", e=" + e + ", cost=" + cost + "]";
		}

		@Override
		public int compareTo(그래프최소비용01_크루스칼.Edge o) {
			return this.cost - o.cost;
		}

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
