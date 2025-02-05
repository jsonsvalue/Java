package test05_user_exception;

public class dd {
	
	public static void main(String[] args) {
			try {
				int num =-1;
			    if (num < 0) {
			        throw new IllegalArgumentException("음수는 입력할 수 없습니다.");
		    }
			    System.out.println("올바른 입력입니다.");
		
			}catch(IllegalArgumentException e) {
				//e.printStackTrace();
				System.out.println(e.getMessage());
				
			}
			
			
	}	
}
