package Inheritance04_overriding;

public class Test {
	public static void main(String[] args) {
		Student st = new Student();
		
		st.eat();
		st.eat(1);
		
		// toString이 없는데 어떻게 저렇게 되는 것이지?
		System.out.println(st);
		
		//System.out.println(st.info());
		
	}
	
}
