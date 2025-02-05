package test05_객체직렬화;

import java.io.*;
import java.util.*;

public class SerializationTest4 {
	public static void main(String[] args) {	
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person2.dat"));
			// List<Person>
			Object obj = ois.readObject();
			
			System.out.println(obj); // 동적 바인딩
			
			List<Person> list = (List<Person>) obj;
			for(Person p:list) {
				System.out.println(p);
			}
			

		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
			
	}

}
