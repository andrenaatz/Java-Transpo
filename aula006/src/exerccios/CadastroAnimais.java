package exerccios;

import java.util.Scanner;

import exerccios.base.Animal;

public class CadastroAnimais {
	
	private AnimalController controller = new AnimalController();

	public void mostrarMenu(Scanner teclado) {
		int opcao = 0;
		do {
			System.out.println("1 - Cadastrar Cachorro");
			System.out.println("2 - Cadastrar Gato");
			System.out.println("3 - Listar Animais");
			System.out.println("4 - Sair");
			opcao = Integer.parseInt(teclado.nextLine());
			tratarOpcao(opcao, teclado);
		} while (opcao != 4);
	}

	private void tratarOpcao(int opcao, Scanner teclado) {
		switch (opcao) {
		case 1:
			cadastrarCachorro(teclado);
			break;
		case 2:
			cadastrarGato(teclado);
			break;
		case 3:
			listarAnimais();
			break;
		case 4:
			sair();
			break;
		default:
			tratarOpcaoInvalida();
		}

	}

	private void tratarOpcaoInvalida() {
		System.out.println("Opção inválida");
	}

	private void cadastrarCachorro(Scanner teclado) {
		cadastrarAnimal(teclado, "cachorro");
		
	}
	private void cadastrarGato(Scanner teclado) {
		cadastrarAnimal(teclado, "gato");
		
	}
	private void cadastrarAnimal(Scanner teclado, String tipo){
		System.out.println("Informe o nome do "+tipo);
		String nome = teclado.nextLine();
		System.out.println("A Idade do "+tipo);
		int idade = Integer.parseInt(teclado.nextLine());
		if("cachorro".equals(tipo)){
			controller.cadastrarCachorro(nome,idade);
		}else{
			controller.cadastrarGato(nome,idade);
		}
	}

	private void listarAnimais() {
		int quantidade = controller.contarAnimais();
		if(quantidade > 0){
			Animal animal = null;
			for(int i = 0; i<quantidade; i++){
				animal = controller.getAnimal(i);
				System.out.println(animal.getNome());
				animal.correr();
				animal.comer("carne");
			}
		}else{
			System.out.println("Não existem animais cadastrados");
		}
		
		
	}

	private void sair() {
		System.out.println("Obridado.");
		
	}

	
}
