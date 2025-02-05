package test02_try_catch;

public class ExceptionTest02 {
	public static void main(String[] args) {
		int[] nums = {10};
		
		//try-catch 구문
		try {
			System.out.println("정상적인 코드1");
			System.out.println(nums[2]);
			System.out.println("정상적인 코드2");
			
		}
		// 광범위한 예외 설정으로 인해 하위 예외들이 실행이 안된다.
//		catch(Exception e) {
//			System.out.println("너무 광범위한 예외 설정");
//		}
		catch(ArrayIndexOutOfBoundsException | ArithmeticException e){
			
			if(e instanceof ArrayIndexOutOfBoundsException) {
				System.out.println("인덱스 처리");
				System.out.println(e.getMessage());
				e.printStackTrace();
				
			}else {
				System.out.println("수학적 오류 처리");
			}	
		}
		
		System.out.println("프로그램 종료");
		
		
	}
}
