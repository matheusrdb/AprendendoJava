
public class Gerente extends Funcionario {
	
	private int senha;
	
	
	 public void setSenha(int senha) {
		this.senha = senha;
	}
	 
	 public double getBonificação()	{
			return super.salario * 0.1; //Este atributo é da classe mãe/pai, e por isso para deixar o código mais expressivo 
	}									//é recomendado colocar super.salario pois indica que o atributo vem da Super Class, 
	 									//Classe mãe/pai ou também pode chamar de base class
	 
	public boolean autentica(int senha) {
		if(this.senha == senha) {	
			return true;
		} else {
			return false;
		}
	}
}
