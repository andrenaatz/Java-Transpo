package br.com.cursojava.exercicios;

import java.util.Scanner;

public class CadastroProduto {

	private ProdutoController controller = new ProdutoController();

	public void mostrarMenu(Scanner teclado) {
		int opcao = 0;
		do {
			System.out.println("====================");
			System.out.println("=       Menu       =");
			System.out.println("====================");
			System.out.println("1 - Cadastrar Produto");
			System.out.println("2 - Listar Produtos");
			System.out.println("3 - Remover Produto");
			System.out.println("4 - Sair");
			opcao = Integer.parseInt(teclado.nextLine());
			tratarOpcao(opcao, teclado);
		} while (opcao != 4);
	}

	private void tratarOpcao(int opcao, Scanner teclado) {
		switch (opcao) {
		case 1:
			cadastrarProduto(teclado);
			break;
		case 2:
			listarProdutos();
			break;
		case 3:
			removerProduto(teclado);
			break;
		case 4:
			System.out.println("Finalizando o sistema");
			break;
		default:
			System.out.println("Opção inválida");
		}

	}

	private void cadastrarProduto(Scanner teclado) {
		System.out.println("==============================");
		System.out.println("=  Menu - Cadastrar Produto  =");
		System.out.println("==============================");
		System.out.println("Informe o nome:");
		String nome = teclado.nextLine();
		System.out.println("Informe a descrição:");
		String descricao = teclado.nextLine();
		System.out.println("Informe o preco:");
		double preco = Double.parseDouble(teclado.nextLine());
		boolean ok = controller.criarProduto(nome,descricao,preco);
		if(ok){
			System.out.println("Produto cadastrado com sucesso");
		}else{
			System.out.println("Não foi possível cadastrar o produto");
		}
		
	}

	private void listarProdutos() {
		System.out.println("==============================");
		System.out.println("=  Menu - Listar Produtos    =");
		System.out.println("==============================");
		int quantidade = controller.contarProdutos();
		if(quantidade != 0){
			Produto produto = null;
			for(int i = 0; i< quantidade; i++){
				produto = controller.buscarProduto(i);
				System.out.printf("%d - %s - %s - %.2f\n", i,produto.getNome(),produto.getDescricao(),produto.getPreco());
			}
		}else{
			System.out.println("Não existem produtos cadastrados");
		}
		
	}

	private void removerProduto(Scanner teclado) {
		System.out.println("==============================");
		System.out.println("=  Menu - Remover Produto    =");
		System.out.println("==============================");
		System.out.println("Informe o índice do produto");
		int indice = Integer.parseInt(teclado.nextLine());
		boolean ok = controller.removerProduto(indice);
		if(ok){
			System.out.println("Produto removido com sucesso");
		}else{
			System.out.println("Não foi possível remover o produto");
		}
		
	}
}
