package Default;

import java.util.*;

public class Collection02_SetTest {
	public static void main(String[] args) {
		// Set: 순서 X, 중복 X
		
		Set<Person> names = new HashSet<>();
		
		// Hash 함수로 데이터가 저장될 인덱스로 저장할 때, 동일한 인덱스 내 HashSet의 데이터가 동일하면 데이터를 추가로 삽입하지 않는다.  
		names.add(new Person("Rooney",10));
		names.add(new Person("Van Persie",1));
		names.add(new Person("Rooney",10));
		names.add(new Person("Giggs",20));
		names.add(new Person("Ronaldo",15));
		names.add(new Person("Rooney",10));
		names.add(new Person("Rooney",10));
		names.add(new Person("Rooney",10));
		
		System.out.println(names);
		
	}
}
