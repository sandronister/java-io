package br.com.sandroni.io;

import java.io.IOException;
import java.io.PrintStream;

public class writeFilePrintStream {

	public static void main(String[] args) throws IOException{
		
		PrintStream ps = new PrintStream("lorem5.txt");
		
		ps.println("Iniciando a escrever arquivos com Stream, está certo");
		ps.println("Pois bem é isso que queria ver");
		ps.print("Obrigado");

	}

}
