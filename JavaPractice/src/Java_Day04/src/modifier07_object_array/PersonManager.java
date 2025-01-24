package modifier07_object_array;

public class PersonManager {
	// 객체 배열을 관리하기 위한 고정된 크기의 배열을 만든다.
	// 각 객체배열의 주소를 가리키기 위해서, size 변수를 선언한다.
	int size =0; 
	private Person[] arr = new Person [100];
	
	// Singleton Pattern
	// 1.클래스 내부에서만 instance를 생성할 수 있게 private 변수를 설정한다
	// 1-1. 하지만 instance 변수를 쓰기 위해서는 static 변수로 만들어야, 클래스 메서드인 getInstance에서 쓸 수 있다.
	private static PersonManager instance = new PersonManager();
	
	// 2.클래스 내부에서만 객체를 생성하도록 private 메서드를 만든다.
	private PersonManager() {
	}
	
	// 3. 클래스 외부에서도 객체를 쓸 수 있게 public 메서드를 만든다.
	// 3-1. instance를 만들 수 없는 상태에서 쓸 수 없기 때문에, static으로 메서드 영역에 공유 가능하도록 만든다.
	public static PersonManager getInstance() {
		return instance;
	}
	
	
	public void addPerson(Person p) {
		if(size<arr.length) {
			// 객체 배열의 주소에 객체를 저장하고, size를 늘려서 다음 인덱스(주소)로 이동한다.
			arr[size] = p;
			size++;
		}else {
			System.out.println("배열 인덱스 한도 초과야 인마");
		}	
	}

}





