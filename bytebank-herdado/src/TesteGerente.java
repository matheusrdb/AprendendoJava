
public class TesteGerente {
	public static void main(String[] args) {
		
		FuncionarioAutenticavel matheus = new Gerente();
		
		matheus.setCpf("444.444.444-88");
		matheus.setNome("Matheus Rubens");
		matheus.setSalario(6500);
		
		System.out.println("Nome:" + matheus.getNome());
		System.out.println("CPF:" + matheus.getCpf());
		System.out.println("Salário:R$:" + matheus.getSalario());
		double bonificacao = matheus.getBonificacao();
		System.out.println("Bonificação de:R$" + bonificacao);


		matheus.setSenha(3333);

		SistemaInterno si = new SistemaInterno();
		si.autentica(matheus);
	}
}
