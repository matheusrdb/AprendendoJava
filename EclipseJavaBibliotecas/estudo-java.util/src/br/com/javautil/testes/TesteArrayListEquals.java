package br.com.javautil.testes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import br.com.javautil.modules.Conta;
import br.com.javautil.modules.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		/**
		 * Transformando um Array em uma lista com (java.util.Arrays)
		 */
		List<String> argumentos = Arrays.asList(args);
		/**
		 * Basicamente identico ao ArrayList só que threadsafe
		 */
		List<Conta> vector = new Vector<Conta>();
		/**
		 * Lista duplamente linkada, procure material de estudo para entender melhor o funcionamento.
		 */
		LinkedList<Conta> linkedList = new LinkedList<Conta>();
		/**
		 * Um array que pode ser dinâmicamente controlado podendo ser expandido a custa de processamento.
		 */
		List<Conta> bin = new ArrayList<>();
		
		ContaCorrente cc1 = new ContaCorrente(123, 321);
		ContaCorrente cc2 = new ContaCorrente(123, 321);
		
		bin.add(cc1);
//		bin.add(cc2);
		bin.get(0);
		System.out.println(cc2.retorna());
		System.out.println();
		cc1.equals(cc2);
		
		System.out.println(bin.contains(cc2));
		
		

		
		
	}

}
