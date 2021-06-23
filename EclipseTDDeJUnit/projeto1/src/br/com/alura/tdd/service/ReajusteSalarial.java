package br.com.alura.tdd.service;

import java.math.BigDecimal;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteSalarial {

	public void reajustaSalario(Funcionario funcionario, Desempenho desempenho) {
		BigDecimal reajuste = funcionario.getSalario().multiply(desempenho.reajustePercentual());
		funcionario.reajusteSalarial(reajuste);
	
	}
}
