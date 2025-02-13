
public class Array05_이진검색 {
	public static void main(String[] args) {
		int[] arr = {2, 4, 7, 9, 11, 19, 23};
		
		System.out.println(binarySearch(arr,11));
	}
	
	
	static int binarySearch(int[] arr, int target) {
		int L= 0; 
		int R = arr.length -1;  
		
		// 적절한 값이 없어서 왼쪽의 인덱스가 오른쪽의 인덱스 보다 더 커질 경우, while 문을 멈춘다.
		while(L<=R) {
			int mid = (L+R)/2;
			if(arr[mid]==target) {
				return mid;
			}
			// 가운데 수 보다 더 크기 때문에, 오른쪽을 탐색한다. 
			else if(arr[mid] < target) {
				L = mid+1;
			}
			// 가운데 수 보다 더 작기 때문에, 왼쪽을 탐색한다.
			else {
				R = mid-1;
			}
		}
		
		return -1;
		
	}
}
