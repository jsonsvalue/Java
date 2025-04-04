import java.util.*;

public class 등산로조정 {
	static int N, K, maxH, ans;
	static int[][] arr;
	static boolean[][] visited;
	
	static int[] dx = {-1,1, 0, 0};
	static int[] dy = {0, 0, -1, 1};	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testCase = 1;
		for(int tc =1; tc<=testCase; tc++) {
			N = sc.nextInt();
			K = sc.nextInt();
			
			maxH = 0; // 1~20
			
			arr = new int[N][N];
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					arr[i][j] = sc.nextInt();
					
					if(arr[i][j] > maxH)
						maxH = arr[i][j];
				}
			}
		
			
			// 최대 봉우리 높이부터 등산로 조정을 시작한다.
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					if(arr[i][j]== maxH) {
						construction(i,j,0,false);
						
						
					}
				}
			}
			
			
			visited = new boolean[N][N];
			
			
			
		}
		
		
		
		
		
	}
	
	static void construction(int x, int y, int dist, boolean flag) {
		if(dist > ans)
			ans = dist;
		
		visited[x][y] = true;
		
		for(int k=0; k<4; k++) {
			int nx = x+dx[k];
			int ny = y+dy[k];
			
			if(nx<0 || nx>=N || ny<0 || ny>=N || visited[nx][ny])
				continue;
			
			//1. 다음 좌표가 현재 높이보다 낮다면, 등산로를 그대로 둔다.
			if(arr[x][y] > arr[nx][ny]) {
				construction(nx, ny, dist+1, flag);
				
			}
			// 2. 다음 좌표가 현재 높이 보다 k 이내의 범위보다 작을 때, 공사를 진행한다.
			else if(!flag && arr[nx][ny] - arr[x][y] < K) {
				int temp = arr[nx][ny];
				arr[nx][ny] = arr[x][y]-1;
				construction(nx, ny, dist+1, true);
				arr[nx][ny] = temp;
			}
			
		}	
	}

	// 현재 좌표보다 높은 곳을 갈 수 있을 때, dfs를 처리한다.
	// 다음 좌표 - k < 현재 좌표
	// 다음 좌표 - 현재 좌표 < k 
	// 그러니까 다음 좌표 - 현재 좌표의 차이가 k 보다 작을 시, k를 이용해서 봉오리를 깎는다. 
	static void dfs(int x, int y, int[][] arr) {
		Stack<int[]> s = new Stack<>();
		s.add(new int[] {x, y});
		visited[x][y] = true;
		
		
		while(!s.isEmpty()) {
			int[] curr = s.pop();
			
			
			int currX = curr[0];
			int currY = curr[1];
			
			for(int k = 0; k < 4; k++) {
				int nx = currX + dx[k];
				int ny = currY + dy[k];
				
				if(nx < 0 || nx>=N || ny<0 || ny>=N)
					continue;
				
				if(arr[nx][ny] > arr[x][y])
					continue;
				
				
				
			}
			
			
		}
		
		
		
		
		
		
	}
	
	
	
}

//10        
//5 1       
//9 3 2 3 2 
//6 3 1 7 5
//3 4 8 9 9
//2 3 7 7 7
//7 6 5 5 8