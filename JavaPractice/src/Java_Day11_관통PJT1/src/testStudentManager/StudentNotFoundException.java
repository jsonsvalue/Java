package testStudentManager;

public class StudentNotFoundException extends RuntimeException{
	private static final long serivalVersionUID = 1L;
	private String name;
	
	public StudentNotFoundException(String name){
		super(name + ": 그런 사람은 없습니다만.");
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}
	
}
