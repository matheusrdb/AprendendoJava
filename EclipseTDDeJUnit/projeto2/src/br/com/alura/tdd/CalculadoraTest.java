package br.com.alura.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
	
	@Test
	public void somaDeNumerosPositivos() {
		Calculadora c = new Calculadora();
		int soma = c.somar(3, 7);
		
		Assertions.assertEquals(10, soma);
	}
}
