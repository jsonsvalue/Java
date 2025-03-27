
public class 거듭제곱02_분할정복 {
	public static void main(String[] args) {
		System.out.println(pow(2,5));
	
	}
	
	
	
	static int pow(int C, int N) {
		// Base Case
		if(N==0)
			return 1;
		
		// Recursive Case
		if( N%2 == 1 ) {
			return pow(C, (N-1)/2) * pow(C, (N-1)/2) * C;
		}else {
			return pow(C, N/2) * pow(C, N/2);
		}
		
		
	}
}
