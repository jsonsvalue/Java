package DI_01;

public class Test {
	public static void main(String[] args) {
		// Programmer 클래스가 Desktop 클래스에 대한 의존성을 가지고 있다.
		// 그러니까 Programmer 클래스가 Desktop 클래스를 가져와서 쓰고 있다는 뜻이다.
		Programmer p = new Programmer();
		
		p.coding();
		
	}
}
