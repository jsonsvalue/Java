import java.util.Arrays;

public class String02_회문 {
	public static void main(String[] args) {
		// str을 이용한 뒤집기
		String str = "회문이라뒤집어진줄도몰랐네";
		int N= str.length();
		
		char[] arr1 = new char[N];
		for(int i=0; i<N; i++) {
			arr1[i]= str.charAt(N-1-i);
			System.out.println(str.charAt(N-1-i));
		}
		
		System.out.println(Arrays.toString(arr1));
		
		// StringBuilder
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		System.out.println(sb.reverse().toString());
		
		// swap
		// 중간까지 앞 뒤의 원소를 바꿔준다. 
		char[] arr2 = str.toCharArray();
		for(int i=0; i<N/2; i++) {
			char temp = arr2[i];
			arr2[i] = arr2[N-1-i];
			arr2[N-1-i] = temp;
		}
		System.out.println(Arrays.toString(arr2));
		
		
	}
}
