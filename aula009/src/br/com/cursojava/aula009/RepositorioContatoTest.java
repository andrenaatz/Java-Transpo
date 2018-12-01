package br.com.cursojava.aula009;

import java.util.List;

public class RepositorioContatoTest {
	
	public static void main(String[] args) {
//		testInserir();
//		testListarTodos();
//		testBuscarPorId();
//		testAtualizar();
//		testRemover();
		testContar();
	}
	
	private static void testInserir(){
		Contato contato = new Contato(null,"Bagrinho","b@teste.com","33221100");
		RepositorioContato repositorio = new RepositorioContato();
		
		repositorio.inserir(contato);
		System.out.println(contato);
	}
	
	private static void testListarTodos(){
		RepositorioContato repositorio = new RepositorioContato();
		List<Contato> buscarTodos = repositorio.buscarTodos();
		System.out.println("======================");
		System.out.println("LISTAR TODOS");
		System.out.println("======================");
		for (Contato contato : buscarTodos) {
			System.out.println(contato);
		}
	}
	
	private static void testBuscarPorId(){
		System.out.println("======================");
		System.out.println("BUSCAR POR ID");
		System.out.println("======================");
		RepositorioContato repositorio = new RepositorioContato();
		System.out.println(repositorio.buscarPorId(1));
		System.out.println(repositorio.buscarPorId(5000));
	}
	
	private static void testAtualizar(){
		RepositorioContato repositorio = new RepositorioContato();
		Contato contato = repositorio.buscarPorId(1);
		
		contato.setNome("Bagrinho da Silva Brasil");
		repositorio.atualizar(contato);
		contato = repositorio.buscarPorId(1);
		System.out.println(contato);
	}
	
	private static void testRemover(){
		System.out.println("======================");
		System.out.println("REMOVER");
		System.out.println("======================");
		RepositorioContato repositorio = new RepositorioContato();
		repositorio.remover(1);
		System.out.println(repositorio.buscarPorId(1));
	}
	
	private static void testContar(){
		System.out.println("======================");
		System.out.println("Contar");
		System.out.println("======================");
		RepositorioContato repositorio = new RepositorioContato();
		System.out.println(repositorio.contar());
	}

}









