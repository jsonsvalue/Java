package Comparator;

import java.util.*;

public class PersonTest {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		
		list.add(new Person("김", 2));
		list.add(new Person("이", 1));
		list.add(new Person("박", 3));
		
		Collections.sort(list, new PersonComparator());

		// 1회 한정으로 comparator을 만들 수도 있다.
//		Collections.sort(list,new Comparator<Person>() {
//			@Override
//			public int compare(Person p1, Person p2) {
//				return p1.age - p2.age;
//			}
//		});
		
		// Lambda식을 활용해서 comparator을 만들 수도 있다.
		Collections.sort(list, (p1, p2) -> Integer.compare(p1.age, p2.age));
		
		
		
		System.out.println(list);
		
		
		
	}
}