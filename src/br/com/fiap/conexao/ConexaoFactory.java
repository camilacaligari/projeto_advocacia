package br.com.fiap.conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoFactory {
	public Connection getConnection() throws Exception {
		String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
		String DBUSER = "OPS$RM76507";
		String DBPASS = "201293";
		return DriverManager.getConnection(url, DBUSER, DBPASS);
	}
}