package modifier06_getter_setter;

public class Person {
	//private: 자기 자신의 클래스 외 클래스에서 접근이 불가능하다.
	private String name;
	private int age;
	private String hobby;
	
	public Person() {
		
	}
	
	// 설정자, 접근자가 없을 때, public 함수로 만들어서 인스턴스 변수를 클래스 외부에서 변경한다.
	public void info() {
		System.out.println(name+"은 입니다.");
	}
			
	// 생성자를 통해서 인스턴스 변수를 사용하고, 해당 함수를 클래스 외부에서 쓰기 위해 접근제한자가 public인 메서드를 만든다. 
	public Person(String name) {
		this.name = name;
	}
	
	// 설정자 생성: private으로 설정된 변수의 값을 바꾸는 함수를 만든다.
	public void setName(String name) {
		this.name = name;
	}
	
	// 접근자 생성: private으로 설정된 변수의 값을 가져오는 함수는 만든다.
	public String getName() {
		return name;	
	}
	
	// 설정자를 생성할 때, 내부적으로 인스턴스 변수에 대해 검증하는 함수를 작동할 수 있다.
	public void setAge(int age) {
		if(age<0) {
			System.out.println("나이는 음수가 돼서는 안된다.");
			//return;
		}else if(age>=130) {
			System.out.println("아직도 살아 있나요?");
			//return;
		}else {
			//2.혹은 아예 else로 처리해서 각 경우별로 나눠서 코드가 실행되고 나서 메서드의 실행을 멈추도록 만든다.
			this.age = age;
		}
		// 1.각 Code block 내에서 Code가 실행되고 나서 끝내기 위해서는 return이 필요하다.
		//this.age = age;
	}
	
	
	
}
