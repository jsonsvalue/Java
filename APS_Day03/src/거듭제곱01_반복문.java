
public class 거듭제곱01_반복문 {
	public static void main(String[] args) {
		
		
		
	}
	
	// 반복문을 이용한 거듭제곱 값 구하기
	static int pow(int C, int N) {
		int result = 1;
		
		for(int i=1; i <= N; i++) {
			result *=C;
		}
		
		return result;
	}
	
	// 재귀함수를 이요한 거듭제곱 값 구하기
	static int pow2(int C, int N) {
		if(N==1)
			return C;
		
		return C * pow2(C, N-1);
		
	}
	
}
