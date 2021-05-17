
public class TesteGerente {
	public static void main(String[] args) {
		
		Gerente matheus = new Gerente();
		
		matheus.setCpf("444.444.444-88");
		matheus.setNome("Matheus Rubens");
		matheus.setSalario(6500);
		
		System.out.println("Nome:" + matheus.getNome());
		System.out.println("CPF:" + matheus.getCpf());
		System.out.println("Salário:" + matheus.getSalario());
		
		matheus.setSenha(2222);
		boolean autenticou = matheus.autentica(2222);
		
		System.out.println(autenticou);
	}
}
