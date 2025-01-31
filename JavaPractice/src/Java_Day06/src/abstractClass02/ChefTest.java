package abstractClass02;

public class ChefTest {
	public static void main(String[] args) {
		Chef[] chefs = new Chef[2];// 여러 종류의 요리사를 한꺼번에 관리할 수 있다.
		
		chefs[0] = new KfoodChef();
		chefs[1] = new JfoodChef();
		
		for(Chef chef:chefs) {
			chef.eat();
			chef.cook();// 동적 바인딩으로 인해서, 한식/일식에 맞는 요리 코드를 출력하게 된다.
		}
		
		// Chef에서 cook 메서드를 지웠을 때, 직접 명시적으로 인스턴스를 형변환해서 써야한다.
//		for(Chef chef:chefs) {
//			if(chef instanceof KfoodChef) {
//				KfoodChef k = (KfoodChef)chef;
//				k.cook();
//			}else if(chef instanceof JfoodChef) {
//				((JfoodChef)chef).cook();// 연산자의 우선순위 때문에 오류가 나는 것임
//									   // chef.cook()을 먼저 연산하기 때문에 오류가 나는 것이다.	
//			}
//			
//		}
		
	}
}
