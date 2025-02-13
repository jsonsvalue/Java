import java.util.*;

public class Stack01_API {
	public static void main(String[] args) {
		Stack s = new Stack<>();
		
		s.push(10);
		s.push(20);
		s.push(30);
		
		int r = (int)s.pop();
		System.out.println(r);
		System.out.println(s.peek());
		System.out.println(s.size());
		
		// 미리 길이를 변수에 저장하지 않고 쓰면, 스택 길이가 줄어들 때마다 길이의 값이 변하게 된다.
		int len = s.size();
		for(int i=0; i<len; i++) {
			System.out.println(s.pop());
		}
		
		System.out.println(s.isEmpty());
		
		
	}
	
}
