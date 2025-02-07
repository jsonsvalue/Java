package test03_studentManagerJSON;

import java.util.*;
import java.io.*;

public class StudentManager {

	// Student를 관리하는 객체 배열을 만든다.
	private List<Student> students = new ArrayList<>();
	private static StudentManager manager = new StudentManager();
	
	private File file = new File("data/student.json");
	private Gson gson = new Gson();
	
	// StudentManager 클래스에서만 객체를 형성할 수 있게, private으로 관리한다.
	private StudentManager(){
		if(file.exists()) {
//			try(BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file))){
//				String str = null;
//				StringBuilder sb = new StringBuilder();
//				while((str = br.readLine())) != null){
//					sb.append(str);
//				}
//				Type studentListType = new TypeToken<ArrayList<Student>>();
//				students = gson.fromJson(sb.toString(), studentListType)
//				
//			}
//				
//			}catch(FileNotFoundException e) {
//				e.printStackTrace();
//			}catch(IOException e) {
//				e.printStackTrace();
//			}
			
		}
		
		
	}
	
	public static StudentManager getInstance() {
		if(manager == null) {
			manager = new StudentManager();
		}
		
		return manager;
		
	}
	
	//삽입
	public void addStudent(Student student) {
		students.add(student);
	
	}
	
	//조회
	// 1. 전체 목록 조회
	public List<Student> getAllStudent(){
		return students;
	}
	
	// 2. 이름 검색
	public Student SearchByname(String name) {
		for(int i=0; i<students.size();i++) {
			Student st = students.get(i);
			if(st.getName().equals(name)) {
				return st;
			}
		}
		return null;
	}
	
	// 수정
	// 전공 변경
	public boolean changeMajor(String name, String major) {
		for(Student st: students) {
			if(st.getName().equals(name)) {
				st.setMajor(major);
				return true;
			}
			
		}
		
		throw new StudentNotFoundException(name);
		
	}
	
	//삭제
	public boolean removeStudent(String name) {
		for(int i= students.size() -1; i>=0; i--) {
			if(students.get(i).getName().equals(name)) {
				students.remove(i);
				return true;
			}
		}
		return false;
	}
	
	// 파일을 저장한다.
	public void saveData() {
		try(BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file))){
			bw.write(gson.toJson(students));
			System.out.println("저장 완료");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
}
