package dao;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.sun.jdi.connect.spi.Connection;

import domain.Autor;

public class DaoAutor {
	
	private String url = "jdbc:mysql://localhost/livraria";
	private String usuario = "root";
	private String senha = "123456";
	
	public void cadastrar(Autor autor) {
		String nome = autor.getNome();
		String nacionalidade = autor.getNacionalidade();
		
		String operacao = "INSERT INTO autor (nome, nacionalidade) VALUES ('" + nome + "', '" + nacionalidade + "')";
	
		try {
			Connection conexao = (Connection)
			DriverManager.getConnection(url, usuario, senha);
			PreparedStatement comando =
			(PreparedStatement)((java.sql.Connection) conexao).prepareStatement(operacao);
			comando.execute();
			}
			catch(SQLException e) {
			System.out.println("Erro de conexão com o Banco de Dados!!!");
			}			
		
	}

}
