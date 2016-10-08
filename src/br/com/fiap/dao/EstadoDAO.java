package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Estado;
import br.com.fiap.conexao.ConexaoFactory;

public class EstadoDAO {
	private Connection conexao;
	
	public EstadoDAO() throws Exception {
		this.conexao = ConexaoFactory.getConexao();
	}
	
	public List<Estado> getLista() throws Exception {
		List<Estado> estados = new ArrayList<Estado>();
		
		PreparedStatement stmt = this.conexao.prepareStatement("SELECT * FROM T_AM_NFM_ESTADO");
		ResultSet result = stmt.executeQuery();
		
		while (result.next()) {
			Estado estado = new Estado();
			estado.setCodigo(result.getShort("CD_ESTADO"));
			estado.setNome(result.getString("NM_ESTADO"));
			estado.setSigla(result.getString("SG_ESTADO"));
			estados.add(estado);
		}
		
		result.close();
		stmt.close();
		return estados;
	}
	
	public boolean gravar(Estado estado) throws Exception {
		String query = "INSERT INTO T_AM_NFM_ESTADO (CD_ESTADO, NM_ESTADO, SG_ESTADO) VALUES (SQ_AM_ESTADO.NEXTVAL, ?, ?)";
		PreparedStatement stmt = this.conexao.prepareStatement(query);
		stmt.setString(1, estado.getNome());
		stmt.setString(2, estado.getSigla());
		boolean resp = stmt.execute();
		stmt.close();
		
		return resp;
	}
}
