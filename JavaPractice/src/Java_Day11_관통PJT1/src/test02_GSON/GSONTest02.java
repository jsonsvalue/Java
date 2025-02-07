package test02_GSON;

import java.util.*;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class GSONTest02 {
	// GSON 추가하는 방법 2가지
	// 1. 직접 추가한다.
	// 2. Maven을 이용해서 추가한다.
	
	public static void main(String[] args) {
		Gson son = new Gson;
		
		// 자바 객체를 JSON 데이터(문자열)로 만들기
		Student st1 = new Student("Yang", 45, "Computer");
		Student st2 = new Student("Kim", 45, "Computer");
		Student st3 = new Student("Park", 45, "Computer");
		
		// 객체 배열
		Student[] sArr = new Student[3];
		sArr[0] = st1;
		sArr[1] = st2;
		sArr[2] = st3;
		
		System.out.println(Arrays.toString(sArr));
		
		// 객체 배열 -> JSON
		String arrStr = gson.toJson(sArr);
		System.out.println(arrStr);
		
		// JSON -> 객체배열
		Student[] sArr2 = gson.fromJson(arrStr, Student[].class);
		System.out.println(sArr2);
		
		//객체 리스트
		List<Student> sList = new ArrayList<>();
		
		sList.add(st1);
		sList.add(st2);
		sList.add(st3);
		
		System.out.println(sList);
		
		//객체 리스트 -> JSON
		String listStr = gson.toJson(sList);
		System.out.println(listStr);
		
		//JSON -> 객체 리스트
		// Type을 새로 만들어서 그 자료형을 저장한다.
		Type studentListType = new TypeToken<ArrayList<Student>>() {}.getType();
		ArrayList<Student> sList2 = gson.fromJson(listStr, studentListType);
		System.out.println(sList2);
	}
	
}
