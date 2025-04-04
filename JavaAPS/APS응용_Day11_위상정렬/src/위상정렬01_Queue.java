import java.util.*;

public class 위상정렬01_Queue {
	static String[] cook = { "", "재료구매", "양념장만들기", "고기재우기", "고기손질", "제육볶음만들기", "식사", "뒷정리", "채소손질", "밥하기" }; 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int V = sc.nextInt();// 정점의 개수
		int E = sc.nextInt();// 간선의 개수
		
		int[][] adj = new int[V+1][V+1]; // 인접 행렬
		int[] degree = new int[V+1]; // 진입 차수를 저장할 배열
		
		for(int i=0; i<E; i++) {
			int s = sc.nextInt();
			int e = sc.nextInt();
			
			// 유향 그래프
			adj[s][e] = 1;
			// 도착지의 진입 차수를 올려준다.
			degree[e]++;
		}
		
		// 정점의 번호를 관린한다.
		Queue<Integer> q = new LinkedList<>();
		// 1. 진입 차수가 0인 정점을 Queue에 넣는다.
		// 반복문 돌리는 순서에 따라, 위상 정렬의 노드 정렬 순서가 달라질 수 있다.
		for(int i=1; i <= V; i++) {
			if(degree[i] == 0)
				q.add(i);
		}
		
		// 2.노드와 연결된 노드와의 간선을 제거하고, 진입 차수가 0이 되면 새롭게 Queue에 넣는다.
		// Queue가 빌 때까지 반복한다.
		while(!q.isEmpty()) {
			int curr = q.poll();
			System.out.println(cook[curr]);
		
			// curr와 연결된 간선을 제거한다.
			for(int to=1; to < V+1; to++) {
				// 연결된 간선이 있는지 확인한다.
				if(adj[curr][to]==1) {
					// 연결된 간선이 있다면, 해당 노드의 선행작업을 처리했다는 의미로 진입 차수를 줄인다.
					degree[to]--;
					adj[curr][to] = 0;
					
					// 선행조건을 다 처리하면, 후행 작업의 노드를 추가한다.
					if(degree[to] == 0) {
						q.add(to);
					}
				}
			}
			
			
			
			
		}
		
		
		
		
	}
}

//9 9
//1 4
//1 8
//2 3
//4 3
//8 5
//3 5
//5 6
//9 6
//6 7
