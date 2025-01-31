package abstractClass02;

public abstract class Chef {
	String name;
	int age;
	String specialty;
	
	public void eat() {
		System.out.println("Eats food");
	}
		
	public abstract void cook();
	
//	{
//		System.out.println("Makes whatever the fuck he wants");
//	}

}
