
public class Array09_달팽이순회 {
	public static void main(String[] args) {
		int N=4; 
		int[][] arr = new int[N][N];
		
		int K = N;
		int dir = 1;
		int r =0; 
		int c = -1; 
		int num =1;
		
		while(true) {
			for(int i=0; i<K; i++) {
				c +=dir;
				arr[r][c] = num++;
			}
			K--;
			if(K==0)
				break;
			
			//종료조건 
//			num = N*N;
//			K==0;
//			(r,c) == 중앙 좌표일 때
			
			// 수직 -> 수평
			for(int i=0; i<K; i++) {
				r+=dir;
				arr[r][c] = num++;
			}
			dir = - dir;

		}
		
		for(int i=0; i<N; i++) {
			for(int j=0 ; j<N; j++) {
				System.out.print(arr[i][j]+ "\t");
			}
			System.out.println();
		}
		
		
	}
}
