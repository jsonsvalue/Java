package polymorphism01;

public class Test2 {
	public static void main(String[] args) {
		// 형변환
		
		// #1 묵시적 형변환 => 자동으로 형변환을 한다.
		// 자식 타입 -> 부모 타입
		// 더 좁은 범위의 자료형이 넓은 범위의 자료형으로 자동으로 변환한다.
		Student st1 = new Student();
		// st -> p
		Person p1 = st1;
		// st -> obj
		Object obj1 = st1;
		
		// #2 명시적 형변환 => 직접 형변환을 해줘야 한다.
		// 부모 타입 -> 자식 타입
		// 더 넓은 범위의 자료형을 좁은 범위 자료형으로 직접적으로 바꿔야 한다.
		
		Person p = new Person();
//		Student st = (Student) p; 명시적인 형 변환을 사용했지만, 더 넓은 범위의 Person 클래스에서 정의되지 않는 Student클래스의 메서드를 쓸 수 없는 문제가 생긴다.
		
		if(p instanceof Student) {// Person이 더 좁은 범위의 Student 클래스의 인스턴스일 경우에만, Student 클래스의 메서드를 실행시키는 것이 코드 상 더 안전한 구문이다.
			Student st3 = (Student) p;
			st3.study();
		}
		
		
//		Student st2 = (Student)p2;// st2는 더 넓은 범위의 Person 클래스 객체를 정의한 것이기 때문에,
//		st2.eat();				  // 더 좁게 구체적으로 정의된 Student 클래스의 메서드를 사용할 수 없다.
								  // java.lang.ClassCastException
		
//		Person p3 = new Student();
//		Student st3 = (Student)p3;
		
	}
	

}





