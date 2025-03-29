import java.util.*;

public class 그래프탐색02_DFS_배열 {
	static int N;
	static int[][] map;
	static boolean[][] visited;
	
	static boolean esc = false;
	
	// 4방향 탐색
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = Integer.parseInt(sc.nextLine());
		map = new int[N][N];
		visited = new boolean[N][N];
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		
		dfs(0,0);
		System.out.println(esc);
	
	}
	
	public static void dfs(int x, int y) {
		// Base Case
		if(x==N-1 && y==N-1) {
			esc = true;
			return;
		}
		
		visited[x][y] = true;
		
		// Recursive Case
		for(int k=0; k<4; k++) {
			int nx = x+dx[k];
			int ny = y+dy[k];
			
			// 범위 내에 있고
			if(nx>=0 && nx<N && ny>=0 && ny<N) {
				// 벽이 아니고
				if(map[nx][ny]!=1) {
					// 방문 안했다면
					if(!visited[nx][ny]) {
						// 재귀함수를 호출한다.
						dfs(nx, ny);
					}
				
				}
				
			}
			
		}
		
		
	}

	
	
//8
//0 0 1 1 1 1 1 1
//1 0 0 0 0 0 0 1
//1 1 1 0 1 1 1 1
//1 1 1 0 1 1 1 1
//1 0 0 0 0 0 0 1
//1 0 1 1 1 1 1 1
//1 0 0 0 0 0 0 0
//1 1 1 1 1 1 1 1
	
	
}
