package DI_01;

public class Programmer {
	private String name;
	private int age;
	
	private Desktop desktop;
	
	public Programmer() {
		this.desktop = new Desktop();
		
	}
	
	public void coding() {
		System.out.println(desktop.getInfo()+"으로 개발할게");
	}
}
