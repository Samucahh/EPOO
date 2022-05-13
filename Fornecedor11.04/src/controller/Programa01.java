package controller;

import java.util.Scanner;

public class Programa01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite uma palavra: ");
		
		String palavra = leia.nextLine();
		int qtd = palavra.length();		
		System.out.println("Quantidade de caracteres: " + qtd);
		
		char prim = palavra.charAt(0);		
		System.out.println("Primeiro caractere: " + prim);
		
		char ultm = palavra.charAt(palavra.length() - 1);		
		System.out.println("Último caractere: " + ultm);
		
		int pos1 = palavra.indexOf('a');		
		System.out.println("Primeira posição de a: " + pos1);
		
		int pos2 = palavra.lastIndexOf('a');
		System.out.println("Última posição de a: " + pos2);
		
		leia.close();
		
		String trecho = palavra.substring(3, 7);
		
		System.out.println("Trecho entre posições 3 e 7: " + trecho);
		
		System.out.println("Trecho entre primeiro e último a: " + palavra.substring(pos1, pos2));
		
		if (palavra.compareTo("Programação") == 0)
			System.out.println("Palavras Iguais");
		else
			System.out.println("Palavras Diferentes");
		System.out.println("Em maiúsculas: " + palavra.toUpperCase());
		System.out.println("Em minúsculas: " + palavra.toLowerCase());
	}

}
