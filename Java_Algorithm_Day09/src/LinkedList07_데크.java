import java.util.ArrayDeque;
import java.util.Deque;

import 데크.LinkedListDeque;

public class LinkedList07_데크 {
	public static void main(String[] args) {
		LinkedListDeque<Integer> deque = new LinkedListDeque<>();
		
		deque.addFirst(10);
		System.out.println(deque.removeFirst());
		
		Deque<String> deque2 = new ArrayDeque<>();
		
		deque2.add(null);
		deque2.removeFirst();
		
	}
}
