package br.com.fiap.testes;

import br.com.fiap.beans.Estado;
import br.com.fiap.bo.EstadoBO;
import br.com.fiap.excecoes.Excecao;

public class TestaEstado {
	public static void main(String[] args) throws Excecao {
		try {
			EstadoBO bo = new EstadoBO();
			
			System.out.println("====== ESTADOS =======");
			
			for (Estado estado: bo.listar()) {
				System.out.println("Estado: " + estado.getNome() + "/" + estado.getSigla());
			}
		} catch (Exception e) {
			throw new Excecao(e.getMessage(), e);
		}
	}
}
