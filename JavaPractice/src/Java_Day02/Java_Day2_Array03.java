import java.util.Arrays;

public class Java_Day2_Array03 {
	public static void main(String[] args) {
		int[][] arr1;
		int arr3[][];
		
		int[][] arr4 = new int[2][3];
		System.out.println(arr4[0]);	// 배열의 행에 대한 주소가 나온다.
		System.out.println(arr4[0][0]); // 배열의 행에 대한 열이 나오기 때문에, 값이 나온다.
		
		
		for(int i=0; i<arr4.length; i++) {
			// Array의 주소가 아닌 String으로 바꿔서 출력하는 메서드를 활용한다.  
			System.out.println(Arrays.toString(arr4[i]));
		}
		
	}
}
