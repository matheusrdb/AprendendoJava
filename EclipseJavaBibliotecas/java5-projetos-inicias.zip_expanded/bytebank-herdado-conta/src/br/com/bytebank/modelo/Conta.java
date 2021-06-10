package br.com.bytebank.modelo;

import java.io.Serializable;

/**
 * Super Classe que representa a moldura de uma conta bancária.
 * 
 * @author mrrobot
 *
 */
public abstract class Conta implements Serializable {

	private static final long serialVersionUID = 1L;
	
	protected double saldo;
    private int agencia;
    private int numero;
    //transient = significa que a classe não será armazenada no objeto na serialização
//    private transient Cliente titular;
    private Cliente titular;
    private static int total = 0;
   /**
    * Construtor para instanciar o objeto conta a partir da agência e número.
    *  
    * @param numAgencia
    * @param numeroConta
    */
    protected Conta(int numAgencia, int numeroConta){
        Conta.total++;
        //System.out.println("O total de contas é " + Conta.total);
        this.agencia = numAgencia;
        this.numero = numeroConta;
        //this.saldo = 100;
        //System.out.println("Estou criando uma conta " + this.numero);
    }

    public abstract void deposita(double valor);
    	
    /**
     * VERIFICAÇÃO DE VALOR, saldo não pode ser menor que o valor a ser sacado.
     * 
     * @param valor
     * @throws SaldoInsuficienteException
     */
    
    public void saca(double valor) throws SaldoInsuficienteException{
    	
        if(this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
        } 
        
        this.saldo -= valor;       
    }

    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
        this.saca(valor);
        destino.deposita(valor);
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        if(numero <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia){
       if(agencia <= 0) {
           System.out.println("Nao pode valor menor igual a 0");
           return;
       }
       this.agencia = agencia;
    }

    public void setTitular(Cliente cliente){
    	this.titular = cliente;
    }

    public Cliente getTitular(){
        return this.titular;
    }

    public static int getTotal(){
        return Conta.total;
    }
    @Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Número: " + this.numero;
	}

}