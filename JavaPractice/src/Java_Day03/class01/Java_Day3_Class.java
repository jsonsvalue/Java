import java.util.*;

public class Java_Day3_Class {
	// Java_Day3_Class에서 실행할 함수들을 작성한다.
	// 출력하는 함수
	public static void main(String[] args) {
		System.out.println("아침에 일어난다.");
		move("교육장", "버스");
		curriculum();
		move("집", "지하철");
		System.out.println("----------");
		System.out.println("과제를 해결한다.");
		System.out.println("약속을 간다.");
		System.out.println("운동을 한다.");	
	}
	
	// 반복되는 함수를 따로 만들어서 작동시킨다.
	public static void curriculum() {
		System.out.println("오전 수업을 듣는다.");
		System.out.println("점심을 먹는다.");
		System.out.println("실습과제를 수행한다.");
		
		// 랜덤으로 과제를 생성한다.
		Random rand = new Random();
		boolean assignmentBool= rand.nextBoolean();
		
		if(assignmentBool) {
			System.out.println("과제까지 하셈");
		}else {
			System.out.println("오늘은 쉬어라 ㅋ");
		}
		
	}
	
	// 매개변수를 활용해서, 매개변수에 따라 다른 값을 출력하도록 한다.
	public static void move(String place, String transportation) {
		System.out.println(place + "으로 " + transportation +"을 타고 간다.");
	}
	
//	public static boolean homework() {
//		
//		
//	}
//	
	
}
