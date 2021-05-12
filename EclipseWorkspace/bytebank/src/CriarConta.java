public class CriarConta {
	
	public static void main(String[] Args) {
		//Criando conta de Matheus e definindo atributos.
		Conta contaDoMatheus = new Conta();
		contaDoMatheus.saldo = 0;
		
		contaDoMatheus.titular = "Matheus";
		System.out.println("Conta de " + contaDoMatheus.titular);
		System.out.println("Saldo Disponível:" + contaDoMatheus.saldo);
		
		System.out.println("------------------------");
		
		//Criando conta de fulano e definindo atributos.
		Conta contaDoFulano = new Conta();
		contaDoFulano.saldo = 1000;
		
		contaDoFulano.titular = "Fulano";
		System.out.println("Conta de " + contaDoFulano.titular);
		System.out.println("Saldo Disponível:" + contaDoFulano.saldo);
		System.out.println();
		
		//Utilizando método de transferência para transferir o valor de uma conta para outra.
		System.out.println("Transferência no valor de R$300 de " + contaDoFulano.titular + " para " + contaDoMatheus.titular + ".");
		System.out.println("------------------------");
		contaDoFulano.transfere(300, contaDoMatheus);
		
		System.out.println("Conta de " + contaDoFulano.titular);
		System.out.println("Saldo Disponível:" + contaDoFulano.saldo);
		System.out.println();
		
		//Verificando saldo
		System.out.println("Conta de " + contaDoMatheus.titular);
		System.out.println("Saldo Disponível:" + contaDoMatheus.saldo);
		
		//Sacando valor da conta
		
		if(contaDoMatheus.saca(300)) {
			System.out.println("Sacando o valor de R$300...");
		} else
			System.out.println("Saldo indisponível");
		
		//Verificando saldo
		System.out.println("Conta de " + contaDoMatheus.titular);
		System.out.println("Saldo Disponível:" + contaDoMatheus.saldo);
	}
}