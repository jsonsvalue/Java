
public class 조합02_반복문 {
	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 3, 4};
		int N = arr.length;
		// int R = 3;
		
		// 뽑은 것을 다시 안 뽑고, 그 뒤에 있는 것을 뽑는다. 
		for(int i=0; i<N-2; i++) {
			for(int j=i+1; j<N-1; j++) {
				for (int k=j+1; k<N; k++) {
					System.out.println(arr[i] + " "+arr[j] + " " + arr[k] + " ");
				}
			}
		}
		
		
		
		
		
	}
}
