package br.com.sandroni.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class readFile {

	public static void main(String[] args) throws IOException{
		
		InputStream fis = new FileInputStream("lorem.txt");
		Reader isr = new InputStreamReader(fis);
		BufferedReader bfr = new BufferedReader(isr);
		
		OutputStream fos = new FileOutputStream("lorem3.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bfw = new BufferedWriter(osw);
		
		String line = bfr.readLine();
		
		while(line!=null) {
		
			bfw.write(line);
			bfw.newLine();
			line = bfr.readLine();
			System.out.println(line);
			
		}
		
		bfw.close();
		bfr.close();
	}

}
