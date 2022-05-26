package controller;

import domain.Animal;

public class ControleAnimal {
	
	Animal animal = new Animal();
	
	public void cadastrarAnimal(String nome, String especie, String raca) {
		animal.setNome(nome);
		animal.setEspecie(especie);
		animal.setRaca(raca);
	}
	
	public void consultarAnimal() {
		
	}
}
