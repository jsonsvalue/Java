
public class 퀵정렬01_호어파티션 {
	 static int[] arr = {7, 5, 6, 8, 1, 2, 3, 4, 9};
	 static int N = arr.length;
	 
	 public static void main(String[] args) {
		 
		 
		 
	 }
	 
	 static void quickSort(int start, int end) {
		 if(start<end) {
			 int pivot = partition(start, end);
			 quickSort(start, pivot-1);
			 quickSort(pivot+1, end);
		 }
		 
	 }
	 
	 static int partition(int start, int end) {
		 int pivot = arr[start];
		 
		 int L = start +1;
		 int R = end;
		 
		 while(L<=R) {
			 // L: pivot 보다 큰 값을 찾을 때까지 이동한다.
			 while(L<=R && arr[L]<=pivot)
				 L++;
			 
			 // R: pivot 보다 작거나 같은 값을 찾을 때까지 이동
			 while(arr[R]>pivot)
				 R--;
			 
			 // 아직 교차가 안됐으면 바꿔준다.
			 if(L<R) {
				 int tmp = arr[L];
				 arr[L] = arr[R];
				 arr[R] = tmp;
			 }
		 }
		 
		 // 마지막에 R 과 pivot의 위치를 바꿔준다.
		 int tmp = arr[start]; 
		 arr[start] = arr[R];
		 arr[R] = tmp;
		 
		 // pivot 위치
		 return R; 
	 }
	 
	 
}
