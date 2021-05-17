public class TestandoEncapsulamento {
    public static void main(String[] args) {
        
        Conta conta = new Conta();
        
        conta.setTitular("Matheus Rubens");
        
        System.out.println("Titular:" + conta.getTitular().getNome());
        System.out.println();
        
        conta.getTitular().setCpf("444444444-44");
        
        System.out.println("CPF:" + conta.getTitular().getCpf());
        System.out.println();
        
        conta.getTitular().setCep(714222);
        
        System.out.println("Cep:" + conta.getTitular().getCep());
        System.out.println();
        
        conta.setAgencia(179);
        
        System.out.println("Agência:" + conta.getAgencia());
        System.out.println();
        
        conta.setNumero(9893859-6);
        
        System.out.println("Número da conta:" + conta.getNumero());
        System.out.println();
        
        //Testando métodos da classe conta
        conta.deposita(500);
        
        System.out.println("Saldo disponível:" + conta.getSaldo());
        System.out.println();
        
        int valorSaque = 200;
        conta.saca(valorSaque);
        System.out.println("Saque no valor de R$" + valorSaque + " realizado!");
        
        System.out.println("Saldo disponível:" + conta.getSaldo());
        System.out.println();
        
        Conta pedro = new Conta();
        pedro.setTitular("Pedro");
        
        int valorTransf = 200;
        conta.transfere(valorTransf, pedro);
        System.out.println("Transferência no valor de " + "R$"+ valorTransf + " realizado!");
        
        System.out.println("Saldo disponível para " + pedro.getTitular().getNome() + ": R$" + pedro.getSaldo());
        System.out.println("Saldo disponível para " + conta.getTitular().getNome() + ": R$" + conta.getSaldo());
        System.out.println();
        
        System.out.println("Total de contas:" + Conta.getTotal());

    }
}
