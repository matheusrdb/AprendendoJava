package br.com.aprendendo.javaio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Properties;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(new File("contas.csv"), StandardCharsets.UTF_8);
		
		
		while(scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			//System.out.println(linha);
			
			Scanner split = new Scanner(linha);
			split.useLocale(Locale.US); //Usando padrões de numeração americanos -> ponto flutuante
			
			split.useDelimiter(",");
			
			String tipo = split.next();
			int numero = split.nextInt();
			int agencia = split.nextInt();
			String titular = split.next();
			double saldo = split.nextDouble();
			
			//Formatando valores com String.format OU System.out.format();
			System.out.format(new Locale("pt", "BR"), "%s %d %d %s %012.4f %n", tipo, numero, agencia, titular, saldo);
			
//			String[] contas = linha.split(",");
//			for(int a = 0; a < 1; a++) {
//				System.out.println();
//				for (int i = 0; i < contas.length; i++)
//					System.out.print(contas[i] + " ");
//			}
		}
		
		
		scanner.close();
	}
}
