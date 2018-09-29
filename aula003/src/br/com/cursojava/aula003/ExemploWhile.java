package br.com.cursojava.aula003;

public class ExemploWhile {

	public static void main(String[] args) {
		String palavra = "Vida";
		int count = 0;
		while(count < palavra.length()){
			int col = 0;
			while(col++ <= count){
				System.out.printf("%s ",palavra);
			}
			System.out.println("");
			count++;
		}
	}
}
