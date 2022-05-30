package dao;

import domain.Autor;

public class ControleAutor {
	
	private Autor autor = new Autor();
	private DaoAutor daoComediante = new DaoAutor();
	
	public void cadastrarAutor(String nome, String nacionalidade) {
		autor.setNome(nome);
		autor.setNacionalidade(nacionalidade);
	}

}
