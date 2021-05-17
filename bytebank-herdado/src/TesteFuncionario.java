
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario matheus = new Funcionario();
		
		matheus.setNome("Matheus Rubens");
		matheus.setCpf("444.444.444-88");
		matheus.setSalario(2500.0);
		
		System.out.println("Nome:" + matheus.getNome());
		System.out.println("CPF:" + matheus.getCpf());
		System.out.println("Salário:R$" + matheus.getSalario());
		
		System.out.println("Bonficação:R$" + matheus.getBonificação());
	}

}
