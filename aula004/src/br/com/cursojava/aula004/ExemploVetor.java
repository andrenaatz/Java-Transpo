package br.com.cursojava.aula004;
public class ExemploVetor {
	public static void main(String[] args) {
		int[] numeros = new int [3];
		String nomes[] = new String[5];
		int[] notas = {10,9,8};
	    String[] cursos = {"Java","Python","AWS"};
		String[] frutas = new String[]{"Banana","Abacaxi","Morango"};
		numeros[0] = 10;
		numeros[1] = 3;
		numeros[2] = 7;
		for(int i = 0; i< nomes.length; i++){
			nomes[i] = "Nome "+(i+1);
		}
		for (int i = 0; i < notas.length; i++) {
			int atual = notas[i];
			System.out.println(notas[i]);
			System.out.println(atual);
		}
		boolean achou = false;
		for (String atual : frutas) {
			if("Abacaxi".equals(atual)  ){
				System.out.println("Achou!!!");
				achou = true;
				break;
			}
			System.out.println(atual);
		}
		System.out.println("Achou abacaxi = "+achou);
	}
	
}



