package br.com.fiap.beans;

public class Forum extends Pessoa {
	private String descricao;
	
	public Forum() { super(); }
	
	public Forum(short codigo, String descricao) {
		super();
		setCodigo(codigo);
		setDescricao(descricao);
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
