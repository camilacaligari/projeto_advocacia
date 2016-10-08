package br.com.fiap.conexao;

import java.sql.Connection;

public final class Conexao {
	private static Connection conexao;
	
	public static Connection getConexao() throws Exception {
		if (conexao == null) {
			conexao = new ConexaoFactory().getConnection();
		}
		
		return conexao;
	}
}
