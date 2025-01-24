import java.util.Arrays;

public class Java_Day2_Array02 {
	public static void main(String[] args) {
		int[] nums = {1, 3, 5, 7, 9};
		
		System.out.println("Odd Numbers");
		for(int i=0; i<nums.length ; i++) {
			System.out.println(nums[i]);
		}
			
		
		int intArray[] = {2, 4, 5, 8, 10};// 읽기만 가능
		
		System.out.println("Even Numbers");
		for(int x:intArray) {
			x = x*2;
		}
		
		for(int x: intArray) {
			System.out.println(x);
		}
		
		System.out.println("Using the Arrays Method to see the elements as a list");
		System.out.println(Arrays.toString(nums));
	}
}
