package 연결스택;

public class LinkedStack {
	public Node top;
	
	// 삽입
	public void push(int data) {
		Node node = new Node(data);// 새로운 노드 생성
		node.link = top; //node 가 가리키는 주소를 top으로 지정한다.
		top = node;// 그리고 해당 node를 top으로 만든다.
		
	}
	
	//삭제
	public int pop() {
		if(top == null) {
			// 공백인 스택
			return -1;
		}
		int data = top.data;
		top = top.link;
		return data;
	}
	
	public int peek() {
		if(top == null) return -1;
		return top.data;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	
	
	
	
	
}
