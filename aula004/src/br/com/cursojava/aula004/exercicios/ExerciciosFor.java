package br.com.cursojava.aula004.exercicios;

import java.util.Scanner;

public class ExerciciosFor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
//		exercicioPares();
//		exercicioSoma50PrimeirosNumerosInteiros();
//		exercicioFatorial1a20(teclado);
//		exercicioRangeNumeros(teclado);
		exercicioPalavraEmLinhas(teclado);
		teclado.close();
	}


	private static void exercicioPares() {
		for(int i = 100; i<=200; i+=2){
			System.out.println(i);
		}
	}
	
	
	private static void exercicioSoma50PrimeirosNumerosInteiros() {
		int soma = 0;
		for(int i = 1; i<= 50;i++){
			soma += i;
		}
		System.out.println("Soma = "+soma);
	}

	private static void exercicioFatorial1a20(Scanner teclado) {
		int numero = 0;
		do{
			System.out.println("Digite um número entre 1 e 20");
			numero = Integer.parseInt(teclado.nextLine());
		}while(numero < 1 || numero > 20);
		
		long fatorial = 1;
		for(int i = 1; i<= numero; i++){
			fatorial *= i;
		}
		System.out.printf("Fatorial de %d é %d\n",numero,fatorial);
	}
	
	private static void exercicioRangeNumeros(Scanner teclado) {
		System.out.println("Digite o primeiro número");
		int numero1 = Integer.parseInt(teclado.nextLine());
		int numero2 = numero1;
		do{
			System.out.println("informe o segundo número:");
			numero2 = Integer.parseInt(teclado.nextLine());
			if(numero2 <= numero1){
				System.out.printf("O número deve ser maior que %d\n",numero1);
			}
		}while(numero2 <= numero1);
		
		for(int i = numero1; i<= numero2;i++){
			System.out.print(i+ " ");
		}
		System.out.println("");
	}
	
	private static void exercicioPalavraEmLinhas(Scanner teclado) {
		System.out.println("Digite uma palavra");
		String palavra = teclado.nextLine();
		for(int linha = 0; linha < palavra.length(); linha++ ){
			for(int coluna = 0; coluna <= linha; coluna++){
				System.out.print(palavra.charAt(coluna));
			}
			System.out.println("");
		}
	}
}
