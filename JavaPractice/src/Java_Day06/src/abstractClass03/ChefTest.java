package abstractClass03;

public class ChefTest {
	public static void main(String[] args) {
		Chef[] chefs = new Chef[2];// 여러 종류의 요리사를 한꺼번에 관리할 수 있다.
		
		chefs[0] = new KfoodChef();
		chefs[0].cook();
		
		// 추상 클래스 -> 완성되지 않은 코드이기 때문에 인스턴스를 생성할 수 없다.
		// 완성되지 않는 부분을 만들어주자.
		// 익명 클래스 문법을 이용하여, 1회 한정으로 구현하면 인스턴스를 생성할 수 있다.
		
		chefs[1] = new Chef() {
			@Override
			public void cook() {
				System.out.println("랜덤 요리를 만든다.");
			}
		};
		
		chefs[1].cook();
		
	}
}
