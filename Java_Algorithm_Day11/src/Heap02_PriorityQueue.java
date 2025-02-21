import java.util.*;

public class Heap02_PriorityQueue {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		// pq를 우선 최소힙으로 쓰면 된다.
		// 최대힙처럼 쓰려면 음수를 붙여서 쓰고, 그 뒤에 숫자 뽑을 때는 - 붙이면 된다.
		pq.add(10);
		pq.add(20);
		pq.add(15);
		pq.add(19);
		
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		
	}
}
