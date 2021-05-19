public class ControleBonificacao {
    private double total;

    public void registra(Funcionario funcionario) {
        this.total += funcionario.getBonificacao();
    }

    public double getTotal()    {
        return total;
    }
}
