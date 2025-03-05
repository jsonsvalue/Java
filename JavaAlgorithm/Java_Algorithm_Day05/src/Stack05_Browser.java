import java.util.*;

public class Stack05_Browser {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 뒤로, 앞으로 가는 웹사이트 구현하기 위한 stack을 2개 만든다.
		Stack<String> back = new Stack<>();
		Stack<String> forward = new Stack<>();

		String page = "Google";
		while(true) {
			System.out.println("1.새로운 페이지 방문(주소 입력)");
			System.out.println("2.뒤로 가기 클릭");
			System.out.println("3.앞으로 가기 클릭");
			System.out.println("0.종료");
			
			int N = sc.nextInt();
			switch(N) {
				case 1:
					// 새로운 페이지를 방문한다.
					// 1. 현재 페이지를 back 스택에 넣는다.
					back.push(page);
					// 2.새로운 페이지를 입력 받는다.
					page = sc.next();
					// 3. forward 스택을 비운다.
					// 3-1 : while, for문을 이용하여 공백 상태가 될 때까지 뽑는다.
					// 3-2 : 새로운 스택을 생성한다.
					// 3-3 : clear() 메서드를 활용하여 비운다.
					forward.clear();
					// 4. 현재 페이지를 출력한다.
					System.out.println("현재 페이지: " + page);	
					break;
					
				case 2:
					//뒤로 가기 기능				
					//1. 현재 페이지를 forward 스택에 넣는다.
					forward.push(page);
					//2.현재 페이지는 back 스택에서 가져온다.
					if(back.isEmpty()) {
						System.out.println("뒤로 가기에 페이지가 없음 ㅋ");
					}else {
						page = back.pop();
					}	
					
					//3. 현재 페이지를 출력한다.
					System.out.println("현재페이지: "+page);
					break;
					
				case 3:
					// 앞으로 가기 기능
					if(forward.isEmpty()) {
						System.out.println("현재 페이지가 가장 최신 페이지임 ㅋ");
					}else {
						// 1. 현재 페이지를 뒤로 스택에 넣는다.
						back.push(page);
						// 2. 앞으로 스택에서 꺼내서 현재 페이지에 넣는다.
						page = forward.pop();
						// 3. 현재 페이지를 출력한다.
						System.out.println("현재 페이지: "+ page);
					}
					
					break;
					
				default:
					System.out.println("종료된다 ㅅㄱ");
					return;
					
			}
			
			
//			if(N==1) {}
//			else if (N==2) {}
//			else if (N==3) {}
//			else {}
			
			
			
		}
		
	}
}
