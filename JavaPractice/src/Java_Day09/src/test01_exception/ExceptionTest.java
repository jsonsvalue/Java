package test01_exception;

public class ExceptionTest {
	public static void main(String[] args) {
		// 1.Unchecked
		// Runtime 계열
		int[] nums = {10};
		
		System.out.println(nums[2]); // 코드 실행 상 문제가 있다.  
		
		// 2.Checked
		// Exception / Compile 시점에서 오류에 대한 대처코드가 없으면 실행이 안된다.
		//Class.forName("Mart"); // Mart라는 클래스의 이름이 존재하는지 확인한다.
		
		
		
	}
	
}
