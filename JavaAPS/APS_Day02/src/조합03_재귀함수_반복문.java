import java.util.*;

public class 조합03_재귀함수_반복문 {
	static String[] ingrd = {"상추", "패티", "토마토", "치즈"};
	static String[] sel; // 햄버거를 만드는 재료를 기록하기 위함
	static int N, R;
	static List<String[]> result;
	
	public static void main(String[] args) {
		N = 4;
		R = 2;
		
		ingrd = new String[]{"상추", "패티", "토마토", "치즈"};
		sel = new String[R];
		
		result = new ArrayList<>();
		
		comb(0,0);
		
		for(String[] arr : result) {
			System.out.println(Arrays.toString(arr));
		}
		
	}
	
	public static void comb(int idx, int Sidx) {
		// Base Case
		// 반복적으로 실행되는 재귀함수를 멈추기 위한 조건이다.
		if(Sidx == R) {
			// System.out.println(Arrays.toString(sel));
			String[] temp = Arrays.copyOf(sel, R);
			result.add(temp);
			return;
		}
		
		// Recursive Case
		// 반복적으로 실행되는 재귀함수를 설정하는 것이다.
		
		// 그래서 반복적으로 실행될 함수를 최소한의 조건으로만 설정해놓고, 그 함수가 무한하게 실행되는 것을 멈추기만 하면 되는 것이다.
		
		// 범위를 정해놓고 호출할 것
		// 나를 뽑은 이후, 그 뒤에 안 뽑은 원소들을 선택한다.
		for(int i = idx; i <= N-R+Sidx; i++) {
			sel[Sidx] = ingrd[i];
			comb(i+1, Sidx+1);
			
		}
		
		
		
	}
	
	
	
	
	
}
