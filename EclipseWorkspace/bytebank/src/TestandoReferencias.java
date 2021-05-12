
public class TestandoReferencias {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println("Saldo Disponível:" + primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println("Saldo Disponível:" + primeiraConta.saldo);
		Conta segundaConta = primeiraConta;
		segundaConta.saldo = 50;
		
		System.out.println("O saldo da primeira conta é:" + primeiraConta.saldo);
		System.out.println("O saldo da segunda conta é:" + segundaConta.saldo);
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);

	}

}
