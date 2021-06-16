package br.com.alura.modules;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Curso {

	private int tempoTotal;
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunos = new TreeSet<Aluno>((a1, a2) -> { 
		return a1.getNome().compareTo(a2.getNome());
	});

	public Curso(String nome, String instrutor) {
		if (nome == null || nome == "")
			throw new NullPointerException("ERRO: NOME INVÁLIDO!");
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}

	public void adiciona(Aula aula) {
		this.tempoTotal += aula.getTempo();
		this.aulas.add(aula);
	}

	public int getTempoTotal() {
		return this.tempoTotal;
	}

	@Override
	public String toString() {
		return "[Curso: " + this.nome + ", " + "Tempo Total: " + this.tempoTotal + " minutos]";
	}

	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
	}

	// Método da classe Collections
	public void matricula(Aluno... aluno) {
		Collections.addAll(this.alunos, aluno);

	}

	public Collection<Aluno> getAlunos() {
		return Collections.unmodifiableCollection(this.alunos);
	}

	public boolean estaMatriculado(Aluno a) {
		return this.alunos.contains(a);

	}

	public Aluno buscaMatriculado(int i) {
		
		return null;
		
	}

}