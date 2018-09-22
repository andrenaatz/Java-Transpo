package br.co.cursojava.aula002;

import java.util.Scanner;

public class ExemploLeitor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Olá, informe seu nome por favor:");
		String nome = teclado.nextLine();
		System.out.printf("O nome informado foi %s \n",nome);
		teclado.close();
		
		
		
	}
	
}
