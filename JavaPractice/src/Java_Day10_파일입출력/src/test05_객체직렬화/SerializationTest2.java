package test05_객체직렬화;

import java.io.*;

public class SerializationTest2 {
	public static void main(String[] args) {	
		try {
			//ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.dat"));
			//oos.writeObject(p);
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.dat"));
			Object obj = ois.readObject();
			
			System.out.println(obj); // 동적 바인딩

		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
			
	}

}
