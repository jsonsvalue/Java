package DI_04_의존성주입;
import java.util.*;

public class Test {
	public static void main(String[] args) {
		/*
		 * Desktop ds = new Desktop();
		 * 
		 * Laptop lp = new Laptop();
		 * 
		 * // Computer 클래스를 상속 받는 Desktop, Laptop 클래스를 만듦으로써, // 타입에 대한 의존성을 제거한다.
		 * Programmer p = new Programmer(lp); p.coding();
		 * 
		 * Programmer p2 = new Programmer(); p2.setComputer(ds); p2.coding();
		 */
		
		Scanner sc = new Scanner(System.in);
		
		Programmer p = new Programmer();
		
		while(true) {
			// 입력값으로 받은 컴퓨터 종류에 맞게 p에 컴퓨터를 설정하고, 
			// p.coding으로 값을 출력한
			p.setComputer(ComputerFactory.getComputer(sc.next()));
			p.coding();
			
		}
		
	}
}
