package br.com.javautil.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.javautil.modules.Conta;
import br.com.javautil.modules.ContaCorrente;
import br.com.javautil.modules.ContaPoupanca;

public class LambdasComparandoIntegers {

        public static void main(String[] args) {

                Conta cc1 = new ContaCorrente(22, 33);
                cc1.deposita(333.0);

                Conta cc2 = new ContaPoupanca(22, 44);
                cc2.deposita(444.0);

                Conta cc3 = new ContaCorrente(22, 11);
                cc3.deposita(111.0);

                Conta cc4 = new ContaPoupanca(22, 22);
                cc4.deposita(222.0);

                List<Conta> lista = new ArrayList<>();
                lista.add(cc1);
                lista.add(cc2);
                lista.add(cc3);
                lista.add(cc4);
                
                
                //Ordenando Listas
                System.out.println("Contas sem ordenação\n");
                for (Conta conta : lista) {
					System.out.println(conta);
				}
                System.out.println("\nAgora com as contas ordenadas de acordo com o número\n");
               
                //LAMBDA -> INTERFACE COMPARATOR
                lista.sort((conta1, conta2) -> Integer.compare(conta1.getNumero(), conta2.getNumero()));
                
                Collections.rotate(lista, 4);
                
                //LAMBDA -> INTERFACE CONSUMER -> MÉTODO accept();
                lista.forEach((Conta conta) -> System.out.println(conta));
				}
        }
