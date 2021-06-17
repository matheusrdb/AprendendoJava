package br.com.alura.modules;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
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
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

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

	public void matricula(Aluno... aluno) {
		for(int i = 0; i < aluno.length; i++) {
			this.alunos.add(aluno[i]);
			this.matriculaParaAluno.put(aluno[i].getMatricula(), aluno[i]);
		}
	}

	public Collection<Aluno> getAlunos() {
		return Collections.unmodifiableCollection(this.alunos);
	}

	public boolean estaMatriculado(Aluno a) {
		return this.alunos.contains(a);

	}
	/**
	 * Devolve um objeto do tipo Aluno de acordo com a (matricula) especificada.
	 * 
	 * @param matricula
	 * @return
	 */
	public Aluno buscaMatriculado(int matricula) {
		if(this.matriculaParaAluno.containsKey(matricula)) {
			return this.matriculaParaAluno.get(matricula);
		}
		throw new NoSuchElementException("O número de matrícula especificado não existe.");
	}
	/**
	 * Devolve uma ArrayList do tipo Alunos de acordo com os numeros de (matricula) especificados.
	 * 
	 * @param matricula
	 * @return
	 */
	public ArrayList<Aluno> buscaMatriculado(int... matricula) {
		ArrayList<Aluno> alunos = new ArrayList<>();

		for(int i = 0; i < matricula.length; i++) {
			if(this.matriculaParaAluno.containsKey(matricula[i])) {
				alunos.add(this.matriculaParaAluno.get(matricula[i]));
			} 
			else { 
				throw new NoSuchElementException("O número de matrícula"+ this.matriculaParaAluno.get(matricula[i]).getMatricula() + "especificado não existe."); 
			}
				
		}
		return alunos;
	}

}