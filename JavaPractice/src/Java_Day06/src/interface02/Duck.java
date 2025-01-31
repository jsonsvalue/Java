package interface02;
// 인터페이스에서는 다중 구현 가능하다.
public class Duck implements Flyable, Swimmable {
	@Override
	public void swim() {
		System.out.println("I'm a duck! And I can swim!");
	}
	
	@Override
	public void fly() {
		System.out.println("I'm a duck! And I can fly");
	}
	
}
