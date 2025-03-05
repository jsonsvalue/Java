import java.util.Arrays;

public class 부분집합03_재귀함수 {
	static String[] ingrd = {"단무지", "햄", "오이", "계란"};
	static int N =4;
	static boolean[] sel = new boolean[N];
	
	public static void main(String[] args) {
		powerSet(0);
	}
	
	// N은 static으로 선언
	// idx: 이번에 판단할 재료
	public static void powerSet(int idx) {
		// 종료 조건
		// 재료를 전부 고려했을 때 재귀함수를 멈춘다.
		if(idx == N) {
			String tmp = "김밥 : ";
			for(int i=0; i<N; i++) {
				if(sel[i]) {
					tmp+=ingrd[i];
				}
			}
			System.out.println(tmp);
			return;
		}
		
		
		// 재귀 부분
		sel[idx] = false; // idx의 재료를 넣지 않는다.
		powerSet(idx+1);  // 다음 재료로 넘어간다.
		
		sel[idx] = true;  // idx의 재료를 넣는
		powerSet(idx+1);  // 다음 재료로 넘어간다.
		
	}
	
	
}
