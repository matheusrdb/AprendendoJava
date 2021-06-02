package br.com.javautil.modules;

public class AcessoConta {
	
	public static void acessar(Conta nome) {
		System.out.println("Nome do títular:" + nome.getTitular().getNome());
		System.out.println("CPF do títular:" + nome.getTitular().getCpf());
		System.out.println("----------------------------------------");
		System.out.println("Número da Conta:" + nome.getNumero());
		System.out.println("Agência:" + nome.getAgencia());
		System.out.println("Saldo disponível:" + nome.getSaldo());
	}
	
	
}
