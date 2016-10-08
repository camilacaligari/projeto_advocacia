package br.com.fiap.beans;

import java.util.Date;

public class HoraAdvogado {
	private short codigo;
	private Date dataVigencia;
	private double valorHora;
	
	public HoraAdvogado() { }
	
	public HoraAdvogado(short codigo, Date dataVigencia, double valorHora) {
		super();
		setCodigo(codigo);
		setDataVigencia(dataVigencia);
		setValorHora(valorHora);
	}

	public short getCodigo() {
		return codigo;
	}
	public void setCodigo(short codigo) {
		this.codigo = codigo;
	}
	public Date getDataVigencia() {
		return dataVigencia;
	}
	public void setDataVigencia(Date dataVigencia) {
		this.dataVigencia = dataVigencia;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
}
