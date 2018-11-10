package br.com.cursojava.exercicios;

import java.util.ArrayList;
import java.util.List;

public class ProdutoController {
	
	private List<Produto> produtos = new ArrayList<>();

	public boolean criarProduto(String nome, String descricao, double preco) {
		return produtos.add(new Produto(nome, descricao, preco));
	}

	public int contarProdutos() {
		return produtos.size();
	}

	public Produto buscarProduto(int indice) {
		if(indice >-1 && indice < produtos.size()){
			return produtos.get(indice);
		}
		return null;
	}

	public boolean removerProduto(int indice) {
		boolean resultado = false;
		if(indice > -1 && indice < produtos.size()){
			resultado =  produtos.remove(indice) != null;
		}
		return resultado;
	}

}
