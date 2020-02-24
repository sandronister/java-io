package br.com.sandroni.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationTest {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

//		String nome = "Júlio César";
//		
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("obj.bin"));
//		
//		oos.writeObject(nome);
//		
//		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("obj.bin"));
		
		String name = (String) ois.readObject();
		ois.close();
		
		System.out.println(name);
	}

}
