
public class Array10_Delta {
	// static을 통해 델타 선언을 많이한다.
	
	public static void main(String[] args) {
		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};
		
		int[][] arr =  {{1, 2, 3}, {4, 5, 6},{7, 8, 9}};
		int N = arr.length;
		int x= 1;
		int y = 1;
		
		for(int i=0; i<4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			
			//Array 배열 내 들어올 때만, arr값을 출력한다.
			if(nx>=0 && nx<N && ny>=0 && ny<N) {
				System.out.println(arr[nx][ny]);
			}
			
		}
		
		
	}
	
}
