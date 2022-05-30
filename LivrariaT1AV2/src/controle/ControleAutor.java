package controle;

import dao.DaoAutor;
import domain.Autor;

public class ControleAutor {
	
	private Autor autor = new Autor();
	private DaoAutor daoAutor = new DaoAutor();
	
	public void cadastrarAutor(String nome, String nacionalidade) {
		autor.setNome(nome);
		autor.setNacionalidade(nacionalidade);
		
		daoAutor.cadastrar(autor);
	}

}
