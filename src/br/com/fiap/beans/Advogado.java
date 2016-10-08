package br.com.fiap.beans;

public class Advogado extends Pessoa {
	private int numeroOab;
	private int cpf;
	private int rg;
	private String email;
	private String senha;
	private HoraAdvogado horas[];
	private Causa especialidades[];
	
	public Advogado() { super(); }
	
	public Advogado(short codigo, int numeroOab, int cpf, int rg, String email, String senha, Causa[] especialidades) {
		super();
		setCodigo(codigo);
		setNumeroOab(numeroOab);
		setCpf(cpf);
		setRg(rg);
		setEmail(email);
		setSenha(senha);
		setEspecialidades(especialidades);
	}

	public int getNumeroOab() {
		return numeroOab;
	}
	public void setNumeroOab(int numeroOab) {
		this.numeroOab = numeroOab;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public int getRg() {
		return rg;
	}
	public void setRg(int rg) {
		this.rg = rg;
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
	public HoraAdvogado[] getHoras() {
		return horas;
	}
	public void setHoras(HoraAdvogado horas[]) {
		this.horas = horas;
	}

	public Causa[] getEspecialidades() {
		return especialidades;
	}

	public void setEspecialidades(Causa[] especialidades) {
		this.especialidades = especialidades;
	}
}
