package test05_user_exception;

// Exception 클래스를 상속 받아서 실행한다.
public class FruitNotFoundException extends Exception  {
	
	//부모 생성자를 호출한다.
	public FruitNotFoundException(String name) {
		super(name+"에 해당하는 과일은 없습니다.");
	}
	
	
}
