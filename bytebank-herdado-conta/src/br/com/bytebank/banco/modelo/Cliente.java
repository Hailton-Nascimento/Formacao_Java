package br.com.bytebank.banco.modelo;

import java.io.Serializable;

/**
 * Classe que representa um cliente no Bytebank.
 *
 * @author Nico Steppat
 * @version 0.1
 */
public class Cliente implements Serializable {

	private String nome;
	private String cpf;
	private String profissao;
	
	
	public Cliente() {

	}

	public Cliente(String nome, String cpf, String profissao) {
		this.nome = nome;
		this.cpf = cpf;
		this.profissao = profissao;
	}

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
	@Override
		public String toString() {
		
			return "\nDADOS CLIENTE"+"\nNOME: "+this.nome+"\nCPF: "+this.cpf+"\nPROFISSAO: "+this.profissao;
		}

}
