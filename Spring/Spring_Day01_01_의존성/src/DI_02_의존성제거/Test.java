package DI_02_의존성제거;

public class Test {
	public static void main(String[] args) {
		// Programmer 클래스가 Desktop 클래스에 대한 의존성을 제거할 수 있게, 
		// Desktop 객체를 만들고 Programmer 에 매개변수로 넣는다.
		Desktop ds = new Desktop();
		
		Programmer p = new Programmer(ds);
		
		p.coding();
		
	}
}
