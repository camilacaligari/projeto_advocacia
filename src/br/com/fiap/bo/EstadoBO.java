package br.com.fiap.bo;

import java.util.List;

import br.com.fiap.beans.Estado;
import br.com.fiap.dao.EstadoDAO;

public class EstadoBO {
	public List<Estado> listar() throws Exception {
		return new EstadoDAO().getLista();
	}
	
	public void inserir(String nome, String sigla) throws Exception {
		if (new EstadoDAO().gravar(new Estado(nome, sigla))) {
			System.out.println("Gravado com sucesso!");
		}
		else {
			System.out.println("Não foi possível gravar o registro.");
		}
	}
	
	public void inserir(Estado estado) throws Exception {
		if (new EstadoDAO().gravar(estado)) {
			System.out.println("Gravado com sucesso!");
		}
		else {
			System.out.println("Não foi possível gravar o registro.");
		}
	}
}
