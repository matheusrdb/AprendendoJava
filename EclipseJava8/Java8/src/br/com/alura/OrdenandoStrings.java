package br.com.alura;

import java.util.ArrayList;
import static java.util.Comparator.*;
import java.util.List;

public class OrdenandoStrings {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");

		palavras.forEach(System.out::println);

//		palavras.sort( (s1, s2) -> Integer.compare(s1.length(), s2.length()) );
		//Sem o método Integer.compare:
		palavras.sort(String::compareTo);
		palavras.sort(String.CASE_INSENSITIVE_ORDER);

		System.out.println("\nApós usar o sort com Lambda: \n");

		palavras.forEach(System.out::println);

	}
}
