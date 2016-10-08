package br.com.fiap.beans;

public class Cidade {
	private short codigo;
	private Estado estado;
	private String nome;
	
	public Cidade() { }
	
	public Cidade(short codigo, Estado estado, String nome) {
		super();
		setCodigo(codigo);
		setEstado(estado);
		setNome(nome);
	}

	public short getCodigo() {
		return codigo;
	}
	public void setCodigo(short codigo) {
		this.codigo = codigo;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
