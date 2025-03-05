import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 조합04_중복조합 {
	static String[] ingrd = {"상추", "패티", "토마토", "치즈"};
	static String[] sel; // 햄버거를 만드는 재료를 기록하기 위함
	static int N, R;
	static List<String[]> result;
	
	public static void main(String[] args) {
		N = 4;
		R = 2;
		
		ingrd = new String[]{"상추", "패티", "토마토", "치즈"};
		result = new ArrayList<>();
		
		comb(0, new ArrayList<String>());
		
		
	}
	
	public static void comb(int start, List<String> current){
		// Base Case
		if(current.size()==R) {
			System.out.println(current);
			return;
		}
		
		// Recursive Case
		for(int i=start; i<N; i++) {
			current.add(ingrd[i]); // 재료 넣기
			comb(i,current);       // 중복 허용이라서, i를 다시 고려한다.
			current.remove(current.size()-1);
			
		}
		
		
		
	}
	
	
	
	
	
}
