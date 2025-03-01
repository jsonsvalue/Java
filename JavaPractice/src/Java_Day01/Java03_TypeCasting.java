
public class Java03_TypeCasting {
	public static void main(String[] args) {
		// 형변환 : 자료형을 바꾸는 행위
		
		// 묵시적 형태 번환
		// 작은 데이터 타입 -> 큰 데이터 타입
		// 자동적으로 자료 형태 변환한다.
		int age = 10; 
		double age2 = age;
		
		
		// 명시적 형태 변환
		// 큰 데이터 타입 -> 작은 데이터 타입 
		// 명시적으로 자료 형태를 변환해야 한다.
		double age3 = 1000;
		int age4 = (int)age3; // 데이터 손실 가능성 있다. 
		
	}
}
