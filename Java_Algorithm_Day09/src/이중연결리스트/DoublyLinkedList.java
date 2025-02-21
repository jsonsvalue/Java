package 이중연결리스트;

public class DoublyLinkedList {
	private Node head;
	private Node tail;
	private int size;
	

	
	public DoublyLinkedList() {		
	}
	
	//조회
	public Node get(int idx) {
		if(idx<0 || idx>=size)
			return null;
		
		Node curr;
		
		if(idx<size/2) {
			curr = head;
			for(int i=0; i<idx; i++) {
				curr = curr.next;
			}
		}else {
			curr = tail; 
			for(int i=size-1; i>idx; i--) {
				curr = curr.prev;
			}
		}
		
		return curr;
	}
	
	
	//첫번째에 위치 삽입
	public void addFirst(String data) {
		Node node = new Node(data);
		
		// 첫번째 노드를 헤드랑 연결한다.
		node.next = head;
		// 기존 노드를 새로 지정된 node랑 연결한다.
		if(head!=null) {
			head.prev = node;
		}
		head = node;
		size++;
		
		//노드가 1개뿐인 상황을 가정
		if(head.next == null) {
			tail = head;
		}
		
	}
	
	
	//마지막 위치 삽입
	public void addLast(String data) {
		if(size ==0) {
			addFirst(data);
			return;
		}
		
		Node node = new Node(data);
		
		// node랑 tail 앞뒤 연결
		tail.next = node;
		node.prev = tail;
		// node를 tail로 지정
		tail = node;
		size++;
	}
	
	// 중간 위치에 삽입
	public void add(int idx, String data) {
		if(idx<0 || idx>size)
			return;
		if(idx==0) {
			addFirst(data);
			return;
		}
		if(idx == size) {
			addLast(data);
			return;
		}
		
		Node prevNode = get(idx-1);
		Node nextNode = prevNode.next;
		
		Node node  = new Node(data);
		
		// nextNode를 이용해서 더 편하게 구현한다.
		// 이전 노드와 새로 만든 노드를 연결한다.
		prevNode.next = node;
		node.prev = prevNode;
		
		// 이후 노드와 새로 만든 노드를 연결한다.
		node.next = nextNode;
		nextNode.prev = node;
		size++;
		
	}
	
	//첫번째 위치 삭제
	public String remove() {
		if(head == null) { //size == 0
			return null;
		}
		
		String data = head.data;
		Node nextNode = head.next;
		if(nextNode != null) {
			nextNode.prev = null;
		}
		head = nextNode;
		size--;
		
		if(size==0) {
			tail = null;
		}
		
		return data;
		
	}
	
	//중간 노드 삭제
	public String remove(int idx){
		if(idx>=size || idx<0)
			return null;
		
		if(idx ==0)
			return remove();
		
		Node prevNode = get(idx-1);
		Node nextNode = prevNode.next.next;
		
		String data = prevNode.next.data;
		
		if(nextNode != null) {
			nextNode.prev = prevNode;
			prevNode.next = nextNode;
		}
		
		else {
			prevNode.next = null;
			tail = prevNode;	
		}
		
		size--;
		return data;
	}
	
	//출력
	public void printList() {
		Node curr = head;
		if(head == null) {
			System.out.println("공백");
			return;
		}
		while(curr!=null) {
			System.out.println(curr.data + "->");
			curr = curr.next;
		}
	
		
	}
	
	
	
	
}
