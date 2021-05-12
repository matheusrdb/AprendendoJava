public class TesteConta {
    public static void main(String[] Args)  {
        //Criando conta e definindo atributos
        Conta contaMatheus = new Conta();
        contaMatheus.titular = "Matheus";
        contaMatheus.saldo = 100;

        //Criando outra conta para Testes
        Conta contaTeste = new Conta();
        contaTeste.titular = "Teste";
        contaTeste.saldo = 1000;

        //Verificando atributos da conta Matheus
        System.out.println("Nome do titular:" + contaMatheus.titular);
        System.out.println("Saldo disponível:" + contaMatheus.saldo);

        System.out.println("-------------------------");

        //Verificando atributos da conta Teste
        System.out.println("Nome do titular:" + contaTeste.titular);
        System.out.println("Saldo disponível:" + contaTeste.saldo);

        //Depositando na conta do Matheus
        contaMatheus.deposita(100);
        //Verificando atributos
        System.out.println("-------------------------");
        System.out.println("Nome do titular:" + contaMatheus.titular);
        System.out.println("Saldo disponível:" + contaMatheus.saldo);

        //Sacando da conta do Matheus
        if(contaMatheus.saca(200))  {
            System.out.println("Saque concluído!");
        } else  {
            System.out.println("Saldo indisponível!");
        }
        System.out.println("Saldo disponível:" + contaMatheus.saldo);

        //Transferindo da conta Teste para conta Matheus

        if(contaTeste.transfere(500, contaMatheus)) {
            System.out.println("Transferência concluída!");
        } else {
            System.out.println("Saldo indisponível!");
        }
        System.out.println("Saldo disponível:" + contaTeste.saldo);
        System.out.println("Saldo disponível:" + contaMatheus.saldo);

    }
}
