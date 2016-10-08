package br.com.fiap.beans;

import java.util.Date;

public class LancamentoDespesa {
	private short codigo;
	private TipoDespesa tipo;
	private Date data;
	private double valor;
	private String observacao;
	
	public LancamentoDespesa() { }
	
	public LancamentoDespesa(short codigo, TipoDespesa tipo, Date data, double valor, String observacao) {
		super();
		setCodigo(codigo);
		setTipo(tipo);
		setData(data);
		setValor(valor);
		setObservacao(observacao);
	}

	public short getCodigo() {
		return codigo;
	}
	public void setCodigo(short codigo) {
		this.codigo = codigo;
	}
	public TipoDespesa getTipo() {
		return tipo;
	}
	public void setTipo(TipoDespesa tipo) {
		this.tipo = tipo;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
}
