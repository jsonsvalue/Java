package generics04_generic_한정적;

// 타입을 명시한 클래스이다.
class Box<T extends Number>{
	private T t;

	public T getObj() {
		return t;
	}

	public void setObj(T t) {
		this.t = t;
	}
	
}
public class BoxTest {
	public static void main(String[] args) {
		Box<Integer> box = new Box<>();
//		Box<String> box2 = new Box<>(); X 
		
		
		
	}
}




