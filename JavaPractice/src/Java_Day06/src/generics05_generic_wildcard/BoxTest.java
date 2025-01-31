package generics05_generic_wildcard;

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
		Box<?> box = new Box<Integer>();
		Box<? extends Integer> box2 = new Box<>();
		Box<? super Double> box3 = new Box<>();
				
	}
}




