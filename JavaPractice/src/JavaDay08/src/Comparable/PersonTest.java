package Comparable;

import java.util.*;

public class PersonTest {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		
		list.add(new Person("박", 2));
		list.add(new Person("김", 1));
		list.add(new Person("이", 3));
		
		Collections.sort(list);
		
		System.out.println(list);
		
		
	}
}