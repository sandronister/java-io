package br.com.sandroni.io;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class ReadWithScanner {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(new File("contas.csv"));
		
		while(sc.hasNextLine()) {
			String linha = sc.nextLine();
			System.out.println(linha);
			
			Scanner ssc = new Scanner(linha);
			
			ssc.useDelimiter(",");
			ssc.useLocale(Locale.US);
			
			String tipoConta = ssc.next();
			int agencia = ssc.nextInt();
			int conta = ssc.nextInt();
			String titular = ssc.next();
		    Double saldo = ssc.nextDouble();
			
			System.out.format(new Locale("pt","BR"),"%s - %04d-%08d,%20s: %08.2f %n",tipoConta,agencia,conta,titular,saldo);
			ssc.close();

		}
		
		sc.close();
	}
}
