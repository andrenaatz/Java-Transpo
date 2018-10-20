package br.com.cursojava.aula005.orientacaoobjeto;

public class UsoLampada {

	public static void main(String[] args) {
		
		Lampada lamp = null;
		lamp = new Lampada();
		
		lamp.potencia = 100;
		lamp.tipo = "Incandecente";
		System.out.println(lamp.potencia);
		System.out.println(lamp.tipo);
		System.out.println("Está ligada? " + lamp.isLigada());
		lamp.ligar();
		System.out.println("Está ligada? " + lamp.isLigada());
		lamp.desligar();
		System.out.println("Está ligada? " + lamp.isLigada());
		lamp.configurarTipo("LED");
		System.out.println(lamp.tipo);
		
		System.out.println("lamp.potencia = "+lamp.potencia);
		System.out.println("lamp.tipo = "+lamp.tipo);
		
		Lampada lamp2 = new Lampada();
		System.out.println("lamp2.potencia = "+lamp2.potencia);
		System.out.println("lamp2.tipo = "+lamp2.tipo);
		
		
	}
	
	
	
}
