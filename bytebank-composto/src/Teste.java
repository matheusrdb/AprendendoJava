public class Teste {
    public static void main(String[] Args)  {
        Cliente matheus = new Cliente();
        Conta contaMatheus = new Conta();

        matheus.cep = "07142-270";
        matheus.nome = "Matheus Rubens";
        matheus.cpf = "222.222.222-22";

        //contaMatheus.titular = matheus;

        //ENTENDA!Se você especificar que | conta.Matheus.titular.nome = Matheus / ID:Cliente@1b6d3586
        //ENTENDA!Se você especificar que | matheus.nome = Matheus               / ID:Cliente@4554617c
        //São OBJETOS distintos!
        // Cliente matheus =/= Conta contaMatheus //

        //Vai resultar em null
        System.out.println(contaMatheus.titular.nome);
        //Porém se definir que:
        contaMatheus.titular.nome = "Matheus";
        //Então você irá imprimir Matheus corretamente
        System.out.println(contaMatheus.titular.nome);


        System.out.println("Diferença entre // matheus.nome E contaMatheus.titular.nome //");
        System.out.println("Isso é uma variável do tipo CONTA: " + contaMatheus);
        System.out.println("Isso é uma variável do tipo CLIENTE: " + matheus);
        System.out.println("Portanto são REFERÊNCIAS DIFERENTES para OBJETOS DIFERENTES.");
    }
}
