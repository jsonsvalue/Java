
public class String03_IntStringConversion {
	public static void main(String[] args) {
		String strNum = "123456";
		int num = Integer.parseInt(strNum);
		
		System.out.println(num);
		System.out.println(convInt(strNum));
		
		String strNum2 = String.valueOf(num);
		String strNum3 = num+"";
	
	}
	
	// main 에서 쓸 수 있게 static 함수를 만든다.
	static int convInt(String str) {
		int N= str.length();
		int num =0;
		
		for(int i=0; i<N; i++) {
			char c = str.charAt(i);
			
			if('0' <=c && c<=9)
				num = (num*10) + (c-'0');
			else
				return Integer.MIN_VALUE;
			
		}
		
		return num;
		
	}
	
}
