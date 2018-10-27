package exerccios;

import exerccios.base.Animal;

public class Gato  extends Animal{

	public void correr(){
		System.out.println("Gato correndo...");
	}
	
	public void comer(String comida){
		System.out.println("Gato comendo "+comida);
	}
	
	public void comer(String comida, int quantidade){
		System.out.println("Gato comendo "+comida + " "+ quantidade+ " Vezes");
	}
	
	
}
