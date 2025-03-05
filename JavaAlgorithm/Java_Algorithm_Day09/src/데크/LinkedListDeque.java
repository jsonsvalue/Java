package 데크;
//T로 제네릭하게 어떤 데이터 자료형이든 쓸 수 있다.
public class LinkedListDeque<T> {
	//내부에 Node를 정의해놓고 쓰자
	private class Node{
		T data;
		Node prev;
		Node next;
		
		Node(T data){
			this.data = data;
		}
	}
	
	
	private Node front;
	private Node rear;
	private int size;
	
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public int size() {
		return size;
	}
	
	public void addFirst(T item) {
		Node node = new Node(item);
		if(isEmpty()) {
			front = node;
			rear = node;
		}else {
			node.next = front;
			front.prev = node;
			front = node;
		}
		size++;
	}
	
	//뒤쪽에 새로운 원소를 추가
	public void addLast(T item) {
		Node node = new Node(item);
		if(isEmpty()) {
			front = node;
			rear = node;
		}else {
			rear.next = node;
			node.prev = rear;
			rear = node;
		}
		size++;
	}
	
	//앞쪽 노드를 삭제
	public T removeFirst() {
		if(isEmpty())
			return null;
		
		T data = front.data;
		if(size ==1) {
			front = null;
			rear= null;
		}else {
			// 2번째 노드를 첫번째 노드로 만들어주고, 첫번째의 연결관계를 없앤다.
			front = front.next;
			front.prev = null;
		}
		size--;
		return data;
	
	}
	
	//뒤쪽 노드 삭제
	public T removeLast() {
		if(isEmpty()) {
			return null;
		}
		T data = rear.data;
		
		if(size ==1) {
			front = rear = null;
		}else {
			rear = rear.prev;
			rear.next = null;
		}
		size --;
		return data;
		
	}
	
	
	
	//peek
	public T peekFirst() {
		if(isEmpty())
			return null;
		
		return front.data;
		
	}
	
	
	public T peekLast() {
		if(isEmpty())
			return null;
		
		return rear.data;
	}
	
	
	
	
	
	
}
