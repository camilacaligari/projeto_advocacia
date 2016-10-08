package br.com.fiap.beans;

public class TipoLogradouro {
	private short codigo;
	private String descricao;
	
	public TipoLogradouro() { }
		
	public TipoLogradouro(short codigo, String descricao) {
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
