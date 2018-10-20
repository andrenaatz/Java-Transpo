package br.com.cursojava.aula005;

import java.util.Scanner;

public class Exercicios {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		execicio01(teclado);
		execicio02(teclado);
		execicio03(teclado);
	
		teclado.close();
	}

	private static void execicio01(Scanner teclado) {
		double[][] notas = new double[5][3];
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				System.out.printf("Digite a %dª nota do %dº aluno\n",j+1,i+1);
				notas[i][j] = Double.parseDouble(teclado.nextLine());
			}
		}
		System.out.println("As notas digitadas foram:");
		for (double[] alunos : notas) {
			for (double nota : alunos) {
				System.out.printf("%.2f  ",nota);
			}
			System.out.println("");
		}
		
	}

	private static void execicio02(Scanner teclado) {
		double[][] notas = new double[5][3];
		double[] medias = new double[5];
		
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				System.out.printf("Digite a %dª nota do %dº aluno\n",j+1,i+1);
				notas[i][j] = Double.parseDouble(teclado.nextLine());
				medias[i] += notas[i][j];
			}
			medias[i] /= notas[i].length;
		}
		System.out.println("As notas digitadas foram:");
		int index = 0;
		for (double[] alunos : notas) {
			for (double nota : alunos) {
				System.out.printf("%.2f  ",nota);
			}
			System.out.printf(" média = %.2f\n",medias[index++]);
		}
		
	}

	private static void execicio03(Scanner teclado) {
		int[][] matriz = {{10, 9, 8, 7},
				          {6,  5, 4, 3},
				          {2,  1, 2, 3},
				          {4,  5, 6, 7}};
		int soma = 0;
		for (int[] linha : matriz) {
			for (int celula : linha) {
				soma+= celula;
			}
		}
		System.out.println("A Soma de todos os valores é "+soma);
		
		System.out.print("Diagonal Principal: ");
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				if(linha == coluna){
					System.out.print(matriz[linha][coluna]+"  ");
				}
			}
		}
		System.out.println("");
		System.out.print("Diagonal Secundária: ");
		for (int linha = 0, limite= matriz.length-1; linha < matriz.length; linha++) {
				System.out.print(matriz[linha][limite--]+"  ");
		}
		System.out.println("");
		int[][] novaMatriz = new int[4][4];
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				novaMatriz[linha][coluna] = matriz[linha][coluna] * matriz[linha][linha];
			}
		}
		System.out.println("Nova Matriz multiplicada pela diagonal principal");
		for (int[] linha : novaMatriz) {
			for (int celula : linha) {
				System.out.printf("% 4d  ",celula);
			}
			System.out.println("");
		}
		for (int linha = 0, limite = matriz.length-1; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				if(linha == coluna){
					novaMatriz[linha][coluna] = (int) Math.pow(matriz[linha][coluna],3);
				}else if(coluna < linha){
					novaMatriz[linha][coluna] = matriz[linha][coluna] * matriz[linha][linha];
				}else if(coluna > linha){
					novaMatriz[linha][coluna] = matriz[linha][coluna] * matriz[linha][limite];
				}
			}
			limite--;
		}
		System.out.println("Nova Matriz alterada");
		for (int[] linha : novaMatriz) {
			for (int celula : linha) {
				System.out.printf("% 5d  ",celula);
			}
			System.out.println("");
		}
	}

	

}
