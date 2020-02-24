package br.com.sandroni.io;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class writeFile {

	public static void main(String[] args) throws IOException{
		
		OutputStream fos = new FileOutputStream("lorem2.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bfw = new BufferedWriter(osw);
		
		bfw.write("Parabéns você está evoluiondo com isso");
		bfw.newLine();
		bfw.write("É isso ai!");
		
		bfw.close();
	}

}
