package br.com.javautil.testes;

import java.util.ArrayList;

import br.com.javautil.modules.Conta;
import br.com.javautil.modules.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		/**
		 * Usando GENERICS para definir que ArrayList só possa guardar referências do tipo Conta.
		 */
//		ArrayList<Conta> bin = new ArrayList<Conta>();
//		Essa sintaxe também funciona, porém é menos verbosa
		ArrayList<Conta> bin = new ArrayList<>();
		
		ContaCorrente cc1 = new ContaCorrente(123, 321);
		bin.add(cc1);
//		ContaCorrente cc = (ContaCorrente) bin.get(0);
		Conta cc = bin.get(0);
		
//		System.out.println(bin.get(0).toString());
		System.out.println(bin.size());
//		bin.remove(0);
//		System.out.println(bin.size());
		/**
		 * Este é o modo antigo de fazer iterações.
		 */
		for (int i = 0; i < bin.size(); i++) {
			System.out.println(bin.get(i));
		}
		/**
		 * Este é o modo certo de fazer iterações.
		 */
		for ( Object o : bin) {
			System.out.println(o);
		}
	}

}
