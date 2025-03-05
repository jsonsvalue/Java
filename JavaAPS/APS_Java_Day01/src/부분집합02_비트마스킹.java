import java.util.Arrays;

public class 부분집합02_비트마스킹 {
	static String[] ingrd = {"단무지", "햄", "오이", "계란"};
	static int N =4;
	
	static int[] sel = new int[N];
	
	public static void main(String[] args) {
		// 모든 김밥의 경우의 수 
		// for(int i=0; i<Math.pow(2, N); i++) {
		for(int i=0; i< (1<<N); i++) {
			// System.out.println(i);
			System.out.print(" 김밥 :");

			// 재료를 확인하는 단계
			for(int j=0; j<N; j++) {
				// 재료를 하나씩 쉬프트하면서 검사하는데, 0이 아닌 경우 해당 재료가 있다고 처리한다.
				if((i & (1<<j)) != 0) {
					System.out.printf("%s ",ingrd[j]);
				}
			}
			System.out.println();
		}
		
		
		
		
		
	}
	
	
}
