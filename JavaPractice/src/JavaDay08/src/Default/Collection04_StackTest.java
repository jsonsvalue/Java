package Default;

import java.util.*;

public class Collection04_StackTest {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		stack.add(1);
		stack.add(2);
		
//		stack.empty();
//		for(int i=0; i<stack.size(); i++ ) {
//			if(!(stack.empty())) {
//				stack.pop();
//				
//			}
//		}
//		
		while(!stack.empty()) {
			stack.pop();
		}
		
		System.out.println(stack);
		
		//System.out.println(stack.pop());
		//System.out.println(stack.pop());
		
		
		//System.out.println(stack.peek());
		
	}
}
