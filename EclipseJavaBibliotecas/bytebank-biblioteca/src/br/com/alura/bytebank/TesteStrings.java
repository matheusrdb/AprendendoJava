package br.com.alura.bytebank;

public class TesteStrings {

	public static void main(String[] args) {
		
		String nome = "Matheus"; 				//Boa prática
		String nome2 = new String("Matheus");	 //Má prática
		//Testando dicionário ele realmente funciona ?   
		//System.out.println(nome.charAt(0));
		
		for (int i = 0; i < nome.length(); i++)	{
		System.out.println(nome.charAt(i));
	
		}
		System.out.println(nome.contains("z"));
		
		String nomeNovo = nome.replace("M", "m");
		System.out.println(nomeNovo);
		System.out.println(nome);
	}

}
