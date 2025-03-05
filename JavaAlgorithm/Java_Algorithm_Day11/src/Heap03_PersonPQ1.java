import java.util.PriorityQueue;


	class Person implements Comparable<Person>{
		String name;
		int age;
	
	
	public Person() {
		this("김싸피", 13);
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	@Override
	public int compareTo(Person o) {
		return this.age - o.age;
		
		//return this.name.compareTo(o.name);
	}

	}	
	
	public class Heap03_PersonPQ1 {	
		public static void main(String[] args) {
			PriorityQueue<Person> pq = new PriorityQueue<>();
			
			pq.add(new Person("A", 35));
			pq.add(new Person("B", 29));
			pq.add(new Person("C", 38));
			pq.add(new Person("D", 28));
			
			System.out.println(pq.poll());
			
		}
	
	
	}










