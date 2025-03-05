// 클래스로 빼서 만드는 방법도 있다.

import java.util.Arrays;

class MyStack{
	
}

//static으로 만들어서 구현한다.
public class Stack02_배열구현 {
	static String[] stack = new String[10];
	// 스택이 존재하지 않는 상태 -> top =-1로 설정한다.
	static int top = -1;
	
	public static void main(String[] args) {
		// 왜 static 함수를 구성하면, 그냥 함수 이름만 써서 쓸 수 있는 것이지?
		push("짜장면");
		push("마라탕");
		push("짬짜면");
		push("꿔바로우");
		push("짬짜면");
		push("짬짜면");
		push("짬짜면");
		push("짬짜면");
		push("짬짜면");
		push("짬짜면");
		push("짬짜면");
		push("짬짜면");
		push("짬짜면");
		push("짬짜면");
		push("짬짜면");
		push("짬짜면");
		push("짬짜면");
		push("짬짜면");
		
		pop();
		
		
		System.out.println(Arrays.toString(stack));
		System.out.println(peek());
		
	
		
	}
	
	// 삽입
	static boolean push(String value) {
		if(isFull()) {
			System.out.println("가득 참 ㅋ");
			return false;
		}
		
		top++;
		stack[top] = value;
		
		return true;
		
		
	}
	// 조회
	static String peek() {
		if(isEmpty()) {
			System.out.println("아무것도 없는 스택인데? ㅋ");
			return null;
		}
		
		return stack[top];
	}
	
	// 공백
	static boolean isEmpty() {
		return top==-1?true:false;
	}
	
	// 포화
	static boolean isFull() {
		return top == stack.length-1;
	}
	
	//삭제
	static String pop() {
		if(isEmpty()) {
			System.out.println("스택 비어 있는데?");
			return null;
		}
		
		// 가장 위에 있는 원소를 구하고, 그 뒤에 top 인덱스를 줄여준다.
		return stack[top--];
		
	}
	
}
