import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 그래프최소비용02_크루스칼_배열 {
	// 크루스칼 알고리즘에서 Minimum Spanning Tree의 최소 거리를 구하는 데 있어서 가장 핵심적인 개념은, 
	// findSet에서 서로 다른 부모를 가진 경우 Spanning Tree에 노드를 Union을 이용해서 추가한다는 논리이다.
	
	// 그러기 위해서는 MakeSet을 통해서 각 노드의 부모 정보를 저장하는 배열을 만들고, 
	// 각 노드에서의 부모 정보를 findSet을 통해서 갱신한다.

	// 그리고 findSet을 통해 갱신한 부모 정보 배열에서, 
	// 서로 다른 부모일 때만 Union을 통해서 오름차순으로 정렬된 최소 거리에 해당되는 노드를 Spanning Tree에 추가해서 최소 거리를 합한다. 
	
	static int[] p; 	// 각 노드의 대표를 저장하는 배열이다.
	static int[] rank;  // 균형 있는 트리를 만들기 위한 배열이다.
	final static int COST = 2;
	
	// 간선을 저장하는 방식
	// 1. Edge 클래스를 생성한다.
	// 2. int[]
	
	static class Edge{
		int s, e, cost;
		
		public Edge(int s, int e, int cost) {
			this.s = s;
			this.e=e;
			this.cost = cost;
		}

		@Override
		public String toString() {
			return "Edge [s=" + s + ", e=" + e + ", cost=" + cost + "]";
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int V = sc.nextInt(); // 정점의 개수 (시작번호 확인)
		int E = sc.nextInt(); // 간선의 개수 
		
		Edge[] edges = new Edge[E];
		
		int[][] edges2 = new int[E][3]; //배열에 s, e, cost를 저장한다. 
		
		// 간선의 값을 입력 받는다.
		for(int i=0; i<E; i++) {
			int s = sc.nextInt();
			int e = sc.nextInt();
			int cost = sc.nextInt();
			
			edges[i] = new Edge(s, e, cost);
			edges2[i] = new int[] {s, e, cost};
			
		}
		
		//1. 비용 기준으로 오름차순으로 정렬을 한다.
		Arrays.sort(edges2, (o1,o2) -> o1[COST]- o2[COST]);
		
		// Arrays.sort(edges, Comparator.comparing(o -> o.cost));
		
		System.out.println(Arrays.deepToString(edges2));
		
		// 2. V-1개의 간선을 뽑아서, findSet을 통해서 서로 다른 트리인지를 확인하고 서로 다른 트리라면 union을 통해서 합친다.
		p = new int[V];
		
		//Make-set을 통해서 각 정점이 대표가 되도록 초기화한다.
		makeSet(V);
		
		int acc = 0;  // 누적 비용을 관리하기 위한 변수이다. 
		int pick = 0; // 몇개의 정점을 뽑았는지 확인하기 위한 변수이다.
		for(int i=0; i<E; i++) {
			int s = edges2[i][0];
			int e = edges2[i][1];

			// 같은 트리인지 확인한다.
			if(findSet(s) != findSet(e)) {
				// 서로 다른 트리라면 union을 통해서 합친다.
				// 합쳤다는 것은 최소 거리를 계산하는 데 정점을 뽑았다는 말이기 때문에, 뽑은 정점의 개수를 늘리고 acc에 비용을 더한다.
				union(s,e);
				pick++;
				acc += edges2[i][2];
			}
			
			if(pick == V-1)
				break;
			
		}
		
		
		System.out.println(acc);
		
		
	}
	

	static void makeSet(int V) {
		for(int i=0; i<V; i++) {
			p[i] = i;
		}
	}
	
	static int findSet(int x) {
		// x의 부모가 자기 자신이라면, 자기 자신을 반환하고
		// 그렇지 않다면 자기 자신의 부모를 찾을 때까지 재귀함수를 호출한다.
		/*
		 * if(x == p[x]) return x;
		 * 
		 * return findSet(p[x]);
		 */
		
		// 경로 압축을 통해서, 부모를 찾는 과정을 줄인다.
		// 자기 자신이 부모가 아니라면, 자기 자신의 최종 루트 부모가 호출될 때까지 재귀함수를 호출하고 루트 노드를 해당 노드의 부모로 저장한다.
		if(x != p[x]) {
			p[x] = findSet(p[x]);
		}
		
		return p[x];
	
	}
	
	static void union(int x, int y) {
		// Rank를 고려하지 않는 구현 방식
		// y의 부모로 x를 선언한다.
		p[findSet(y)] = findSet(x);
		
		// p[y] = x;
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
