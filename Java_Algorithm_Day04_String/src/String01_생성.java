import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class String01_생성 {
	public static void main(String[] args) {
		// 1. Literal 사용 -> String pool
		String str1 = "Hello";
		String str2 = "Hello";
		
		System.out.println(str1 == str2);
				
		//2. 힙에 생성한다.
		String str3 = new String("Hello");
		System.out.println(str1==str3);
		System.out.println(str1.equals(str3));
		
		byte[] bytes = {65,66,67};
		String str4 = new String(bytes, StandardCharsets.UTF_8);
		System.out.println(str4);
		
		// 문자열은 불변성을 가지고 있지만, 문자열에서 문자를 하나씩 추출할 수 있다.
		// String -> char로 하나씩 다룰 수 있다.
		// 문자열을 char[] 배열로 만들어보자.
		int len = str1.length();
		char[] arr1 = new char[len];
		for(int i=0; i<len ;i++) {
			//System.out.println(str1.charAt(i));
			arr1[i] = str1.charAt(i);
		}
		
		System.out.println(Arrays.toString(arr1));
		
		// 조금 더 편한 버전의 구현
		char[] arr2 = str1.toCharArray();
		System.out.println(arr2);
		
		System.out.println(Arrays.toString(arr2));
		
		for(char c: str2.toCharArray())
			System.out.println(c);
		
		// 문자 1개를 입력 받는 방법
		String[] numbers = "one two three".split(" ");
		System.out.println(Arrays.toString(numbers));
		
		
	}
	
}
