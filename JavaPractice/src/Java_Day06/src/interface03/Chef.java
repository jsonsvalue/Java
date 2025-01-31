package interface03;

public class Chef implements Cookable, Movable {
	@Override
	public void swim() {
		System.out.println("I'm a duck! And I can swim!");
	}
	
	@Override
	public void fly() {
		System.out.println("I'm a duck! And I can fly");
	}
	
}
