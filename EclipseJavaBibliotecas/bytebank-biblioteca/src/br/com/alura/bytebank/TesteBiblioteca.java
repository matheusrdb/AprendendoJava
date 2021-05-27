package br.com.alura.bytebank;

import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;

public class TesteBiblioteca {

	public static void main(String[] args) {
		
		Conta cc = new ContaCorrente(123, 321);
		//String str = "Olá";
		
		cc.deposita(100);
		System.out.println(cc.getSaldo());
	}

}
