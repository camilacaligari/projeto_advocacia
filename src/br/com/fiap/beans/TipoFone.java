package br.com.fiap.beans;

public class TipoFone {
	private short codigo;
	private String descricao;
	
	public TipoFone() { }
	
	public TipoFone(short codigo, String descricao) {
		super();
		setCodigo(codigo);
		setDescricao(descricao);
	}
	
	public short getCodigo() {
		return codigo;
	}
	public void setCodigo(short codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
