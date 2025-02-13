import java.util.Arrays;

public class Array07_카운팅정렬 {
	public static void main(String[] args) {
		int[] arr = {3, 13, 26, 88, 22, 11, 54, 12};
		
		countingSort(arr);
		
	}
	
	static void countingSort(int[] arr) {
		//1.가장 큰 값을 찾는다.(문제에 따라서 값이 음수일 경우, 가장 작은 값을 찾아서 숫자의 범위를 찾아야 한다.)
		int K = -1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>K)
				K = arr[i];
		}
		
		// 2. 각 숫자의 개수를 확인하기
		int[] count = new int[K+1];
		for(int i=0; i<arr.length; i++) {
			int idx = arr[i];
			count[idx]++;
		}
		
		// 3. 누적합 구하기(해당 원소가 어느 위치에 있어야하는지를 결정한다.)
		for(int i=1; i<count.length; i++) {
			count[i] += count[i-1];
		}
		
		// 4. 역방향으로 순회하면서 각 원소의 위치를 배정한다.
		int[] sortArr = new int[arr.length];
		for(int i=arr.length-1; i>=0; i--) {
			int num = arr[i];
			int idx = count[num]-1;
		
			sortArr[idx] = num;// arr[i]
			count[num]--;
			
//			sortArr[--count[arr[i]]] = arr[i];
			
		}
		
		System.out.println(Arrays.toString(sortArr));
		
		
	}
	
	
}
