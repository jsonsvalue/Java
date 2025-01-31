package Interface05_다형성;

public class Test {
	public static void main(String[] args) {
		// Kchef 대신, 참조 타입으로 Chef를 사용할 수 있다.
		Chef chef = new KChef();
		chef.cook();
		
		//인터페이스를 내가 직접 구현해서 쓰는 방법도 가끔씩 쓴다.
		Chef chef2 = new Chef() {
			@Override
			public void cook() {
				System.out.println("인터페이스 완료!");
			}
		};
		
	}
}
