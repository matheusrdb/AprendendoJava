package br.com.alura.testes;

import java.util.Iterator;
import java.util.List;

import br.com.alura.modules.Aluno;
import br.com.alura.modules.Aula;
import br.com.alura.modules.Curso;

public class TestaCursoComAluno {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando coleções Java", "Paulo Silveira");

		List<Aula> aulasImutavel = javaColecoes.getAulas(); // javaColecoes.getAulas() -> DEVOLVE UMA LISTA IMUTÁVEL!
		// System.out.println(aulasImutavel);

		javaColecoes.adiciona(new Aula("Entendendo ArrayLists", 20));
		javaColecoes.adiciona(new Aula("Entendendo LinkedLists", 15));
		javaColecoes.adiciona(new Aula("ArrayList versus LinkedList", 10));

		Aluno a1 = new Aluno("Matheus Rubens", 45321);
		Aluno a2 = new Aluno("Lukas de Paula", 87591);
		Aluno a3 = new Aluno("Jhony Ramos", 89731);
		
		//usando método com Collections.addAll
		javaColecoes.matricula(a1, a2, a3);
		
//		//modo normal
//		javaColecoes.matricula(a1);
//		javaColecoes.matricula(a2);
//		javaColecoes.matricula(a3);

		//Modo de iteração Oldschool
		Iterator<Aula> iterador = aulasImutavel.iterator();
		
		while(iterador.hasNext()) {
			System.out.println(iterador.next());
		}
			
		
		// Modo manual
//		for (int i = 0; i < javaColecoes.getAlunos().size(); i++) {
//			Aluno[] array = new Aluno[javaColecoes.getAlunos().size()];
//			javaColecoes.getAlunos().toArray(array);
//			System.out.println(array[i]);
//		}

		javaColecoes.getAlunos().forEach(aluno -> {
			System.out.println(aluno.getNome());
		});
		
		Aluno a = new Aluno("Matheus Rubens", 45321);
		System.out.println("O aluno " + a.getNome() + ", está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a));

	}

}
