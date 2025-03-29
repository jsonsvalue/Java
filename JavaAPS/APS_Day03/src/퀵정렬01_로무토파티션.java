
public class 퀵정렬01_로무토파티션 {
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
		 
		 // 작은 값들의 경계
		 int i = start - 1;
		 
		 // 경계를 결정한다.
		 for(int j=start; j<end;j++) {
			 if(arr[j]<=pivot) {
				 i++;
				 int temp = arr[i];
				 arr[i] = arr[j];
				 arr[j] = temp;
			 }
		 }
		 
		 int temp = arr[i+1];
		 arr[i+1] = arr[end];
		 arr[end] = temp;
		 
		 return i+1;
		 
	 }
	 
	 
}
