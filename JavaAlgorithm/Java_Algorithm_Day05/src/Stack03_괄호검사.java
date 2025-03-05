import java.util.*;


public class Stack03_괄호검사 {
	//소괄호만 있다고 가정
	public static void main(String[] args) {
		String str = "()()(()((())))";
		
		Stack<Character> stack = new Stack<>();
		boolean isPar = true;
		for(int i=0; i<str.length(); i++) {
			//1. 여는 괄호라면 넣는다.
			if(str.charAt(i)=='(') {
				stack.push(str.charAt(i));
			}
			//2.닫는 괄호라면 pop한다.
			else {
				if(stack.isEmpty()) {
					isPar = false;
					break;
				}else {
					char c= stack.pop();
				}
			}			
		}
		
		// 정답 여부 검사
		if(isPar && stack.isEmpty()) {
			System.out.println("정답");
		}else {
			System.out.println("실패");
		}
		
		if(!isPar || !stack.isEmpty()) {
			System.out.println("실패");
		}else {
			System.out.println("정답");
			
		}
		
		
	}
	
	
}
