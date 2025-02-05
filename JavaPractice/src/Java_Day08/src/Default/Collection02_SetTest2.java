package Default;

import java.util.*;

public class Collection02_SetTest2 {
	public static void main(String[] args) {
		// Set: 순서 X, 중복 X
		
		Set<String> names = new HashSet<>();
		
		names.add("Rooney");
		names.add("Giggs");
		names.add("Evra");
		names.add("Ronaldo");
		names.add("Van Persie");
		names.add("Evra");
		names.add("Ronaldo");
		names.add("Rooney");
		names.add("Van Persie");
		names.add("Giggs");
		
		System.out.println(names);
		
	}
}
