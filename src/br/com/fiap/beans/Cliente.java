package br.com.fiap.beans;

public class Cliente extends Pessoa {
	private String razaoSocial;
	private int cnpj;
	private int inscricaoEstadual;
	private String email;
	private String senha;
	
	public Cliente() { super(); }
	
	public Cliente(short codigo, String razaoSocial, int cnpj, int inscricaoEstadual, String email, String senha) {
		super();
		setCodigo(codigo);
		setRazaoSocial(razaoSocial);
		setCnpj(cnpj);
		setInscricaoEstadual(inscricaoEstadual);
		setEmail(email);
		setSenha(senha);
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public int getCnpj() {
		return cnpj;
	}
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	public int getInscricaoEstadual() {
		return inscricaoEstadual;
	}
	public void setInscricaoEstadual(int inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
