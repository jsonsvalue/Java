package Default;
import java.util.*;

public class Collection06_DequeTest {
	public static void main(String[] args) {
		//양방향 큐
		
		Deque<String> deque = new ArrayDeque<>();
		
		deque.addFirst("Rooney");
		deque.addFirst("Van Persie");
		deque.addFirst("Ronaldo");
		
		System.out.println(deque);
		
		
		
	}
}
