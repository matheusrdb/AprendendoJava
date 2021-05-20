public class Cliente implements Autenticavel {

    private AutenticadorAuxiliar autenticador;

    public Cliente()    {
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

}
