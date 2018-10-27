package br.cursojava.aula006;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o nome do contato");
		String nome = teclado.nextLine();
		contato.setNome(nome);
		contato.setEmail("felipe@teste.com");
		contato.setTelefone("33221100");
		
		
		//contato.nome = "NÊ";
		
		System.out.println(contato.getNome());
		System.out.println(contato.getEmail());
		System.out.println(contato.getTelefone());
		teclado.close();
	}
}
