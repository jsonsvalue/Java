package 연결큐;

public class Node {
	public int data;
	public Node link;
	
	public Node(int data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", link=" + link + "]";
	}	
	
	
}
