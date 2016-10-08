package br.com.fiap.beans;

public class Telefone {
	private short codigo;
	private TipoFone tipo;
	private short ddd;
	private short numero;
	
	public Telefone() { }
	
	public Telefone(short codigo, TipoFone tipo, short ddd, short numero) {
		super();
		setCodigo(codigo);
		setTipo(tipo);
		setDdd(ddd);
		setNumero(numero);
	}

	public short getCodigo() {
		return codigo;
	}
	public void setCodigo(short codigo) {
		this.codigo = codigo;
	}
	public TipoFone getTipo() {
		return tipo;
	}
	public void setTipo(TipoFone tipo) {
		this.tipo = tipo;
	}
	public short getDdd() {
		return ddd;
	}
	public void setDdd(short ddd) {
		this.ddd = ddd;
	}
	public short getNumero() {
		return numero;
	}
	public void setNumero(short numero) {
		this.numero = numero;
	}
}
