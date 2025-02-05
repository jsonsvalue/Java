package test05_user_exception;

public class UserExceptionTest {
	public static String[] fruits = {"두리안", "귤", null, null};
	
	public static void main(String[] args) {
		// 과일 목록이 있다고 가정
		// 컴파일 타임에서의 예외를 처리한다.
		try {
			sell("사과");
		}catch(FruitNotFoundException e) {
			System.out.println("오류 발생");
		}
		
		// 런타임에서의 예외를 처리한다.
		sell2("수박");
		
	}
	
	public static void sell(String name) throws FruitNotFoundException {
		// 내가 있는 과일 목록에서 name에 해당하는 과일이 있을 때만 판다.
		for(int i=0; i<fruits.length; i++) {
			if(fruits[i].equals(name)) {
				System.out.println("과일이 존재합니다.");
				fruits[i] = null;
				return;
			}
		}
		
		// 과일이 없어서 못 판다.
		throw new FruitNotFoundException(name);
	}
	
	
	// Runtime에서 발생하는 예외를 처리한다.
	public static void sell2(String name) {
		throw new FruitNotFoundRuntimeException(name);
	}
	
	
}
