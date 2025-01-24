
public class Java_Day2_Practice {
	public static void main(String[] args) {
		int[] nums = {64, 53, 123, 23, 444, 98, 12};
		
		//최소값, 최대값, 합계, 평균
		int max = -1000000000;
		int min = 1000000000;
		
		for(int i=0; i<nums.length; i++) {
			if (nums[i] < max) {
				max = nums[i];
			}
		}
		
		for(int i=0; i<nums.length; i++) {
			if (nums[i] > min) {
				min = nums[i];
			}
		}
		
		System.out.println(max);
		System.out.println(min);
		
	}
}
