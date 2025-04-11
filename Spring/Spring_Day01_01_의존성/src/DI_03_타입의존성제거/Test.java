package DI_03_타입의존성제거;

public class Test {
	public static void main(String[] args) {
		Desktop ds = new Desktop();
		
		Laptop lp = new Laptop();
		
		// Computer 클래스를 상속 받는 Desktop, Laptop 클래스를 만듦으로써, 
		// 타입에 대한 의존성을 제거한다.
		Programmer p = new Programmer(lp);
		
		p.coding();
		
	}
}
