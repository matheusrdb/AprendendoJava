package br.com.javautil.testes;

import br.com.javautil.modules.Cliente;

public class TesteArray2 {
	public static void main(String[] args) {
		
		Cliente clienteNormal = new Cliente();
		clienteNormal.setNome("Flavio");

		Cliente clienteVip = new Cliente();
		clienteVip.setNome("Romulo");

		Object[] refs = new Object[5];
		refs[0]  = clienteNormal;
		refs[1]  = clienteVip;

		System.out.println(( ( (Cliente) refs[1]).getNome() ) ); //type cast
		
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}
}
