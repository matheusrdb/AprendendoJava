package br.com.alura.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.alura.modules.Aula;
import br.com.alura.modules.Curso;

public class TestaCurso2 {
	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando coleções Java", "Paulo Silveira");
		
		List<Aula> aulasImutavel = javaColecoes.getAulas(); // javaColecoes.getAulas() -> DEVOLVE UMA LISTA IMUTÁVEL!
		System.out.println(aulasImutavel);
		
		javaColecoes.adiciona(new Aula("Entendendo ArrayLists", 20));
		javaColecoes.adiciona(new Aula("Entendendo LinkedLists", 15));
		javaColecoes.adiciona(new Aula("ArrayList versus LinkedList", 10));
		
		System.out.println(aulasImutavel);
		
		List<Aula> aulas = new ArrayList<>(aulasImutavel);
		
		Collections.sort(aulas);
		
		System.out.println(javaColecoes.getTempoTotal());
		System.out.println(javaColecoes);
		
		
		
	}
}
