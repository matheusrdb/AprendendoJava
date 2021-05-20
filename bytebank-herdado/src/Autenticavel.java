//Deve implementar:
/*
Atributos:
private int senha;

Métodos:
setSenha
getSenha
autentica(int senha)
*/

public interface Autenticavel {

    void setSenha(int senha);

    //este método autentica a senha
    public abstract boolean autentica(int senha); // public abstract // --> é desnecessário porém o código ainda compila,
}
