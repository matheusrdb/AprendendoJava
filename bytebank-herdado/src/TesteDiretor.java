public class TesteDiretor {

    public static void main(String[] args) {
       // Funcionario f = new Funcionario();
       // f.setSalario(2000); //200
        Funcionario g = new Gerente();
        g.setSalario(5000); //5000
       // Funcionario d = new Diretor();
      //  d.setSalario(10000); //10000 + 50%

        ControleBonificacao controlador = new ControleBonificacao();
        //controlador.registra(f);
        controlador.registra(g);
       // controlador.registra(d);

        System.out.print("Gasto total com bonificações:R$" + controlador.getTotal());


    }

}
