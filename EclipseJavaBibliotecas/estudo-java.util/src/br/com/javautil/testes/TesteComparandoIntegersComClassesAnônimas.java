package br.com.javautil.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.javautil.modules.Conta;
import br.com.javautil.modules.ContaCorrente;
import br.com.javautil.modules.ContaPoupanca;

public class TesteComparandoIntegersComClassesAnônimas {

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
                
                //CLASSE ANÔNIMA -> INTERFACE COMPARATOR
                Comparator<Conta> compInteger = new Comparator<Conta>()	{

                	@Override
                	public int compare(Conta conta1, Conta conta2) {		
                		
                		//USANDO MÉTODO DA CLASSE INTEGER
                		return Integer.compare(conta1.getNumero(), conta2.getNumero());
                		
                		//MODO SIMPLIFICADO

//                		return conta1.getNumero() - conta2.getNumero();
                		
                		//MODO COMPLEXO

//                		if(conta1.getNumero() > conta2.getNumero()) {
//                			return 1;
//                		}
//                		if(conta1.getNumero() < conta2.getNumero()) {
//                			return -1;
//                		}
//                		
//                		return 0;
                	}

                };
                
                //Ordenando Listas
                System.out.println("Contas sem ordenação\n");
                for (Conta conta : lista) {
					System.out.println(conta);
				}
                System.out.println("\nAgora com as contas ordenadas de acordo com o número\n");
                
                //Você pode fazer isso:
//              NumeroDaConta comparaNumero = new NumeroDaConta();
//              lista.sort(comparaNumero);
                
                //Ou isso:
                lista.sort(compInteger);
                
                //Jeito antigo de ser feito:
//              Collections.sort(lista); //Necessário que a classe super(Conta) implemente a interface Comparable e sobrescreva o método CompareTo
                Collections.rotate(lista, 4);
                for (Conta conta : lista) {
					System.out.println(conta);
				}
        }
}
