package test02_GSON;

public class Student {
	// 멤버 변수 생성
	private String name;
	private int age;
	private String major;
	
	// 생성자 생성
	public Student(){
	}
	
	
	public Student(String name, int gae, String major) {
		super();
		this.name = name;
		this.age = age;
		this.major = major;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getMajor() {
		return major;
	}


	public void setMajor(String major) {
		this.major = major;
	}
	
	
	
	
	
	
}
