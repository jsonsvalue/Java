import java.util.*;

public class Stack06_계산기 {
	public static void main(String[] args) {
		String str = "(6+5*(2-8)/2)";
		
		// +,- = 동급 1
		// *,/ = 동급 2
		Map<Character, Integer> priority = new HashMap<>();
		priority.put('(', 0);
		priority.put('+', 1);
		priority.put('-', 2);
		priority.put('*', 3);
		priority.put('/', 4);
		
		
		
		StringBuilder postFix = new StringBuilder();
		
		Stack<Character> op = new Stack<>();
		
		for(int i=0; i<str.length(); i++) {
			//'('
			if(str.charAt(i) == '(') {
				
				op.push(str.charAt(i));
			}
			//')'
			else if(str.charAt(i) == ')') {
				// 여는 괄호를 만날때까지 꺼내고, 버린다.
				while(op.peek() != '(') {
					postFix.append(op.pop());
				}
				op.pop();
			}
			// 피연산자(한자리라고 가정)
			else if(str.charAt(i) >='0' && str.charAt(i)<='9'){
				postFix.append(str.charAt(i));
			}
			//연산자 
			else {
				//공백 O
				if(op.isEmpty())
					op.push(str.charAt(i));
				//공백 X
				else {
					// 연산자 우선순위를 비교해서 처리한다.
					while(priority.get(op.peek()) >= priority.get(str.charAt(i))&& !op.isEmpty()) {
						postFix.append(op.pop());
					}
					op.push(str.charAt(i));
				}
			}
			
		}
		System.out.println(postFix);
		// 계산
		Stack<Integer> calc = new Stack<>(); //숫자를 담을 스택
		for(int i=0; i<postFix.length(); i++) {
			if(postFix.charAt(i)>='0' && postFix.charAt(i)<='9') {
				calc.push(postFix.charAt(i) -'0');
			}else {
				int B = calc.pop();
				int A = calc.pop();
				
				switch(postFix.charAt(i)) {
				case '+':
					calc.push(A+B);
					break;
				case '-':
					calc.push(A-B);
					break;
				case '*':
					calc.push(A*B);
					break;
				case '/':
					calc.push(A/B);
					break;
				}
				
			}
			
		}
		
		System.out.println(calc.pop());
		
		
		
		
	}
	

}
