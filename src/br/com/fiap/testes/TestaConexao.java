package br.com.fiap.testes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.fiap.conexao.ConexaoFactory;
import br.com.fiap.excecoes.Excecao;

public class TestaConexao {
	public static void main(String[] args) throws Exception {
		Connection con = ConexaoFactory.getConexao();
		
		try {
			PreparedStatement stmt = con.prepareStatement("SELECT * FROM T_AM_NFM_ESTADO");
			ResultSet result = stmt.executeQuery();
			
			while (result.next()) {
				System.out.println(result.getString("NM_ESTADO"));
				System.out.println(result.getString("SG_ESTADO"));
			}
			
			result.close();
		} catch (Exception e) {
			new Excecao(e.getMessage(), e);
		} finally {
			con.close();
		}
	}
}
