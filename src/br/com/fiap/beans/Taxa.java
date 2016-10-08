package br.com.fiap.beans;

import java.util.Date;

public class Taxa {
	private short codigo;
	private Date dataVigencia;
	private double valorTaxaAdministrativa;
	private double valorTaxaJuros;
	private double valorMoraDiaria;
	
	public Taxa() { }
	
	public Taxa(short codigo, Date dataVigencia, double valorTaxaAdministrativa, double valorTaxaJuros,
			double valorMoraDiaria) {
		super();
		setCodigo(codigo);
		setDataVigencia(dataVigencia);
		setValorTaxaAdministrativa(valorTaxaAdministrativa);
		setValorTaxaJuros(valorTaxaJuros);
		setValorMoraDiaria(valorMoraDiaria);
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
	public double getValorTaxaAdministrativa() {
		return valorTaxaAdministrativa;
	}
	public void setValorTaxaAdministrativa(double valorTaxaAdministrativa) {
		this.valorTaxaAdministrativa = valorTaxaAdministrativa;
	}
	public double getValorTaxaJuros() {
		return valorTaxaJuros;
	}
	public void setValorTaxaJuros(double valorTaxaJuros) {
		this.valorTaxaJuros = valorTaxaJuros;
	}
	public double getValorMoraDiaria() {
		return valorMoraDiaria;
	}
	public void setValorMoraDiaria(double valorMoraDiaria) {
		this.valorMoraDiaria = valorMoraDiaria;
	}
}
