package Class03;

public class PersonTest {
	public static void main(String[] args) {
		Person p = new Person();
		
		// Method overloading 
		// 이름이 같고 매개변수가 다른 메서드를 여러 개 정의할 때, 매개변수에 따라서 실행되는 함수가 다르다.
		
		// 묵시적인 형변환
		// 더 작은 범위를 표현할 수 있는 자료형이 더 큰 범위를 표현할 수 있는 자료형으로 자동으로 바뀐다.
		p.study(10);
//		p.study(10.0);
		
	}
	
	
}
