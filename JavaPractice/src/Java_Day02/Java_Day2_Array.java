
public class Java_Day2_Array {
	public static void main(String[] args) {
		
		//배열의 선언
		int[] arr1;
//		int arr2[];
		
		// 생성하는 방법
		int[] arr3 = new int[10];
		
		int[] arr4 = new int[] {1, 2, 3, 4};
		
		int[] arr5 = {1, 2, 3, 4};
		
		//arr1 = {3, 4, 5, 6};			// 재할당 불가능
		arr1 = new int[] {1, 2, 3, 4};  // 재할당 가능
		
		
		System.out.println(arr4[-1]);   // 런타임 에러
		System.out.println(arr4[7]);    // 컴파일 타임에서는 정수 타입인지만 확인하고, 런타임에서 인덱스가 배열에서 벗어나는지를 확인한다.
		
		System.out.println(arr1.length);
		
		
	}
}
