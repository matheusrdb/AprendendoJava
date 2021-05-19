public class SistemaInterno {

    private int senha = 2222;

    public void autentica(FuncionarioAutenticavel g) {
        if(g.autentica(this.senha)) {
            System.out.println("Pode entrar no sistema!");
        } else {
            System.out.println("Não pode entrar no sistema!");
        }
    }
}
