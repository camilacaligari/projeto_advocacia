package br.com.fiap.beans;

import java.util.Date;

public class Processo {
	private short numero;
	private String descricao;
	private Date dataAbertura;
	private Date dataFechamento;
	private short diaVencimento;
	private short numeroResultado;
	private short numeroSituacao;
	private String observacao;
	private LancamentoDespesa despesas[];
	private LancamentoHonorario honorarios[];
	
	public Processo() { }
	
	public Processo(short numero, String descricao, Date dataAbertura, Date dataFechamento, short diaVencimento,
			short numeroResultado, short numeroSituacao, String observacao, LancamentoDespesa[] despesas, LancamentoHonorario[] honorarios) {
		super();
		setNumero(numero);
		setDescricao(descricao);
		setDataAbertura(dataAbertura);
		setDataFechamento(dataFechamento);
		setDiaVencimento(diaVencimento);
		setNumeroResultado(numeroResultado);
		setNumeroSituacao(numeroSituacao);
		setObservacao(observacao);
		setDespesas(despesas);
		setHonorarios(honorarios);
	}
	
	public short getNumero() {
		return numero;
	}
	public void setNumero(short numero) {
		this.numero = numero;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Date getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	public Date getDataFechamento() {
		return dataFechamento;
	}
	public void setDataFechamento(Date dataFechamento) {
		this.dataFechamento = dataFechamento;
	}
	public short getDiaVencimento() {
		return diaVencimento;
	}
	public void setDiaVencimento(short diaVencimento) {
		this.diaVencimento = diaVencimento;
	}
	public short getNumeroResultado() {
		return numeroResultado;
	}
	public void setNumeroResultado(short numeroResultado) {
		this.numeroResultado = numeroResultado;
	}
	public short getNumeroSituacao() {
		return numeroSituacao;
	}
	public void setNumeroSituacao(short numeroSituacao) {
		this.numeroSituacao = numeroSituacao;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public LancamentoDespesa[] getDespesas() {
		return despesas;
	}
	public void setDespesas(LancamentoDespesa[] despesas) {
		this.despesas = despesas;
	}
	public LancamentoHonorario[] getHonorarios() {
		return honorarios;
	}
	public void setHonorarios(LancamentoHonorario[] honorarios) {
		this.honorarios = honorarios;
	}
}
