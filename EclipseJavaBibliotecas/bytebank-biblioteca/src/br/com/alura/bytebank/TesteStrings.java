package br.com.alura.bytebank;

public class TesteStrings {

	public static void main(String[] args) {
		
		String nome = "   Matheus"; ///object literal			//Boa prática
		System.out.println(nome);
		String nomeSemEspaço = nome.strip();
		System.out.println(nomeSemEspaço + " nome sem espaço");
		
		String nome2 = new String("Matheus");	 //Má prática, sempre prefere sintaxe literal
		System.out.println(nome2);
		//Testando dicionário ele realmente funciona ?   
		//System.out.println(nome.charAt(0));
		
		for (int i = 0; i < nome.length(); i++)	{
		System.out.println(nome.charAt(i));
	
		}
		System.out.println(nome.contains("z"));
		
		
		String nomeNovo = nome.replace("M", "m");
		char[] nomeNovo2 = nome.toCharArray();
		System.out.println(nomeNovo);
		System.out.println(nomeNovo2);
		System.out.println(nome.isEmpty());
		
		char c = nome.charAt(3); //char i
		System.out.println(c); //h

		int pos = nome.indexOf("us");
		System.out.println(pos); //5

		String sub = nome.substring(3);
		System.out.println(sub);
		
		/**
		 * Usando método split(), que serve para separar a string em pedaços a partir de uma referência	
		 */
		String nomeSplit = "Matheus.Rubens.Delmaschio.Borges";
		String[] nomeSplitado = nomeSplit.split("u");
		System.out.println(nomeSplitado[1]);
	}

}
