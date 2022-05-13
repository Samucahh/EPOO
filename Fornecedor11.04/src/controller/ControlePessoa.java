package controller;

import java.util.Scanner;
import domain.Pessoa;

public class ControlePessoa {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		 System.out.println("\nCADASTRO DE PESSOA -----------------");
		 
		 System.out.print("Digite seu CPF: ");
		 String cpf = leia.nextLine();
		 
		 System.out.print("\nDigite seu nome: ");
		 String nome = leia.nextLine();
		 
		 System.out.print("\nDigite seu sobrenome:");
		 String sobrenome = leia.nextLine();
		 
		 System.out.print("\nDigite a data: ");
		 String data = leia.nextLine();
		 
		 Pessoa pessoa = new Pessoa(cpf, nome, sobrenome, data);
		 
		 System.out.println("DADOS DA PESSOA CADASTRADA ----------------");
		 System.out.print("\nNome: " + pessoa.informarNome());
		 System.out.print("\nCPF: " + pessoa.formataCpf());
		 System.out.print("\nNumero de vogais no nome: " + pessoa.contarVogais());
		 
		
		
		leia.close();
		
	}

}
