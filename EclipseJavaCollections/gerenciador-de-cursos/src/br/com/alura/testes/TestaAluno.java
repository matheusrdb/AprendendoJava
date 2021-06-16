package br.com.alura.testes;

import java.util.HashSet;
import java.util.Set;

public class TestaAluno {
	
	public static void main(String[] args) {

        Set<String> alunos = new HashSet<>();
        alunos.add("Paulo");
        alunos.add("Alberto");
        alunos.add("Pedro");    
        alunos.add("Nico");  
        alunos.add("Nico");
        
        boolean adicionou = alunos.add("Pedro");
        System.out.println("Pedro foi adicionado ao Set? " + adicionou);
        
        //Modo manual
        for (int i = 0; i < alunos.size(); i++) {
        	String[] array = new String[alunos.size()];
        	alunos.toArray(array);
        	System.out.println(array[i]);
        }
        
       //tente imprimir os alunos usando foreach
//        alunos.forEach(aluno -> {
//        	System.out.println(aluno);
//        });
    }
}
