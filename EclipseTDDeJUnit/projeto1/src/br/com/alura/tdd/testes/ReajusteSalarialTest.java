package br.com.alura.tdd.testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.service.ReajusteSalarial;

class ReajusteSalarialTest {

	private ReajusteSalarial reajuste;
	private Funcionario funcionario;
	
	@BeforeEach
	public void start() {
		this.reajuste = new ReajusteSalarial();
		this.funcionario = new Funcionario("Matheus", LocalDate.now(), new BigDecimal("1000"));
	}
	
	@Test
	void reajusteDeveriaSerDeTresPorCentoDoSalarioQuandoDesempenhoForADESEJAR() {
		reajuste.reajustaSalario(funcionario, Desempenho.A_DESEJAR);
		assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
	}
	
	@Test
	void reajusteDeveriaSerDeQuinzePorCentoDoSalarioQuandoDesempenhoForBom() {
		reajuste.reajustaSalario(funcionario, Desempenho.BOM);
		assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
	}
	
	@Test
	void reajusteDeveriaSerDeVinteECincoPorCentoDoSalarioQuandoDesempenhoForOTIMO() {
		reajuste.reajustaSalario(funcionario, Desempenho.OTIMO);
		assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
	}

}
