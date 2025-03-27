import java.util.*;

public class 그래프탐색04_BFS_배열 {
	static int N;
	static int[][] map;
	static int[][] dist;
	static boolean[][] visited;
	static boolean result = false;
	
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0, -1,1};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		map = new int[N][N];
		dist = new int[N][N];
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		
		bfs(0,0);
		System.out.println(dist[N-1][N-1]);
		
	}
	
	
	static void bfs(int x, int y) {
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {x, y});
		
		dist[x][y] = 1;
		
		while(!q.isEmpty()) {
			int[] curr = q.poll();
			
			// 도착 지점에 도달하면 끝낸다.
			if(curr[0]== N-1 && curr[1]==N-1) {
				return;
			}
			
			for(int k=0; k<4; k++) {
				int nx = curr[0] + dx[k];
				int ny = curr[1] + dy[k];
				
				// 범위를 벗어나고
				if(nx<0 || nx>=N || ny<0|| ny>=N)
					continue;
				// 벽이 있거나 거리가 이미 결정 돼 있으면 제외한다.
				if(map[nx][ny]==1 || dist[nx][ny]!=0)
					continue;
				
				// 이동할 수 있는 곳이라면, 거리를 늘리고 queue에 추가한다.
				dist[nx][ny] = dist[curr[0]][curr[1]] + 1;
				q.add(new int[] {nx,ny} );
					
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
//1 1 1 1 1 1 1 0
	
	
	
}
