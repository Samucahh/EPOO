package domain;

public class Pessoa {
	
	String cpf, nome, sobrenome, data;
	
	public Pessoa(String cpf, String nome, String sobrenome, String data) {
		this.cpf = cpf;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.data = data;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
	public String informarNome() {
		return nome + " " + sobrenome;
	}
	
	public String dataFormatada() {
		String dataf;
		
		dataf = data.substring(0, 2) + "/" +
				data.substring(2, 4) + "/" +
				data.substring(4, 8);
		return dataf;
		}
	
	public String formataCpf() {
		String cpf;
		
		cpf = this.cpf.substring(0, 3) + "." +
		this.cpf.substring(3, 6) + "." +
		this.cpf.substring(6, 9) + "-" +
		this.cpf.substring(9, 11);
		
		return cpf;		
	}
	
	public int contarVogais() {
		int qnt = 0;
		
		for(int i = 0; i < informarNome().length(); i++) {
			switch(informarNome().toLowerCase().charAt(i)) {
				case('a'):
				case('e'):
				case('i'):
				case('o'):
				case('u'): qnt++;		
			}
		}		
		return qnt;		
	}
	
}
