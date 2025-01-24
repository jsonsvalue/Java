package Class02;

public class Person {
	String name;
	int age;
	String hobby;
	
	void info() {
		System.out.println("------------------");
		System.out.printf("나의 이름은 %s입니다. %n나이는 %d이고, 취미는 %s입니다.%n", name, age, hobby);
		System.out.println("------------------");
	}
	
	
	void study(int time) {
		System.out.printf("%d시간 공부했습니다.", time);
	}
	
	void study(long time) {
		System.out.printf("%d시간 공부했습니다.", time);
	}
	
	void study(double time) {
		System.out.printf("%d시간 공부했습니다.", time);
	}
	
	
}
