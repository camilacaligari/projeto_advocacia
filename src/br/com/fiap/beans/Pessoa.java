package br.com.fiap.beans;

public class Pessoa {
	private short codigo;
	private String nome;
	
	public Pessoa() { }
	
	public Pessoa(short codigo, String nome) {
		super();
		setCodigo(codigo);
		setNome(nome);
	}

	public short getCodigo() {
		return codigo;
	}
	public void setCodigo(short codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
