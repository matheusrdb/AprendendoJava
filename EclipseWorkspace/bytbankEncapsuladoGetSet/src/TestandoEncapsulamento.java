public class TestandoEncapsulamento {
    public static void main(String[] args) {
        
        Conta conta = new Conta();
        conta.setTitular("Matheus Rubens");
        
        System.out.println("Titular:" + conta.getTitular().getNome());
        System.out.println();
        
        conta.getTitular().setCpf("444.444.444-78");
        
        System.out.println("CPF:" + conta.getTitular().getCpf());
        System.out.println();
        
        conta.getTitular().setCep("07142-222");
        
        System.out.println("Cep:" + conta.getTitular().getCep());
        System.out.println();
        
        conta.setAgencia(179);
        
        System.out.println("Agência:" + conta.getAgencia());
        System.out.println();
        
        conta.setNumero(9893859-6);
        
        System.out.println("Número da conta:" + conta.getNumero());
        System.out.println();
        
        conta.deposita(500);
        
        System.out.println("Saldo disponível:" + conta.getSaldo());
        System.out.println();

    }
}
