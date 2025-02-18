package 단일리스트;

public class Node {
	// 값 data를 저장한다.
	public String data;
	//Node라는 다음 주소를 저장하는 변수
	public Node link;
	
	public Node(String data) {
		this.data = data;
		this.link = null;
	}
	
}
