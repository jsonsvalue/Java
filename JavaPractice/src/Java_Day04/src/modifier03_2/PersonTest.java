package modifier03_2;
//어느 패키지에서 클래스를 import 할지 결정한다.
import modifier03.Person;

public class PersonTest {
	public static void main(String[] args) {
		Person p = new Person();
		
		// default 같은 패키지 내에서 접근 가능하도록 만든다.
		// 따라서 다른 패키지에서 import해서 쓰려고 하면 오류가 나타난다.
		//p.age = 100;
		
		
	}
}
