package br.com.javautil.testes;

import java.util.LinkedList;
import java.util.List;

public class parseNumber {

	public static void main(String[] args) {
	
	//Uma string que guarda um valor 
	String cpf = " 4 44.444.444-48";
	//Tratamento da String cpf para fazer parse para long
	cpf = cpf.replace(".", "");
	cpf = cpf.replace("-", "");
	cpf = cpf.replace(" ", "");
	//Parse para tipo primitivo long
	long rawCpf = Long.parseLong(cpf);
	
	List<Number> listCpf = new LinkedList<>();
	listCpf.add(rawCpf);
	
//	System.out.println(numCPF);
	}

}
