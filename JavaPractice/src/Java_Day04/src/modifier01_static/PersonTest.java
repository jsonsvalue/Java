package modifier01_static;

public class PersonTest {
	public static void main(String[] args) {
		Person p = new Person();
		
		p.name = "yang";
		
		System.out.println(p.name);
		
		//인스턴스를 통해서 클래스 변수를 접근할 수 있지만, 클래스를 통해서 클래스 변수를 접근하는 것이 더 좋은 방법
		System.out.println(p.pCount++);
		
		Person p2 = new Person();
		System.out.println(p2.pCount);
		System.out.println(++p2.pCount);
		System.out.println(Person.pCount);
		
		p.eat();
		p.study();
		
		
		Person.eat();
		//Person.Study(); 아직 힙 영역에 객체가 메모리에 형성되지 않았기 때문에 사용이 불가능하다. 
		
	}

}
