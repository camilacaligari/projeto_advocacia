package br.com.fiap.beans;

public class Bairro {
	private short codigo;
	private Cidade cidade;
	private String nome;
	
	public Bairro() { }
	
	public Bairro(short codigo, Cidade cidade, String nome) {
		super();
		setCodigo(codigo);
		setCidade(cidade);
		setNome(nome);
	}

	public short getCodigo() {
		return codigo;
	}
	public void setCodigo(short codigo) {
		this.codigo = codigo;
	}
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
