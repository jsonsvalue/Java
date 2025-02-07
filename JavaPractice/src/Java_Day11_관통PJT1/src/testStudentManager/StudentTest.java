package testStudentManager;
import java.util.*;

public class StudentTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentManager sm = StudentManager.getInstance();
		
		int opt;
		do {
			System.out.println("학생 관리 프로그램");
			System.out.println("1.학생 추가");
			System.out.println("2.");
			System.out.println("3.");
			System.out.println("4.");
			System.out.println("5.");
			System.out.println("0.");

			opt = sc.nextInt();
			
			//if-else
			if(opt == 1) {
				System.out.println("학생을 추가할게요");
				System.out.println("이름:");
				String name = sc.next();
				System.out.println("학번:");
				int age = sc.nextInt();
				System.out.println("전공:");
				String major = sc.next();
				
				sm.addStudent(new Student(name, age, major));
				
			}else if(opt ==2) {
				for(Student st: sm.getAllStudent()) {
					System.out.println(st);
				}
			}else if(opt ==3) {
				System.out.println("학생 이름으로 검색합니다잉");
				String name = sc.next();
				Student st= sm.SearchByname(name);
				
				if(st == null) {
					System.out.println("그런 학생은 없습니다만");
				}else {
					System.out.println("조회한 학생은 없어");
					System.out.println(st);
				}
				
			}
			
			
			
			
			
		}while( opt !=0);
		
	}

}
