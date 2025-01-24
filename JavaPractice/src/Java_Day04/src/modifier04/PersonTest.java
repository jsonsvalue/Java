package modifier04;

public class PersonTest {
	public static void main(String[] args) {
		Person p = new Person();
		
		// protected 같은 패키지 내에서 접근 가능하도록 만든다.
		p.age = 100;
		p.info();
		
	}
}
