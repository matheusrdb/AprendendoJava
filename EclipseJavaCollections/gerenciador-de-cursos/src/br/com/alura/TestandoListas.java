package br.com.alura;

import java.util.ArrayList;

public class TestandoListas {

	public static void main(String[] args) {

		String aula1 = "Trabalhando com InputStream e OutputStream";
		String aula2 = "Classes Anônimas e Lambdas";
		String aula3 = "Como funciona o MySQL";

		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);

		System.out.println(aulas);

		aulas.remove(1);

		System.out.println(aulas);

		System.out.println("A primeira aula é: " + aulas.get(0));
		System.out.println();

		for (int i = 0; i < aulas.size(); i++) {
			System.out.println(aulas.get(i));
		}
		// aula1.
		// Collections.sort(aulas);
		// Com lambda
		aulas.sort((a, b) -> {
			return a.compareTo(b);
		});

		System.out.println(aulas);
	}

}
