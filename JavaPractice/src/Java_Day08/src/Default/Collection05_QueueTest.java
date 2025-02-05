package Default;
import java.util.*;

public class Collection05_QueueTest {
	public static void main(String[] args) {
		//선 입 선 출
		Queue<Integer> queue = new LinkedList<>();
		
		// 원소 추가
		queue.add(1);   // 실패 반환
		queue.offer(2); // 예외 발생 
		
		// 원소 삭제
		System.out.println(queue.poll());  // null
		System.out.println(queue.remove());// 예외 발생
		System.out.println(queue.remove());
		
		
		
	}
}
