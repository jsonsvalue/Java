package generics01_generic_box;

// 타입을 명시한 클래스이다.
class Box<T>{
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
//		Box box = new Box();
//		Box<Object> box = new Box<Object>(); 쓸거면 차라리 참조 자료형 Object를 명시적으로 나타내는 것이 낫다.
//		box.setObj(1);
		
		
		Box<Integer> intBox = new Box<Integer>();// 정수형을 담을 수 있는 클래스이다.
		//Box<int> intBox2 = new Box<int>(); 참조 자료형이 제네릭 자료형으로 들어가야되기 때문에, 기초 자료형이 들어갈 수 없다.
		// 대신 기초 자료형을 쓰기 위해서는, Wrapper Class를 쓴다.
		// int -> Integer, char -> Character, boolean -> Boolean을 쓴다.
		
		intBox.setObj(1);
		
		Box<String> stringBox1 = new Box<>();// 가능
		//Box<> stringBox2 = new Box<String>();// 불가능
		
		stringBox1.setObj("안녕하세요.");
		
		int i1 = 11;	// 객체 X
		Integer i2 = 11;// 객체 O => AutoBoxing: 자동으로 객체를 만들어주는 것
		
		Integer i3 = Integer.valueOf(12); // Integer 참조 자료형을 이용해서 객체로 만드는 과정이다.
		
		int i4 = i3; 			// 객체 X => Auto unboxing
		int i5 = i3.intValue(); // 객체 X => Unboxing
		
		
		
	}
}




