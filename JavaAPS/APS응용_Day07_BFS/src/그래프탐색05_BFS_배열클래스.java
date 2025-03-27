import java.util.*;

public class 그래프탐색05_BFS_배열클래스 {
	static int N;
	static int[][] map;
	static boolean[][] visited;
	
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0, -1,1};
	
	// distance배열을 따로 두지 않고, 클래스로 만듦으로써 distance를 처리한다.
	static class pos{
		int x, y, dist;
		
		public pos(int x, int y, int dist) {
			this.x = x;
			this.y = y;
			this.dist = dist;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		map = new int[N][N];
		visited = new boolean[N][N];
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		
		int ans = bfs(0,0);
			
		System.out.println(ans);

		
	}
	
	
	static int bfs(int x, int y) {
		Queue<pos> q = new LinkedList<>();
		q.add(new pos(x, y, 1));
		
		visited[x][y] = true;
		
		while(!q.isEmpty()) {
			pos curr = q.poll();
			
			// 도착 지점에 도달하면 끝낸다.
			if(curr.x == N-1 && curr.y==N-1) {
				return curr.dist;
			}
			
			for(int k=0; k<4; k++) {
				int nx = curr.x + dx[k];
				int ny = curr.y + dy[k];
				
				// 범위를 벗어나고
				if(nx<0 || nx>=N || ny<0|| ny>=N)
					continue;
				// 벽이 있거나 거리가 이미 결정 돼 있으면 제외한다.
				if(map[nx][ny]==1 || visited[nx][ny])
					continue;
				
				// 이동할 수 있는 곳이라면, 거리를 늘리고 queue에 추가한다.
				visited[nx][ny] = true;
				q.add(new pos(nx, ny, curr.dist + 1) );
					
			}
			
		
		}
		
		return -1;
		
		
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
