package DI_04_의존성주입;


public class Programmer {
	private String name;
	private int age;
	
	// Desktop 클래스를 가져와서 쓴다.
	private Computer computer;
	
	
	/* 기존에 있던 Desktop 클래스를 가져와서 의존적으로 쓰는 것이 아니라,
	 * public Programmer() { this.desktop = new Desktop();
	 * 
	 * }
	 */
	
	public Programmer() {	
	}
	
	// Computer 인터페이스를 이용해서, 타입에 대한 의존성을 제거한다.
		public Programmer(Computer comp) {
			this.computer = comp;
			
		}
		
	// 설정자를 이용한 의존성 주입
	public void setComputer(Computer computer) {
		this.computer = computer;
	}
	
	
	
	
	
	public void coding() {
		System.out.println(computer.getInfo()+"으로 개발할게");
	}
}
