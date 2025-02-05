package test05_객체직렬화;

import java.io.*;

public class SerializationTest01 {
	public static void main(String[] args) {
		Person p = new Person("Kim", 45);
		
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.dat"));
			oos.writeObject(p);


		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
			
	}

}
