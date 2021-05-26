package br.com.bytebank.especial;

import br.com.bytebank.modelo.Conta;

public class ContaEspecial extends Conta {

	ContaEspecial(int agencia, int numero) {
		super(agencia, numero);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}

}
