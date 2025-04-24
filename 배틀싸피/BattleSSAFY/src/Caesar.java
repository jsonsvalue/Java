
public class Caesar {
	public static void main(String[] args) {
		String giv = "SRKKCVJJRWP";
		
		
		for(int i = 1 ; i <= 26; i++) {
			for(int j=0; j < giv.length(); j++) {
				char ch = giv.charAt(j);
				int ascii = (int) ch - 65;
				
				int charInt = (ascii + i) % 26 + 65;
				char newChar = (char) charInt;
				System.out.print(newChar);
			}
			
			System.out.println();
		}
		
		
		
//		char ch = giv.charAt(0);
//		int ascii = (int) ch - 65;
//		System.out.println(ascii);
//		
//		int charInt = (ascii + 9) % 26 + 65;
//		char newChar = (char)charInt ;
//		System.out.println(newChar);
		
	}
	
}
