public class Conta {
    private double saldo;
    private int numero;
    private int agencia;
    private Cliente titular = new Cliente();

    //Setters
    public void deposita(double valor)  {
        this.saldo += valor;
    }

    public boolean saca(double valor)   {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transfere(double valor, Conta destino)   {
        if(this.saldo >= valor) {
            this.saca(valor);
            destino.deposita(valor);
            return true;
        }
        return false;
    }


    public void setTitular(String nome)    {
        this.titular.setNome(nome);
    }

    /* public void setSaldo(double saldo)   {
        this.saldo = saldo;
    } */ //Este código é necessário nessa situação, afinal temos os métodos deposita(), saca() e transfere().

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    //Getters
    public Cliente getTitular() {
        return this.titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

}
