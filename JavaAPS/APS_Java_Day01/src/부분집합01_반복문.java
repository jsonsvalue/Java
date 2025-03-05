import java.util.Arrays;

public class 부분집합01_반복문 {
	static String[] ingrd = {"단무지", "햄", "오이", "계란"};
	static int N =4;
	
	static int[] sel = new int[N];
	
	public static void main(String[] args) {
		
		// 반복문 : 재료의 개수만큼 4중 for문을 쓴다.
		for(int i=0; i<=1; i++) {
			sel[0] = i;
			for(int j=0; j<=1; j++) {
				sel[1] = j;
			for(int k=0; k<=1; k++) {
				sel[2] = k;
				for(int l=0; l<=1; l++) {
					sel[3] = l;
					System.out.println(Arrays.toString(sel));
					}
				}
			}
		}
		
		
		
		
	}
	
	
}
