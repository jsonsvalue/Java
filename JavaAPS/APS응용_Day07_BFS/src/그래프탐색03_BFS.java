import java.util.*;

public class 그래프탐색03_BFS {
	static int V, E; 
	static List<Integer>[] adj; //인접 리스트 
	static boolean[] visited;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		V = sc.nextInt();
		E = sc.nextInt();
		
		adj = new ArrayList[V+1];
		
		for(int i=1; i<=V; i++) {
			adj[i] = new ArrayList<>();
		}
		
		visited = new boolean[V+1];
		
		for(int i=0; i<E; i++) {
			int A = sc.nextInt();
			int B= sc.nextInt();
			
			adj[A].add(B);
			adj[B].add(A);
			
		}
		
		bfs(4);
		
	}
	
	static void bfs(int v) {
		Queue<Integer> q = new LinkedList<>();
		
		// 넣음과 동시에 방문 확인을 해야 중복이 일어나지 않는다.
		q.add(v);
		visited[v] = true;
		
		while(!q.isEmpty()) {
			int curr = q.poll();
			System.out.println(curr);
			
			//나와 인접한 노드 중 방문하지 않는 노드를 방문한다.
			for(int i=0; i<adj[curr].size(); i++) {
				int w = adj[curr].get(i);
				if(!visited[w]) {
					q.add(w);
					visited[w] = true;
				}	
			}	
		}
	}

	
//7 9
//1 2
//1 3
//2 4
//3 4
//2 7	
//4 7	
//5 6
//5 7
//1 6
}
