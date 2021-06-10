package br.com.aprendendo.javaio;

import java.io.Serializable;

public class Cliente implements Serializable {
	
	//Boa prática, poois indica a versão de uma classe
	private static final long serialVersionUID = 1L;
	
	private String nome;
    private String cpf;
    private String profissao;
    //private String dataNascimento;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getProfissao() {
        return profissao;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

}
