package polymorphism01;

public class testClass {
	public static void main(String[] args) {
		Student st = new Student();
		Person p = new Student();
		Object obj = new Student();
		
//		Student st2 = new Person();
		
		// 참조 자료형을 바꾸더라도, 실제 메모리에 생성 돼 있는 객체 자체는 변하지 않는다.
		
		st.eat();
		p.eat();	// 동적 바인딩(Dynamic Binding)
					// 하위 클래스의 객체가 상위 클래스의 메서드를 오버라이드 했다면, 
					// 참조한 상위 클래스의 자료형과 관계 없이 하위 클래스의 객체가 갖는 메서드가 호출된다.
		
		//obj.eat();
		
	}
}







