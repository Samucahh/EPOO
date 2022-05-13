package controller;

import java.util.Scanner;
import domain.Fornecedor;

public class ControleFornecedor {
	
	public static void main(String[] args) {
				
		Scanner leia = new Scanner(System.in);
		
		System.out.println("CADASTRO DE FORNECEDOR --------------- ");
		
		System.out.print("Digite o CNPJ da empresa: ");
		String cnpj = leia.nextLine();
		
		System.out.print("\nDigite a razão social: ");
		String razaoSocial = leia.nextLine();
		
		System.out.print("\nDigite a data de fundação: ");
		String dataFundacao = leia.nextLine();
		
		
		leia.close();
		
		Fornecedor fornecedor = new Fornecedor(cnpj, razaoSocial, dataFundacao);
		
		System.out.println("\nDADOS DO FORNECEDOR --------------");
		System.out.print("\nCNPJ: " + fornecedor.formatarCnpj());
		System.out.print("\nRazão Social: " + fornecedor.informarRazaoSocial());
		System.out.println("\nEssa é a quantidade de palavras na RS: " + fornecedor.contarPalavras());
		
		
		
	}

}
