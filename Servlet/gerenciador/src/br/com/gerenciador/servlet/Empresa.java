package br.com.gerenciador.servlet;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Empresa {

	private Integer id = 0;
	private static Integer countId = 0;
	private String name;
	private String cnpj;
	private Date dataAbertura = new Date();

	public Empresa(String name, String cnpj) {
		this.name = name;
		this.cnpj = cnpj;
		this.id += Empresa.countId;
		countId++;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getCnpj() {
		return this.cnpj;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	
	public Date getDataAbertura() {
		return dataAbertura;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empresa other = (Empresa) obj;
		return Objects.equals(id, other.id);
	}
		
}
