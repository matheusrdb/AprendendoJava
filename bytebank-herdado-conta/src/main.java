public class main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(111, 111);
        cc.deposita(100);

        ContaPoupanca cp = new ContaPoupanca(222, 222);
        cp.deposita(200);

        //cp.transfere(50, cc);

        System.out.println("CC:R$" + cc.getSaldo());
        System.out.println("CP:R$" + cp.getSaldo());

        //Testando Interface Tributavel e semelhantes, e também classe CaculadorDeImposto
        SeguroDeVida sv = new SeguroDeVida();

        CalculadorDeImposto calc = new CalculadorDeImposto();

        calc.calculaImposto(cc);
        calc.calculaImposto(sv);

        System.out.println(calc.getTotalImposto());


    }
}
