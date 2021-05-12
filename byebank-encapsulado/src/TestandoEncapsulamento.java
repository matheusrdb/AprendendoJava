public class TestandoEncapsulamento {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Conta conta = new Conta();

        cliente.setCep("07142-222");
        cliente.setCpf("222.222.222-22");

        System.out.println(cliente.getCep());

        conta.setTitular("matheus");
        System.out.println(conta.getTitular().getNome());
        conta.getTitular().setCpf("444.444.444-78");

        System.out.println(conta.getTitular().getCpf());
    }
}
