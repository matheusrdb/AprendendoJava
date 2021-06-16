package br.com.alura.testes;

import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {

	public static void main(String[] args) {

		Collection<Integer> numeros = new HashSet<Integer>();
		
		Long ini = System.currentTimeMillis();
		
		for (int i = 1; i <= 100000; i++) {
			numeros.add(i);
		}
		
		for (Integer numero : numeros) {
			numeros.contains(numero);
		}
		
		Long end = System.currentTimeMillis();
		
		long tempoDeExecução = end - ini;
		
		System.out.println("O tempo de execução foi de: " + tempoDeExecução + " millisegundos");
	}

}
