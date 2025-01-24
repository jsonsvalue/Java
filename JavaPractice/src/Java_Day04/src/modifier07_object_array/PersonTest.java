package modifier07_object_array;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person("Yang", 45, "Youtube");
		Person p2 = new Person("Hong", 25, "Golf");
		
		// 사람 명단을 관리하는 클래스를 이용해 객체를 생성하는 방식이 아니라,
		// 클래스 메서드를 통해서 이미 클래스 내 만들어진 하나의 객체를 활용하여 사람 명단을 관리한다.
		// PersonManager pm = new PersonManager();
		PersonManager pm = PersonManager.getInstance();
		
		pm.addPerson(p1);
		pm.addPerson(p2);
		
		// 사람 명단을 관리하기 위한 클래스 내 객체를 2개 만들어서 사용하면 안되기 때문에,
		// Singleton Pattern을 통해서 이미 클래스 내 생성된 하나의 객체를 활용하여 사람 명단을 관리한다.
		// PersonManager pm2 = new PersonManager();
		
	}
}




