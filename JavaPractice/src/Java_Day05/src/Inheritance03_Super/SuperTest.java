package Inheritance03_Super;

class Parent{
	//String name1 = "I'm your father";
	String name = "I'm your father";
	
	void hithere() {
		System.out.println("HI there motherfucker");
	}
}


class Child extends Parent{
	//String name2 = "I'm your kid";
	String name = "I'm your kid";
	
	void printName() {
		// 서로 다른 변수를 갖고 있을 때는, 해당 변수를 그대로 써도 된다.
		//System.out.println(name1);
		//System.out.println(name2);
		System.out.println(super.name);
		System.out.println(name);
	}
	
	void hithere() {
		super.hithere();
		System.out.println("You got a problem old man?");
	}
	
}

public class SuperTest {
	public static void main(String[] args) {
		Child child = new Child();
		
		child.printName();
		
	}
}
