package br.com.alura.tdd.testes;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.service.BonusService;

class BonusServiceTest {
	
	private BonusService service;
	private BigDecimal bonus;
	
	@BeforeEach
	public void start() {
		this.service = new BonusService();
		this.bonus = service.calcularBonus(new Funcionario("Matheus", LocalDate.now(), new BigDecimal("1000")));
	}
	
	@Test
	void bonusDeveriaSerDeDezPorCentoExatamente1000DeAcordoComARegraDeNegocio()	{
		assertEquals(new BigDecimal("100.00"), bonus);
	}
	
	@Test
	void deveriaJogarUmaExceptionQuandoSalarioForMaiorDe10000() {
		//EXEMPLO DE TESTE DE EXCEPTION 1
		assertThrows(IllegalArgumentException.class , () -> service.calcularBonus(new Funcionario("Matheus", LocalDate.now(), new BigDecimal("10001"))));
		//EXEMPLO DE TESTE DE EXCEPTION 2	
		try {
			service.calcularBonus(new Funcionario("Matheus", LocalDate.now(), new BigDecimal("10001")));
			fail("NO EXCEPTION!");
		} catch (IllegalArgumentException e) {
			assertEquals("Funcionário com salário de R$10.000 não pode receber bônus!", e.getMessage());
		}
	}

}
