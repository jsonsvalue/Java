package Comparator;
import java.util.*;

public class PersonComparator implements Comparator<Person> {

	public int compare(Person p1, Person p2) {
		return p1.name.compareTo(p2.name);
	}

	
}
