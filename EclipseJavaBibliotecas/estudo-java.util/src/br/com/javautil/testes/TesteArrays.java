package br.com.javautil.testes;

import br.com.javautil.modules.Conta;
import br.com.javautil.modules.ContaCorrente;
import br.com.javautil.modules.ContaPoupanca;

public class TesteArrays {
	
	public static void main(String[] args) {
		
		String[] nomes = new String[5];
		System.out.println(nomes.length);
		/**
		 * O código abaixo não compila pois não há uma referência para um objeto do tipo String,
		 * resultando em uma NullPointerException
		 */
		//System.out.println(nomes[1].isEmpty());
		nomes[1] = "meu pau de asa";
		System.out.println(nomes[1].isEmpty());
		System.out.println(nomes[1]);
		
		Conta[] contas = new Conta[4];
		
		contas[0] = new ContaPoupanca(123, 321);
		contas[1] = new ContaPoupanca(321, 123);
		contas[2] = new ContaCorrente(234, 432);
		contas[3] = new ContaCorrente(432, 234);
		
		ContaPoupanca refs = (ContaPoupanca) contas[1]; //type cast
		
//		for (int i = 0; i < contas.length; i++) {
//			int valor = i * contas.length;
//			System.out.println(valor);
//			
//			System.out.println(contas[i].getAgencia());
//		}
		
	
	}

}
