package Interface05_다형성;

public class KChef implements Chef{
	
	@Override
	public void cook() {
		System.out.println("한식을 조리한다.");
	}
	
}
