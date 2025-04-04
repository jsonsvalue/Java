import java.util.*;

public class 위상정렬02_Stack {
	static String[] cook = { "", "재료구매", "양념장만들기", "고기재우기", "고기손질", "제육볶음만들기", "식사", "뒷정리", "채소손질", "밥하기" }; 
	static int V,E;
	static List<Integer>[] adj;
	static boolean[] visited;
	static Stack<Integer> ans;
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int V = sc.nextInt();// 정점의 개수
		int E = sc.nextInt();// 간선의 개수
				
		List<Integer>[] adj = new ArrayList[V+1];
		for(int i=0; i<V+1; i++) {
			adj[i] = new ArrayList<>();
		}
		
		visited = new boolean[V+1];  // 방문 여부를 확인하는 배열을 만든다.
		int[] degree = new int[V+1]; // 진입 차수를 저장할 배열이다.
		ans = new Stack<>();
		
		for(int i=0; i<E; i++) {
			int s = sc.nextInt();
			int e = sc.nextInt();
			
			// 유향 그래프
			adj[s].add(e);
			// 도착 정점의 진입 차수를 올려준다.
			degree[e]++;
		}
		
		
	
		for(int i=1; i<V+1; i++) {
			if(degree[i]==0) {
				dfs(i);
			}
		}
		
		// 스택에 넣은 노드를 역순으로 출력한다.
		while(!ans.isEmpty()) {
			System.out.println(cook[ans.pop()]);
		}
			
	}

	// v: 현재 내가 방문하고 있는 노드
	static void dfs(int v) {
		visited[v] = true;
		
		for(int to:adj[v]) {
			// v와 연결된 to 노드를 하나씩 확인한다.
			if(!visited[to]) {
				dfs(to);
			}
		}
		
		// DFS 로 방문 가능한 노드를 다 순회해서 순서를 만족시켰다면, 해당 노드를 스택에 넣는다. 
		ans.push(v);
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
