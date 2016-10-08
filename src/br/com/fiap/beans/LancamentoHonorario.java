package br.com.fiap.beans;

import java.util.Date;

public class LancamentoHonorario {
	private short codigo;
	private TipoTarefa tipo;
	private Date data;
	private double quantidadeHoras;
	private String observacao;
	
	public LancamentoHonorario() { }
	
	public LancamentoHonorario(short codigo, TipoTarefa tipo, Date data, double quantidadeHoras, String observacao) {
		super();
		setCodigo(codigo);
		setTipo(tipo);
		setData(data);
		setQuantidadeHoras(quantidadeHoras);
		setObservacao(observacao);
	}

	public short getCodigo() {
		return codigo;
	}
	public void setCodigo(short codigo) {
		this.codigo = codigo;
	}
	public TipoTarefa getTipo() {
		return tipo;
	}
	public void setTipo(TipoTarefa tipo) {
		this.tipo = tipo;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public double getQuantidadeHoras() {
		return quantidadeHoras;
	}
	public void setQuantidadeHoras(double quantidadeHoras) {
		this.quantidadeHoras = quantidadeHoras;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
}
