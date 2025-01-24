package modifier07_object_array;

public class Person {
	private String name;
	private int age;
	private String hobby;
	
	public Person() {
		
	}
	
	public Person(String name, int age, String hobby) {
		this.name = name;
		this.age = age;
		this.hobby = hobby;
	
	}
	
	//설정자, 접근자 설정을 통해, 클래스 외부에서도 private 변수를 수정/조회 수 있는 함수를 쓴다.
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	public String getHobby() {
		return hobby;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getname() {
		return name;
	}
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", hobby=" + hobby + "]";
	}
	
	
}



