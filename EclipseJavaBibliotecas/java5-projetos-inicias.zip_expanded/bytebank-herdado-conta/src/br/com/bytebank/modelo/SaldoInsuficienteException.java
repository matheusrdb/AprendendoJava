package br.com.bytebank.modelo;

import java.io.Serializable;

public class SaldoInsuficienteException extends Exception implements Serializable {
	
	private static final long serialVersionUID = 1L;

	public SaldoInsuficienteException(String msg) {
		super(msg);
	}

}
