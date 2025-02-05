package test04_CharacterStream;

import java.io.*;

public class CharaterStreamTest01 {
	public static void main(String[] args) {
		method1();
		method2();
	}
	
	public static void method1() {
		try {
			FileReader reader = new FileReader("bigInput.txt");
			FileWriter writer = new FileWriter("bigInput-copy3.txt");
			
			long start = System.nanoTime();
			
			int checkNum;
			while( (checkNum = reader.read()) != -1){
				writer.write(checkNum);	
			}
			long end = System.nanoTime();
			System.out.println(end - start);
			
			System.out.println("정상적으로 실행 끝남.");
			
			
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void method2() {
		try {
		
		BufferedReader reader = new BufferedReader(new FileReader("bigInput.txt"));
		BufferedWriter writer = new BufferedWriter(new FileWriter("bigInput-copy4.txt"));
		
		long start = System.nanoTime();
		
		String line;
		while((line = reader.readLine()) != null) {
			writer.write(line);
			writer.newLine();
			
		}
		
		long end = System.nanoTime();
		System.out.println(end - start);
		
		
	}catch(IOException e) {
		
		
		}
	}
	
}
