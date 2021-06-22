package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;

import static java.util.Comparator.*;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Curso {
    private String nome;
    private int alunos;

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }
    
}

class ExemploCurso {
	
	public static void main(String[] args) {
		
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		cursos.sort(comparingInt(Curso::getAlunos));
		
		OptionalDouble media = cursos.stream()
			.mapToInt(Curso::getAlunos)
			.average();
		
		System.out.println(media);
		
		List<Curso> cursos50 = cursos.stream()
			.filter(c -> c.getAlunos() >= 50)
			.collect(Collectors.toList());
		
		cursos50.forEach(c -> System.out.println(c.getNome()));
		
//		if(cursos.stream()
//			.allMatch(c -> c.getAlunos() >= 151)) {
//			
//			System.out.println("Sim, temos mais de 50 alunos");
//		} else {
//			System.out.println("Não temos mais de 151 alunos");
//		}
			
	}
	
}
