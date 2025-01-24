package class04;

public class DogTest {
	public static void main(String[] args) {
		Dog d1 = new Dog("Coby", 10);
		
		//d1.name = "꼽이";
		//d1.age = 15;
		
		Dog d2 = new Dog("Max", 5);
		
		Dog d3 = new Dog(10);
		System.out.println(d3.name);
		System.out.println(d3.age);
		
	}
}
