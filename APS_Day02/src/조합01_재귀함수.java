import java.util.Arrays;

public class 조합01_재귀함수 {
	static String[] ingrd = {"상추", "패티", "토마토", "치즈"};
	static String[] sel; // 햄버거를 만드는 재료를 기록하기 위함
	static int N, R;
	
	public static void main(String[] args) {
		N = 4;
		R = 3;
		
		ingrd = new String[]{"상추", "패티", "토마토", "치즈"};
		sel = new String[R];
		
		comb(0,0);
		
	}
	
	// idx: 내가 고려할 재료들의 인덱스 (재귀의 깊이)
	// Sidx: 뽑은 재료의 인덱스
	public static void comb(int idx, int Sidx) {
		//종료 조건
		if(Sidx ==R) {
			// 재료선정 완료!
			System.out.println(Arrays.toString(sel));
			return;
		}
		
		if(idx ==N) {
			// 고려할 재료를 다 고려했다면, 재귀 함수를 빠져나온다.
			return;
		}
		
		//재귀 조건
		sel[Sidx] = ingrd[idx]; // sel 배열의 첫번째 요소 선택
		comb(idx+1, Sidx+1);    // sel 배열의 두번째 요소 선택
		
		// sel[Sidx] = null;
		comb(idx+1, Sidx);      // sel 배열의 첫번째 요소는 그대로 둔채로, 두번째 요소 선택
		
		
		
	}
	
	
	
	
	
}
