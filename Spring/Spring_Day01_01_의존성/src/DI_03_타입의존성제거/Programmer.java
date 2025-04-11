package DI_03_타입의존성제거;

import DI_01.Desktop;

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
	
	// Desktop 객체를 가져와서 매개변수로 넣음으로써 객체 생성 의존성을 제거한다.
	public Programmer(Computer comp) {
		this.computer = comp;
		
	}
	
	public void coding() {
		System.out.println(computer.getInfo()+"으로 개발할게");
	}
}
