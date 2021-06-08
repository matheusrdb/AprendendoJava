package br.com.aprendendo.javaio;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {
		
		//Leitura do Fluxo de Dados // Input Stream Reader
		FileInputStream fis = new FileInputStream("leitura.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		String linha = br.readLine();
		
		FileOutputStream fos = new FileOutputStream("leitura.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String saida = "Escrevendo via código java";
		
		

		while (linha != null) {
			
			System.out.println(linha);
			
			linha = br.readLine();
		}
		bw.newLine();
		bw.flush();
		bw.write(saida);
		
		br.close();
		bw.close();
		

	}

}
