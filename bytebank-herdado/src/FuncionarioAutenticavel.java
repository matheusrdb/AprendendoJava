public abstract class FuncionarioAutenticavel extends Funcionario {

    protected int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getSenha() {
        return this.senha;
    }

    public boolean autentica(int senha) {
        return this.senha == senha;
    }
}
