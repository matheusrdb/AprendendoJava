package br.com.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Banco {

	private static List<Empresa> lista = new ArrayList<Empresa>();

	static {

		Empresa empresa = new Empresa("Alura", "123");
		Empresa empresa2 = new Empresa("Caelum", "123");
		Empresa empresa3 = new Empresa("São Judas", "123");
		Empresa empresa4 = new Empresa("São Mateus", "123");

		Banco banco = new Banco();
		banco.adiciona(empresa, empresa2, empresa3, empresa4);
	}

	public void adiciona(Empresa... empresa) {
		Collections.addAll(Banco.lista, empresa);
		Banco.lista.sort((e1, e2) -> e1.getId().compareTo(e2.getId()));
	}

	public List<Empresa> getEmpresas() {
		return Banco.lista;
	}

	public void deleteEmpresa(int empresaId) {
		Banco.lista.remove(empresaId);
		Banco.lista.sort((e1, e2) -> e1.getId().compareTo(e2.getId()));
	}

	public void deleteEmpresa(Object empresa) {
		Banco.lista.remove(empresa);
		Banco.lista.sort((e1, e2) -> e1.getId().compareTo(e2.getId()));
	}
}
