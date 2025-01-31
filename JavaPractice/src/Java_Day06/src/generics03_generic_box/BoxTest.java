package generics03_generic_box;

// 타입을 명시한 클래스이다.
class Box<T>{
	private T t;

	public T getObj() {
		return t;
	}

	public void setObj(T t) {
		this.t = t;
	}
	
	// 제네릭 메서드(Generic Method)
	public <A> void printClassName(A item) {
		System.out.println("Item type: " + item.getClass().getName() );
	}
	
}
public class BoxTest {
	public static void main(String[] args) {
		Box<Integer> box = new Box<>();
		
		box.printClassName("Hello");
		box.printClassName(12.5);
		box.<Integer>printClassName(12);// 생략해서 써도 되지만, 명시해도 상관 없다.
		
	}
}




