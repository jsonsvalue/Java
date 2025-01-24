package Inheritant01;
import Non_Inheritant01.Student;

public class PersonTest {
	public static void main(String[] args) {
		Person p = new Person();
		
		Student st = new Student();
		
		// 두 클래스는 서로 연관이 없지만, 
		//공통적으로 존재하는 부분을 가져와서 확장시켜서 쓴다.
		p.eat();
		st.eat();
		
	}
}
