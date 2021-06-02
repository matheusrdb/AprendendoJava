package br.com.javautil.testes;

import br.com.javautil.modules.BinRef;
import br.com.javautil.modules.Conta;
import br.com.javautil.modules.ContaCorrente;
import br.com.javautil.modules.ContaPoupanca;

public class TesteKeepRef {

	public static void main(String[] args) {

//		Conta[] contas = {new ContaCorrente(123, 321), new ContaPoupanca(321, 123)}; //Código com leitura ruim, sem keepRef

//		Código de fácil compreensão com keepRef:

//		Contas Correntes
		Conta cc1 = new ContaCorrente(123, 321);
		Conta cc2 = new ContaCorrente(123, 322);
		Conta cc3 = new ContaCorrente(123, 323);
//		Contas Poupança
		Conta cp1 = new ContaPoupanca(123, 321);
		Conta cp2 = new ContaPoupanca(123, 321);
		Conta cp3 = new ContaPoupanca(123, 321);
//		Guardando referências
		BinRef bin = new BinRef();
		bin.keepGenericRef(cp1);
		bin.keepGenericRef(cp2);
		bin.keepGenericRef(cp3);
		bin.keepGenericRef(cc1);
		bin.keepGenericRef(cc2);
		bin.keepGenericRef(cc3);
//		Manipulando Referências
		ContaPoupanca refParaCp1 = (ContaPoupanca) bin.getObject(0);
		System.out.println(refParaCp1.getAgencia());
//		Removendo uma Referência do Bin
		bin.removeRef(0);
//		Requisitando quantidade de referências armazenadas.
		bin.getAmount();
//		Exception que prova que a referência foi apagada substituida por null.		
		try {
		refParaCp1 = (ContaPoupanca) bin.getObject(0);
		System.out.println(refParaCp1.getAgencia());
		} catch(NullPointerException exception) {
			System.out.println(exception.getMessage() + ":" + " Referência deletada.");
		}
	}
}
