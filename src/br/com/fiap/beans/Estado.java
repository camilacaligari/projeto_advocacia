package br.com.fiap.beans;

public class Estado {
	private short codigo;
	private String nome;
	private char sigla;
	
	public Estado() { }
	
	public Estado(short codigo, String nome, char sigla) {
		super();
		setCodigo(codigo);
		setNome(nome);
		setSigla(sigla);
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
	public char getSigla() {
		return sigla;
	}
	public void setSigla(char sigla) {
		this.sigla = sigla;
	}
}
