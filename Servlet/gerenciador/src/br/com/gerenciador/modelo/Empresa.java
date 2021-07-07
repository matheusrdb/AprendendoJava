package br.com.gerenciador.modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

import javax.servlet.ServletException;

public class Empresa {

	private int id = 0;
	private static int countId = 0;
	private String name;
	private String cnpj;
	private Date dataAbertura = new Date();

	public Empresa(String name, String cnpj, String dataAbertura) throws ServletException {
		this.name = name;
		this.cnpj = cnpj;
		this.setDataAbertura(dataAbertura);
		this.id += Empresa.countId;
		countId++;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return this.cnpj;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @param dataString Parâmetro que é recebido do client
	 * @throws ServletException Caso a data seja digitada em formato diferente de
	 *                          xx/xx/xxxx
	 */
	public void setDataAbertura(String dataString) throws ServletException {
		/**
		 * O método faz parse com try-catch e define o @field dataAbertura
		 * 
		 * @dataString Recebe uma string do @param date do formNovaEmpresa.jsp
		 */
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			this.dataAbertura = sdf.parse(dataString);
		} catch (ParseException ex) {
			throw new ServletException(ex);
		}
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
		return id == other.id;
	}

}
