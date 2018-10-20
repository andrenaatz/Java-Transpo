package br.com.cursojava.aula005.orientacaoobjeto;


public class Lampada {

	int potencia;
	int voltagem;
	String tipo;
	boolean ligada;
	
	public void ligar(){
		System.out.println("Lampada ligada");
		ligada = true;
	}
	
	public void desligar(){
		System.out.println("Lampada desligada");
		ligada = false;
	}
	public boolean isLigada(){
		return ligada;
	}
	
	public void configurarTipo(String novoTipo){
		tipo = novoTipo;
	}
	
	

	
	
	
}
