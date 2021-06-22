package br.com.alura;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Data {
	
	public static void main(String[] args) {
		
		LocalDate hoje = LocalDate.now();
//		System.out.println(hoje);
		
		LocalDate diaAno = LocalDate.of(2099, Month.JANUARY, 25);
		System.out.println(diaAno.format(DateTimeFormatter.ofPattern("dd/MM/uuuu")));
		
		LocalDate aniversario = LocalDate.of(2021, Month.OCTOBER, 04);
//		System.out.println(aniversario);
		
		Period periodo = Period.between(hoje, aniversario);
//		System.out.println(periodo);
		
		LocalDate proximoAniversario = aniversario.plusYears(1);
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/uu");
		DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/uu kk:mm");
		
//		String proximoAniversarioFormatado = proximoAniversario.format(formatador);
		
		System.out.println(proximoAniversario.format(formatador));
		
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora.format(formatadorComHoras));
	}
}
