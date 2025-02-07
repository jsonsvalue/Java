package test02_GSON;
import com.google.gson.Gson;

public class GSONTest01 {
	// GSON 추가하는 방법 2가지
	// 1. 직접 추가한다.
	// 2. Maven을 이용해서 추가한다.
	
	public static void main(String[] args) {
		Gson son = new Gson;
		
		// 자바 객체를 JSON 데이터(문자열)로 만들기
		Student st = new Student("Yang", 45, "Computer");
		System.out.println(st);
		
		String stJson = gson.toJson(st);
		System.out.println(stJson);
		//String stJson2  
				
		// JSON 데이터를 Java 객체로 만들기
		Student st2= gson.fromJson(stJson, Student.class);
		System.out.println(st2);
		
		
	}
}
