package br.com.alura.tdd.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.alura.tdd.modelo.Funcionario;

public class BonusService {

	public BigDecimal calcularBonus(Funcionario funcionario) {
		//Regra de negócio, o bônus do funcionário é igual a 10% do seu salário não podendo passar de 1000.
		BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));
		
		if (valor.compareTo(new BigDecimal("1000")) > 0) {
			throw new IllegalArgumentException("Funcionário com salário de R$10.000 não pode receber bônus!");
		}
		
		return valor.setScale(2, RoundingMode.HALF_UP);
	}

}
