package br.com.fiap.beans;

public class Estado {
	private short codigo;
	private String nome;
	private String sigla;
	
	public Estado() { }
	
	public Estado(String nome, String sigla) {
		super();
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
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
}
