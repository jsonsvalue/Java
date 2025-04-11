import java.util.Arrays;

public class 패턴매칭01_KMP {
	public static void main(String[] args) {
		String text = "ABABABACABAABABACACA";
		String pattern = "ABABACA";
		
		
		
		System.out.println(Arrays.toString(getPi(pattern)));
		
		KMP(text, pattern);
	}
	
	// 전체 문자열 t, 주어진 패턴 p
	public static void KMP(String t, String p) {
		
		int[] pi = getPi(p);
		
		// 패턴의 인덱스
		// 본문을 순회하는 반복문
		int j=0;
		for(int i=0; i<t.length(); i++) {
			//1. i, j가 일치하지 않을 때를 처리한다.
			while(j>0 && t.charAt(i)!=p.charAt(j)) {
				j=pi[j-1];
			}
			
			//2. i, j 가 일치할 때를 처리한다.
			if(t.charAt(i)==p.charAt(j)) {
				if(j==p.length()-1) {
					System.out.println(i- p.length() +1 +"패턴 찾았다.");
					j=pi[j];
				}else {
					j++;
				}
			}
			
		}
		
	}
	
	// pi[]: 패턴 P를 인덱스 i까지 잘라서 접두사와 접미사가 일치하는 최대 길이를 저장한다.
	//실패했을 때 몇 칸을 넘어갈 것인지를 결정하게 해준다.
	public static int[] getPi(String p) {
		int[] pi = new int[p.length()];
		
		int j = 0;
		// 0부터 i까지의 부분 문자열을 만든다.
		for(int i=1; i<p.length(); i++) {
			// i 와 j가 가리키는 값이 다를 때를 처리한다.
			while(j > 0 && p.charAt(i)!=p.charAt(j)) {
				j = pi[j-1];
			}
			
			// i와 j 가 가리키는 값이 같을 때를 처리한다.
			if(p.charAt(i)== p.charAt(j))
				pi[i] = ++j;
				
		}
		
		
		return pi;
	}
}
