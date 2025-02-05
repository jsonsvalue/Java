package test04_finally;

public class FinallyTest01 {
	public static void main(String[] args) {
		int[] nums = {10, 20 };
		
		// try-catch-finally
		try {
			System.out.println("#1");
			nums[3] = 40;
			//nums[0] = 40;
			int i= 1/0;
			System.out.println("#2");
			//return;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("#3");
			return;
		}finally {
			System.out.println("#4");
		}
		System.out.println("#5");
		
		
	}
}
