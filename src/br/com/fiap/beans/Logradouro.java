package br.com.fiap.beans;

public class Logradouro {
	private long numeroCep;
	private Bairro bairro;
	private TipoLogradouro tipo;
	private String descricao;
	
	public Logradouro() { }
	
	public Logradouro(long numeroCep, Bairro bairro, TipoLogradouro tipo, String descricao) {
		super();
		setNumeroCep(numeroCep);
		setBairro(bairro);
		setTipo(tipo);
		setDescricao(descricao);
	}

	public long getNumeroCep() {
		return numeroCep;
	}
	public void setNumeroCep(long numeroCep) {
		this.numeroCep = numeroCep;
	}
	public Bairro getBairro() {
		return bairro;
	}
	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}
	public TipoLogradouro getTipo() {
		return tipo;
	}
	public void setTipo(TipoLogradouro tipo) {
		this.tipo = tipo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
