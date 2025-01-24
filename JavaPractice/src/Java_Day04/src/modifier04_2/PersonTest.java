package modifier04_2;

import modifier04.Person;
public class PersonTest extends Person {
	public static void main(String[] args) {
		Person p = new Person();
		
		// protected 다른 패키라서 당연히 안된다.
		//p.age = 100;
		
		// 패키지가 다르더라도, 상속을 받은 뒤에 해당 객체를 통해서 접근이 가능하다.
		PersonTest pt = new PersonTest();
		pt.age = 100;
		
	}
}





