public class TestaSaca {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(123, 321);
        cc.deposita(200);
        try {
            cc.saca(211);
        } catch (SaldoInsuficienteException ex) {
            System.out.println("SALDO INSUFICIENTE\nEx: " + ex.getMessage());
        }
        System.out.println(cc.getSaldo());
    }
}
