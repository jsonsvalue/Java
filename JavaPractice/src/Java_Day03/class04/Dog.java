package class04;

public class Dog {
	// 멤버 변수 설정
	String name;
	int age;
	
//	public Dog() {
//		// Auto Generated Constructor
//	}
	
	// 생성자 설정
	public Dog(String name, int age) {
		//System.out.println("기본 생성자 출력");
		this.name = name;
		this.age = age;
	};
	
	// this()를 통해서 동일한 클래스 내에서, 다른 생성자를 호출한다.
	public Dog(int age) {
		this("우쭈쭈", 20);
		
	}
	
//	public Dog(int age) {
//		this.name = "저기요";
//		this.age = age;
//	}
	
	
}
