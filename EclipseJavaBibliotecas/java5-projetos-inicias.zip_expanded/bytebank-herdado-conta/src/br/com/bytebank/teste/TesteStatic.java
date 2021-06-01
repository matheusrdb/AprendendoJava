package br.com.bytebank.teste;

import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.ContaPoupanca;
import br.com.bytebank.modelo.AcessoConta;

public class TesteStatic {
	
	public static void main(String[] args) {
	
		Conta cc = new ContaCorrente(123, 321);
		Conta cp = new ContaPoupanca(123, 321);
		cc.setTitular("Matheus");
		cc.getTitular().setCpf("444.444.444-44");
		cc.getTitular().setProfissao("Programador");
		cc.deposita(100);
		//System.out.println(cc.getSaldo());
		
		System.out.println(cc.toString());
		System.out.println(cp.toString());
		
		//Método estático para teste do static, acessando à partir da própria classe.
		//AcessoConta.acessar(cc);
	}
}
