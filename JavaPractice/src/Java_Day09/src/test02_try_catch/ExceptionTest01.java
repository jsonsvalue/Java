package test02_try_catch;

public class ExceptionTest01 {
	public static void main(String[] args) {
		int[] nums = {10};
		
		//try-catch 구문
		try {
			System.out.println("정상적인 코드1");
			System.out.println(nums[2]);
			System.out.println("정상적인 코드2");
			
		}catch(ArrayIndexOutOfBoundsException | ArithmeticException e){
			
			if(e instanceof ArrayIndexOutOfBoundsException) {
				System.out.println("인덱스 처리");
			}else {
				System.out.println("수학적 오류 처리");
			}	
		}
		
		System.out.println("프로그램 종료");
		
		
	}
}
