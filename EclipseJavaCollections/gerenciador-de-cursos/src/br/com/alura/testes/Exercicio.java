package br.com.alura.testes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Exercicio {

	public static void main(String[] args) {

		Map<String, Integer> nomesParaIdade = new HashMap<>();
        nomesParaIdade.put("Paulo", 31);
        nomesParaIdade.put("Adriano", 25);
        nomesParaIdade.put("Alberto", 33);
        nomesParaIdade.put("Guilherme", 26);
        // ...
        
        nomesParaIdade.keySet().forEach(nome -> {System.out.println(nome.toString()); });
        nomesParaIdade.values().forEach(nome -> {System.out.println(nome.toString()); });
        
        Set<Entry<String, Integer>> associacoes = nomesParaIdade.entrySet();
        System.out.println(associacoes.toString());;
        for (Entry<String, Integer> associacao : associacoes) {
            System.out.println(associacao.getKey() + " - " + associacao.getValue());
        }
	}
}