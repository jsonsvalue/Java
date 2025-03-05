package 연결큐;

public class LinkedQueue {
	public Node front;
	public Node rear;
	
	// 삽입
	public void enQueue(int data) {
		Node node = new Node(data);
		if(front == null) {
			front = rear = node;
		}else {
			rear.link = node;
//			rear = rear.link;
			rear = node;
		}
		
		
	}
	
	// 삭제
	public int deQueue() {
		if(front != null) {
			int data = front .data;
			front = front.link;
			return data;
		}
		
		return -1;
	}
	
	
	
}
