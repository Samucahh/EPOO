package domain;

public class Fornecedor {
	
	String cnpj, razaoSocial, dataFundacao;
	
	public Fornecedor(String cnpj, String razaoSocial, String dataFundacao) {
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.dataFundacao = dataFundacao;
	}
	
	public String formatarCnpj(){
		String cnpjFormatado = this.cnpj.substring(0, 2) + "." +
				this.cnpj.substring(2, 5) + "." + 
				this.cnpj.substring(5, 8) + "/" +
				this.cnpj.substring(8, 12) + "-" +
				this.cnpj.substring(12, 14);
				
		return cnpjFormatado;
	}
	
	public String informarRazaoSocial() {
		return this.razaoSocial;
	}

	public int contarPalavras() {		
		String[] palavra = razaoSocial.split("\\s+");		
		return palavra.length;	
	}

}
