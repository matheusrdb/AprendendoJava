package br.com.javautil.testes;

import java.util.ArrayList;
import java.util.List;

import br.com.javautil.modules.BinRef;

public class IntegerNaPratica {

	public static void main(String[] args) {
		
		//Um tipo primitivo não pode ser armazenado em uma lista como no exemplo abaixo:
		
//		List<int> inteiro = new ArrayList<int>();            --> Este código não compila
		
		int idade = 30;

//		Se você já percebeu que o generics contém Integer, provavelmente se lembrou de como funciona. 
//		obrigado por ser esquecido eu do futuro >:(
		List<Integer> inteiro = new ArrayList<Integer>();
		/**
		 * Este código abaixo não deveria compilar, porém o Java transforma  
		 * este tipo primitivo em um Objeto que representa um inteiro no caso
		 * o Wrapper Integer
		 */
		inteiro.add(idade); //AUTOBOXING
		
//		Agora veja como o Java faz este código funcionar:
//		TODO ESSE PROCESSO É FEITO AUTOMATICAMENTE PELO JAVA.
		/**
		 * Primeiro instancia um objeto do tipo Integer que é um Wrapper
		 * e atribui ao objeto do tipo Integer o tipo primitivo.
		 */
//		Integer primitivo = idade; 					//Este comando não deveria funcionar, acontece um AUTOBOXING
		Integer primitivo = Integer.valueOf(idade);//O que acontece por debaixo dos panos
		/**
		 * E o substitui o valor anterior da variável que era um primitivo
		 * por uma referência a um objeto do tipo Integer.
		 */
		idade = primitivo;
		/**
		 * E o código continua igual:
		 */
		inteiro.add(idade);
		System.out.println(inteiro.get(0));
		
		//Métodos da classe Integer
		int numero = inteiro.get(0).intValue(); //UNBOXING
		System.out.println("Agora voltou a ser apenas um primitivo em uma variável. " + numero);
		 
		Integer iParseado1 = Integer.valueOf("42"); //parseando e devolvendo referencia
		int iParseado2 = Integer.parseInt("44");  //parseando e devolvendo primitivo

		System.out.println(iParseado1); //42
		System.out.println(iParseado2); //44
		
		//CONSTANTES DA CLASSE INTEGER
		System.out.println(Integer.MAX_VALUE); // 2^31 - 1
		System.out.println(Integer.MIN_VALUE); //-2^31

		System.out.println(Integer.SIZE); // 32 bits
		System.out.println(Integer.BYTES); //4 Bytes
	}
}


