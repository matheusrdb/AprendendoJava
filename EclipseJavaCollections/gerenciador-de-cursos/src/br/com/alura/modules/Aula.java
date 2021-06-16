package br.com.alura.modules;

public class Aula implements Comparable<Aula> {
	
	private String titulo;
	private int tempo;
	
	public Aula(String titulo, int tempo) {
		super();
		this.titulo = titulo;
		this.tempo = tempo;
	}

	public int getTempo() {
		return tempo;
	}
	
	public String getTitulo() {
		return titulo;
	}

	//ORDEM NATURAL DE SORT
	@Override
	public int compareTo(Aula other) {
		return this.titulo.compareTo(other.titulo);
	}
	
	@Override
	public String toString() {
		return "[Aula: " + this.titulo + ", " + this.tempo + " minutos]";
	}

}
