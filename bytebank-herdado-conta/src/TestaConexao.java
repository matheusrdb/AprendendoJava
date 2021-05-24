public class TestaConexao {
    public static void main(String[] args) {
        try(Conexao conexao = new Conexao()) {
            conexao.leDados();
        }
    }



}
