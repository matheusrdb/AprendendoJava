public class FluxoUnchecked {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        } catch(ArithmeticException | NullPointerException | NegativeArraySizeException | MinhaExcecaoUnchecked ex) {
            String msg = ex.getMessage();
            //Throwable msgs = ex.getCause();
            System.out.println(msg);
            //System.out.println(msgs);
            //Nao precisa sysout pois já tem print
            ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);

            /*UNCHECKED EXCEPTION*/
            throw new MinhaExcecaoUnchecked("Essa exceção fui eu que fiz!");

            //Conta c = null;
            //c.deposita();
            //int a = 3;
            //a = a / 0;
        }
        System.out.println("Fim do metodo2");
    }
}