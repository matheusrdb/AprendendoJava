
public class Diretor extends FuncionarioAutenticavel {

    /*public Diretor() {
        System.out.println("Classe diretor instanciada...");
    }*/

    public void setSenha(int senha) {
        super.senha = senha;
    }

    public double getBonificacao() {
        return super.getSalario() + super.getSalario() * 0.50;
    }
}
