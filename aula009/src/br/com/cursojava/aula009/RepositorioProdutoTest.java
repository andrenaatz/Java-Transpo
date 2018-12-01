package br.com.cursojava.aula009;

import java.util.List;

public class RepositorioProdutoTest {
	
	public static void main(String[] args) {
//		testInserir();
//		testListarTodos();
//		testBuscarPorId();
//		testBuscarPorFaixa();
		testAtualizar();
//		testRemover();
//		testContar();
	}
	
	private static void testInserir(){
		Produto produto = new Produto(null,"Produto 01","Primeiro produto",99.70);
		RepositorioProduto repositorio = new RepositorioProduto();
		
		repositorio.inserir(produto);
		System.out.println(produto);
		
		produto = new Produto(null,"Produto 02","Segundoo produto",27.97);
		repositorio.inserir(produto);
		System.out.println(produto);
	}
	
	private static void testListarTodos(){
		RepositorioProduto repositorio = new RepositorioProduto();
		List<Produto> buscarTodos = repositorio.buscarTodos();
		System.out.println("======================");
		System.out.println("LISTAR TODOS");
		System.out.println("======================");
		for (Produto produto : buscarTodos) {
			System.out.println(produto);
		}
	}
	
	private static void testBuscarPorId(){
		System.out.println("======================");
		System.out.println("BUSCAR POR ID");
		System.out.println("======================");
		RepositorioProduto repositorio = new RepositorioProduto();
		System.out.println(repositorio.buscarPorId(1));
		System.out.println(repositorio.buscarPorId(5000));
	}
	
	private static void testBuscarPorFaixa(){
		RepositorioProduto repositorio = new RepositorioProduto();
		List<Produto> buscarTodos = repositorio.buscarPorFaixaPreco(20, 1000);
		System.out.println("======================");
		System.out.println("LISTAR por faixa 20 -1000");
		System.out.println("======================");
		for (Produto produto : buscarTodos) {
			System.out.println(produto);
		}
		
		buscarTodos = repositorio.buscarPorFaixaPreco(70, 99.70);
		System.out.println("======================");
		System.out.println("LISTAR  por faixa 70 -99.70");
		System.out.println("======================");
		for (Produto produto : buscarTodos) {
			System.out.println(produto);
		}
	}
	
	private static void testAtualizar(){
		RepositorioProduto repositorio = new RepositorioProduto();
		Produto produto = repositorio.buscarPorId(2);
		
		produto.setDescricao("Segundo produto atualizado");
		repositorio.atualizar(produto);
		produto = repositorio.buscarPorId(2);
		System.out.println(produto);
	}
	
	private static void testRemover(){
		System.out.println("======================");
		System.out.println("REMOVER");
		System.out.println("======================");
		RepositorioProduto repositorio = new RepositorioProduto();
		repositorio.remover(1);
		System.out.println(repositorio.buscarPorId(1));
	}
	
	private static void testContar(){
		System.out.println("======================");
		System.out.println("Contar");
		System.out.println("======================");
		RepositorioProduto repositorio = new RepositorioProduto();
		System.out.println(repositorio.contar());
	}

}
