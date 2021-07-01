package br.com.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<Empresa>();
	
	static {
		
		Empresa empresa = new Empresa("Alura");
		Empresa empresa2 = new Empresa("Caelum");
		Empresa empresa3 = new Empresa("São Judas");
		Empresa empresa4 = new Empresa("São Mateus");
		
		Banco banco = new Banco();
		banco.adiciona(empresa, empresa2, empresa3, empresa4);
	}
	
	public void adiciona(Empresa... empresa) {
		Collections.addAll(Banco.lista, empresa);
	}
	
	public List<Empresa> getEmpresas() {
		return Banco.lista;
	}
}
