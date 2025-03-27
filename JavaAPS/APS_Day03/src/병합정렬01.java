import java.util.Arrays;

public class 병합정렬01 {
	static int[] arr = {7, 5, 6, 8, 1, 2, 3, 39};
	static int N = arr.length;
	
	// 정렬된 숫자를 저장하는 임시 공간
	static int[] tmp = new int[N];
	
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(arr));
		mergeSort(0,N-1);
		System.out.println(Arrays.toString(arr));
		
	}
	
	static void mergeSort(int start, int end) {
		if(start < end) {
			int mid = (start+end) / 2;
			mergeSort(start, mid);
			mergeSort(mid+1, end);
			//병합하는 메서드 호출
			merge(start, mid, end);
			
			
		}
	}
	
	// 병합하는 메서드
	static void merge(int start, int mid, int end) {
		// 정렬하고자 하는 부분 배열들의 시작 위치를 초기화한다.
		int L = start;
		int R = mid + 1;
		
		// 임시 공간의 인덱스를 설정한다.
		int idx = start;
		
		// 한쪽 구간에 대한 정렬을 끝낸다.
		while(L<=mid && R<=end) {
			// 안정적인 정렬을 위해서 등호를 넣는다.
			// mid를 기준으로 왼쪽에 있는 숫자와 오른쪽에 있는 숫자를 각각 분류해서 temp 배열에 넣는다.
			if(arr[L] <= arr[R])
				tmp[idx++] = arr[L++];
			else {
				tmp[idx++] = arr[R++];
			}
			
		}
		
		// 남은 구간에 대한 처리
		if(L <= mid) {
			for(int i=L; i<=mid; i++) {
				tmp[idx++] = arr[i];
			}
			
		}else {
			for(int i=R; i<=end; i++) {
				tmp[idx++] = arr[i];
			}
		}
		
		
		// 임시로 만든 배열을 원본배열에 덮는다.
		for(int i=start; i<=end; i++) {
			arr[i] = tmp[i];
		}
		
		
	}
	
			
}
