package modifier01_static;

public class Person {
	
		//클래스 변수
		static int pCount=1;
		
		String name;
		int age;
		String hobby;
		
		//초기화 블록(Static Block)
		static {
			// 클래스 변수를 초기화하고, 다른 작업도 가능하다.
			pCount = 1000;
		}
		
		//클래스 메서드(정적 메서드)
		public static void eat() {
			pCount = 100;
			// this.name = "Yang"; 사용하려는 name이 인스턴스 변수라서, 클래스 메서드에서 사용 불가능하다. 
			
		}
		
		//인스턴스 메서드(비정적 메서드)
		public void study() {
			pCount = 10000;
		}
}


