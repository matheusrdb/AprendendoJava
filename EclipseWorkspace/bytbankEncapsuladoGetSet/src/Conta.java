public class Conta {
    private double saldo;
    private int numero;
    private int agencia;
    private Cliente titular = new Cliente();
    private static int total;
    
    /*public Conta(int agencia, int numero) {
    	if(agencia <= 0 || numero <= 0) {
    		return;
    	}		
    }*/
    public Conta() {
    	total++;
    	System.out.println("Nova conta criada, dados do titular abaixo: ");
    	System.out.println("Total de contas criadas até o momento: " + Conta.total);
    }

    //Setters
    public void deposita(double valor)  {
        this.saldo += valor;
    }

    public void saca(double valor)   {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            //return true;
        }
        //return false;
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
    public static int getTotal() {
    	return total;
    }

}
