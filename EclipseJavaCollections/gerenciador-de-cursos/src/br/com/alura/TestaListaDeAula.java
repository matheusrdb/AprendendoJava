package br.com.alura;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestaListaDeAula {

	public static void main(String[] args) {

		Aula a1 = new Aula("A", 4);
		Aula a2 = new Aula("B", 2);
		Aula a3 = new Aula("C", 3);

		List<Aula> aulas = new ArrayList<Aula>();

		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);

//		System.out.println(aulas);
//		System.out.println();

		// Collections.sort(aulas);

		System.out.println("Sem ordenação: ");
		System.out.println(aulas);
		System.out.println();

		// aulas.sort((aula1, aula2) -> { return
		// aula1.getTitulo().compareTo(aula2.getTitulo()); });
		aulas.sort(Comparator.comparing(Aula::getTempo));

		System.out.println("Com ordenação: ");
		System.out.println(aulas);
	}

}
