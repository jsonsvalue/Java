
public class String04_BruteForceMatch {
	public static void main(String[] args) {
		String text = "This isn't a book";
		String find = "isn't";
		System.out.println(matchFor(text, find));
	
	}
	
	static int matchFor(String t, String f) {
		int N = t.length();
		int M = f.length();
		
		// N-M개의 문자열을 확인한다.
		for(int i=0; i<N-M+1; i++) {
			// 주어진 문자열과 찾으려는 문자열이 하나라도 틀리면 False를 반환한다.
			boolean match = true;
			for(int j=0; j<M; j++) {
				if(t.charAt(i+j) != f.charAt(j)) {
					match = false;
					break;
				}
			}
			// 주어진 문자열과 찾으려는 문자열이 모두 일치하면 True를 반환한다.
			if(match)
				return i;
		}
		
		return -1;
		
		
	}
	
}
