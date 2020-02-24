package br.com.sandroni.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class writeFileWriter {

	public static void main(String[] args) throws IOException{
		
	
		BufferedWriter bfw = new BufferedWriter(new FileWriter("lorem4.txt"));
		
		bfw.write("Agora mais do que nunca");
		bfw.newLine();
		bfw.write("Parabéns você está evoluiondo com isso");
		bfw.newLine();
		bfw.write("É isso ai!");
		
		bfw.close();

	}

}
