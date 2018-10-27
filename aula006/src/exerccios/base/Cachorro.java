package exerccios.base;

public class Cachorro extends Animal{
	
	@Override
	public void correr(){
		System.out.println("Cachorro correndo...");
	}
	
	@Override
	public void comer(String comida){
		System.out.println("Cachorro comendo "+comida);
	}

}
