package dao;

import domain.Autor;

public class DaoAutor {
	
	private String url = "jdbc:mysql://localhost/livraria";
	private String usuario = "root";
	private String senha = "123456";
	
	public void cadastrar(Autor autor) {
		String nome = autor.getNome();
		String nacionalidade = autor.getNacionalidade();
		
		String operacao = "INSERT INTO autor (nome, nacionalidade) VALUES ('" + nome + "', '" + nacionalidade + "')";
	}

}
