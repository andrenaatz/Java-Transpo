package exerccios;

import exerccios.base.Animal;
import exerccios.base.Cachorro;

public class AnimalController {
	
	private static Animal[] animais = new Animal[50];
	private static int quantidade = 0;

	public void cadastrarCachorro(String nome, int idade) {
		if(nome != null && idade > 0){
			Cachorro dog = new Cachorro();
			dog.setNome(nome);
			dog.setIdade(idade);
			cadastrarAnimal(dog);
		}
	}

	private void cadastrarAnimal(Animal animal) {
		if(animal != null && quantidade < animais.length) {
			animais[quantidade++] = animal;
		}
		
	}

	public void cadastrarGato(String nome, int idade) {
		if(nome != null && idade > 0){
			Gato bilu = new Gato();
			bilu.setNome(nome);
			bilu.setIdade(idade);
			cadastrarAnimal(bilu);
		}
		
	}

	public int contarAnimais() {
		return quantidade;
	}

	public Animal getAnimal(int i) {
		if(i> -1 && i <quantidade){
			return animais[i];
		}
		return null;
	}

}
