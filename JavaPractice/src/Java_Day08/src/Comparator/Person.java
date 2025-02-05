package Comparator;
import java.util.*; 

// 내가 클래스의 비교 기준을 직접 설정해야 한다.
public class Person implements Comparable<Person>{
	String name;
	int age;
	
	public Person() {	
	}
	
	public Person(String name, int age) {
		super();;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
	@Override
	public int compareTo(Person p) {
		// 나이를 기준으로 정렬을 한다.
		// 나이가 같다면, 이름 순으로 정렬하는 것도 만들어볼 수 있다.
//		if(age == p.age) {
//			return 0;
//		}else if(age > p.age) {
//			return 1;
//		}else {
//			return -1;
//		}
		
		// 양/음수로 오름차순,내림차순으로 정렬할 수도 있다.
		return age - p.age;
		//return -(age - p.age);
		// Integer.compare(age, p.age);
		
	}
	
}
