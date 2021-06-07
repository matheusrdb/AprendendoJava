package br.com.javautil.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.javautil.modules.Cliente;
import br.com.javautil.modules.Conta;
import br.com.javautil.modules.ContaCorrente;
import br.com.javautil.modules.ContaPoupanca;

public class LambdasComparandoStrings {
	public static void main(String[] args) {

		Conta cc1 = new ContaCorrente(22, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Nico");
        cc1.setTitular(clienteCC1);
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(22, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Guilherme");
        cc2.setTitular(clienteCC2);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Paulo");
        cc3.setTitular(clienteCC3);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNome("Ana");
        cc4.setTitular(clienteCC4);
        cc4.deposita(222.0);

        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);
        
        //LAMBDA -> INTERFACE COMPARATOR
        
        Comparator<Conta> compAlpha = (conta1, conta2) -> {

        		String nomeC1 = conta1.getTitular().getNome();
        		String nomeC2 = conta2.getTitular().getNome();
        		return nomeC1.compareTo(nomeC2);
        	};
        
        //Ordenando Listas
        System.out.println("Contas sem ordenação\n");
        for (Conta conta : lista) {
			System.out.println(conta.getTitular().getNome());
		}
        System.out.println("\nAgora com as contas ordenadas de acordo com o número\n");
        lista.sort(compAlpha);
        Collections.rotate(lista, 3);
        
        //LAMBDA -> INTERFACE CONSUMER -> MÉTODO accept();
        lista.forEach((Conta conta) -> System.out.println(conta.getTitular().getNome()));
		}
	}