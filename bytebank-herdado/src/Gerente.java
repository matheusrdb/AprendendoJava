
public class Gerente extends Funcionario implements Autenticavel {

    private AutenticadorAuxiliar autenticador;

    public Gerente()    {
        autenticador = new AutenticadorAuxiliar();
    }

    @Override
    public boolean autentica(int senha) {
       return autenticador.autentica(senha);
    }

    @Override
    public void setSenha(int senha) {
        autenticador.setSenha(senha);
    }

    public double getBonificacao() {
        return super.getSalario();
    }




}
