package 단일리스트;

public class SinglyLinkedList {
	private Node head;
	private int size;
	
	public SinglyLinkedList() {
		this.head = null;
		this.size = 0;
	
	}
	
	
	//조회
	public Node get(int idx) {
		// 범위를 벗어난다면, null을 돌려준다.
		if(idx<0||idx>=size) {
			// idx<0 -> 0번째 인덱스
			
			// idx>0 -> 마지막 인덱스
			return null;
		}
		
		// 그렇지 않고 중간에 위치해 있다면, 나의 현재위치까지 이동하고 현재 노드를 반환한다. 
		Node curr = head;
		for(int i=0; i < idx; i++) {
			curr = curr.link;
		}
		
		return curr;
	}
	
	
	// Node를 추가한다.(첫번째 위치, 마지막 위치, 중간 위치)
	// Node를 파라미터로 가지고 있어도 가능하다.
	public void addFirst(String data) {
		Node node = new Node(data);
		// 2. 노드를 head랑 연결한다.
		node.link = head;
		//3. 새로 만든 node를 head로 만든다.
		head = node;
		size++;
	}
	
	public void addLast(String data) {
		if(size ==0) {
			addFirst(data);
			return;
		}
		
		Node node = new Node(data);
		// 마지막 Node를 찾을 변수
		Node curr = head;
		// 전체 Node의 끝까지 갔을 때까지 순회하고, 마지막 노드에서 새로 만든 노드를 연결시킨다.
		while(curr.link !=null) {
			curr = curr.link;
		}
		curr.link = node;
		size++;
		
	}
	
	public void add(int idx, String data) {
		if(idx<0||idx>size) {
			return;
		}
		
		if(idx ==0) {
			addFirst(data);
			return;
		}
		if(idx == size) {
			addLast(data);
			return;
		}
		
		// 내가 넣고 싶은 위치의 이전 노드를 가져와야 한다.
		Node pre = get(idx-1);
		Node node = new Node(data);
		
		// 이전 노드가 가리키던 다음 노드를 현재 노드가 가리키고, 
		// 이전 노드에다가 현재 노드를 연결한다. 
		node.link = pre.link;
		pre.link = node;
		
		
	}
	
	// 삭제(처음, 중간, 끝)
	public String remove() {
		if(head == null) {
			return null;
		}
		
		String data = head.data;
		head = head.link;
		size --;
		
		return data;
		
	}
	
	public String remove(int idx) {
		if(idx ==0) 
			return remove();
		
		if(idx<0||idx>=size) {
			return null;
		}
		
		Node pre = get(idx-1);//이전 노드
//		Node rm = get(idx);
		Node rm = pre.link;
		
		String data = rm.data;
		pre.link = rm.link;
		size--;
		
		
		return data;
	}
	
	
	public void printList() {
		Node curr = head;
		
		if(head == null) {
			System.out.println("공백 리스트임 ㅋ");
			return;
		}
		
		while(curr !=null) {
			System.out.print(curr.data + "->");
			curr = curr.link;
		}
		
		
	}
	
	

}
