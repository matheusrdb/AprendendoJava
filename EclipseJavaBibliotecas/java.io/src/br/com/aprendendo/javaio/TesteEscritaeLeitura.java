package br.com.aprendendo.javaio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;

public class TesteEscritaeLeitura {

	public static void main(String[] args) throws IOException {
		
		long ini = System.currentTimeMillis();
		//Leitura do Fluxo de Dados // Input Stream Reader
		
		Socket s = new Socket();
		
		InputStream fis = new FileInputStream("leitura.txt");//Rede -> s.getInputStream(); //Teclado -> System.in; //Arquivo -> new FileInputStream("leitura.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		String entrada = br.readLine();
		
		//Escrita no fluxo de dados // OutputStreamWriter
//		OutputStream fos = new FileOutputStream("leituraCopy.txt");//Rede -> s.getOutputStream(); //Teclado -> System.out; //Arquivo -> new FileOutputStream("leituraCopy.txt");
//		OutputStreamWriter osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);

		//modo simples
//		BufferedWriter bw = new BufferedWriter(new FileWriter("leituraCopy.txt"));
		System.out.println();
		//Criando um arquivo 
		PrintStream ps = new PrintStream(new File("/home/mrrobot/Desktop/arquivoFeitoNoJava.docx"));
		
		while (entrada != null && !entrada.isEmpty()) {
			
			System.out.println(entrada);
			ps.println(entrada);
//			bw.write(entrada);
//			bw.newLine();
			entrada = br.readLine();
			
		}
		
		br.close();
		ps.close();
		
		long end = System.currentTimeMillis();
		System.out.println("Passaram " + (end - ini) + " millisegundos.");
	}

}
