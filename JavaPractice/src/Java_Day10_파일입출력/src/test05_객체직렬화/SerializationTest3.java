package test05_객체직렬화;

import java.io.*;
import java.util.*;

public class SerializationTest3 {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		list.add(new Person("Kim", 45));
		list.add(new Person("Yang", 45));
		
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person2.dat"));
			oos.writeObject(list);


		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
			
	}

}
