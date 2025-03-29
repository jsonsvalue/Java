import java.util.*;

public class 그래프_03_인접행렬 {
	
	static class Edge{
		int A, B, W;
		
		public Edge(int a, int b, int w) {
			A = a;
			B = b;
			W = w;
			
		}		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// V,E의 개수를 입력 받는다.
		int V = sc.nextInt(); // 정점의 개수
		int E = sc.nextInt(); // 간선의 개수
		
		Edge[] edges = new Edge[E];// 간선의 배열(객체 배열)
		
		for(int i = 0; i < E; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int W = sc.nextInt(); // 가중치
			
			// adjArr[A][B] = adjArr[B][A] = W;
			edges[i] = new Edge(A, B, W);	
		}		
		
		
		/*
		 * List<Edge> edges2 = new ArrayList<>(); for(int i=0; i<E; i++) {
		 * edges2.add(new Edge(sc.nextInt(), sc.nextInt(), sc.nextInt())); }
		 */
		
		
		// 2차원 배열을 이용하여 저장해보자
		// 간선의 정보가 전부 정수일 때 표현 가능
		int[][] edges3 = new int[E][3];// [0]: 시작 정점, [1]: 끝 정점, [2]: 가중치
		for(int i=0; i<E; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int W = sc.nextInt();
			
			edges3[i][0] = A;
			edges3[i][1] = B;
			edges3[i][2] = W;	
			
		}
		
		
		
		
		
		
		
		
		
	}
	
}
