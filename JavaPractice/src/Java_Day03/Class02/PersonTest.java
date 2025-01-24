package Class02;

public class PersonTest {
	public static void main(String[] args) {
		// Class를 이용해서 겍체를 생성한다.
		// 내가 만든 참조 자료형에 해당된다.
		
		Person js = new Person();
		js.name = "Jaeseok";
		js.age = 30;
		js.hobby = "Driving";
		//System.out.println("나의 이름은 "+ js.name + "입니다.");
		js.info();
		
		Person dh = new Person();
		dh.name = "Dahyeon";
		dh.age = 26;
		dh.hobby = "Cafe";
		//System.out.println("나의 이름은 "+ dh.name+ "입니다.");
		//System.out.printf("나의 이름은 %s입니다. %n나이는 %d이고, 취미는 %s입니다.", dh.name, dh.age, dh.hobby);
		dh.info();
		
		
		//static 함수가 아닐 때는, 객체를 생성하고 메서드를 쓸 수 있다.
		new PersonTest().info2(js.name);
		
	}
	
	 public void info2(String name){
		 System.out.println("나의 이름은" + name);
		 
	 } 

	
}
