import 연결스택.LinkedStack;

public class LinkedList03_연결스택 {
	public static void main(String[] args) {
		LinkedStack s = new LinkedStack();
		
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
	}

}
