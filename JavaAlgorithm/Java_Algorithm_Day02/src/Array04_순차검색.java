
public class Array04_순차검색 {
	public static void main(String[] args) {
		int[] arr = {4, 9, 11, 23, 2, 19, 7};
		int len = arr.length; 
		int target = 2;
		
		System.out.printf("%d번째 인덱스",searchArray(arr, target, len));
	}
	
	static int searchArray(int[] arr, int target, int len) {
		int i=0; 
		while(i<len) {
			if(arr[i] == target)
				return i+1;
			i++;
		}
		return -1;	
	}
	
}
