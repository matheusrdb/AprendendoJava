public class Conexao implements AutoCloseable{
    public Conexao()    {
        System.out.println("Iniciando Conexão...");
    }
    public void leDados()    {
        System.out.println("Lendo dados...");
        //throw new IllegalStateException();
    }
    //Método implementado pela interface AutoCloseable, automaticamente fecha conexões
    @Override
    public void close() {
        System.out.println("Fechando Conexão...");
    }
}
