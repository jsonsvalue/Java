
public class Java04_Operator {
	public static void main(String[] args) {
		
		int a = 35;
		int b = 10;
		double c = 10;
		
		// 정수
//		System.out.println(a/b);
		
		// 실수
//		System.out.println(a/c);
		
		// 비교연산자
		int d = 100;
		int e = 1000;
		
//		System.out.println( d == e );
		
		String f = "Java";
		String g = "Python";
		String h = "Java";
		
		System.out.println(f == g);
		System.out.println(f == h);
		
		System.out.println(f.equals(g));
		System.out.println(f.equals(h));
		
		
		//단항 연산자
		int i =0;
		
		// 더하고 사용한다.(1)
		System.out.println(++i);
		// 사용하고 더한다.(1)
		System.out.println(i++);
		
		// 더한 값은 2가 된다.(2)
		System.out.println(i);
		
		
	}
	
}
