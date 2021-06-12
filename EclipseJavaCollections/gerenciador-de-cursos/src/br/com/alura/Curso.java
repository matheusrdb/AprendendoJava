package br.com.alura;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso {
	
	private int tempoTotal;
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();

	public Curso(String nome, String instrutor) {
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
}