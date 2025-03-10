import java.util.*;

public class 이진검색_재귀 {
	static int[] arr;
	
	public static void main(String[] args) {
		arr = new int[]{1, 3, 5, 8, 10, 19, 25, 29};
		int target = 5;
		
		int result = binarySearch(target, 0, arr.length-1);
		
		if (result != -1) {
            System.out.println("값 " + target + "은(는) 인덱스 " + result + "에 있습니다.");
        } else {
            System.out.println("값 " + target + "을(를) 찾을 수 없습니다.");
        }
		
	}
	
	public static int binarySearch(int target, int low, int high) {
		if(low > high) {
			return -1;
		}
		
		int mid = ( low + high )/2;
		
		if(arr[mid] == target) {
			return mid;
		}else if( target < arr[mid] ) {
			return binarySearch(target, low, mid-1);
		}else {
			return binarySearch(target, mid+1, high);
		}
	}
	
}
