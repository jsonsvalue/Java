package test03_CharacterStream;

import java.io.*;

public class CharaterStreamTest01 {
	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("bigInput.txt");
			FileWriter writer = new FileWriter("bigInput-copy.txt");
			
			int checkNum;
			while( (checkNum = reader.read()) != -1){
				writer.write(checkNum);	
			}
			System.out.println("정상적으로 실행 끝남.");
			
			
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
