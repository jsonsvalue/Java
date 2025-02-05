package test02_ByteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class ByteStreamTest01 {
	
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			// 하단의 try문을 활용해서 파일을 닫는 방법도 있지만, try-with-resources를 이용해서 닫는 방법도 있다. 
			// try-with-resources: 형성한 FileStream이 try문이 끝났을 때 알아서 닫히게 하는 방법도 있다.
			
			// File이라는 node를 입력하는 통로이다.
			fis = new FileInputStream("bloomberg.png");
			fos = new FileOutputStream("bloomberg-copy.png");			

			// 실제로 읽은 바이트 수
			int readNum;
			byte[] buff = new byte[100];
			
			// 입력 받은 파일의 끝까지 읽을 때까지 inputStream을 확인하고,
			// 입력 스트림으로부터 받은 값으로 버퍼를 채운 뒤 입력값을 보낸다.
			
			// 그러니까 저 해당되는 파일을 100바이트 단위로 받아서 그 100바이트 기준으로 해당 파일의 바이트 수를 출력을 해서 저렇게 나왔다는 것이지?
			while( (readNum = fis.read(buff)) != -1) {
				//fos.write(check);
				System.out.println(readNum);
				fos.write(buff, 0, readNum);
			}
			
		}catch(FileNotFoundException e) {
			System.out.println("파일을 못 찾았어.");
		}
		catch (IOException e) {
			System.out.println("Input/Output problem");
		} 
		
		finally {
			// 열었던 파일을 닫는 코드
			// 해당 변수를 지역변수로 선언했기 때문에 사용할 수 없기 때문에 변수 초기화를, try 문 밖에서 해야 한다.
			// 파일이 열려서 존재한다면, 닫는 처리를 해준다.
			try {
				if( fis != null) {
					fis.close();
				}
				if(fos != null) {
					fos.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
			
			
		}	
		
		
		
	}	
}
