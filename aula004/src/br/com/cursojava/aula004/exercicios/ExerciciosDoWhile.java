package br.com.cursojava.aula004.exercicios;

import java.util.Scanner;

public class ExerciciosDoWhile {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
//		exercicio01(teclado);
//		exercicio02(teclado);
		exercicio03(teclado);
		teclado.close();
	}

	private static void exercicio01(Scanner teclado) {
		int idade = -1;
		do {
			System.out.println("Informe sua idade");
			idade = Integer.parseInt(teclado.nextLine());
			if (idade < 0) {
				System.out.println("valor inválido");
			}
		} while (idade < 0);
		System.out.println("A idade informada foi " + idade);
	}

	private static void exercicio02(Scanner teclado) {
		String opcao = "";
		do {
			System.out.println("A - abrir arquivo");
			System.out.println("B - Procurar arquivo");
			System.out.println("C - Download arquivo");
			System.out.println("D - Upload de arquivo");
			System.out.println("S - Sair");
			opcao = teclado.nextLine();
		} while (!"S".equalsIgnoreCase(opcao));

	}

	private static void exercicio03(Scanner teclado) {
		System.out.println("Digite uma palavra:");
		String palavra = teclado.nextLine();
		String inverso = "";
		int index = palavra.length()-1;
		if(index > -1){
			do{
				inverso += palavra.charAt(index--);
			}while(index >=0);
		}
		System.out.printf("O inverso da palavra digitada é '%s'\n", inverso);

	}
}
