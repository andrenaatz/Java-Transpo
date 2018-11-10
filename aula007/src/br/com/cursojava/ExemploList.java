package br.com.cursojava;

import java.util.ArrayList;
import java.util.List;

public class ExemploList {
	
	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();
		
		//adicionar elementos ao final da lista
		nomes.add("Jo�o");
		nomes.add("Maria");
		System.out.println(nomes);
		//retorna a quantidade de elementos da lista [lista.size()]
		System.out.println(nomes.size());
		//adicionar elementos no in�cio [lista.add(posicao,elemento)]
		nomes.add(0,"Jos�");
		nomes.add(0,"Ana");
		System.out.println(nomes);
		nomes.add("Frederico");
		System.out.println(nomes);
		//trocar o elemento [lista.set(indice,elemento)]
		nomes.set(nomes.size() -1, "Tib�rcio");
		System.out.println(nomes);
		//buscar um elemento espec�fico na lista [lista.get(indice)]
		System.out.println(nomes.get(0));
		System.out.println(nomes.get(1));
		System.out.println(nomes.get(2));
		System.out.println(nomes.get(3));
		//verificar o �ndice de um elemento [lista.indexOf(elemento)]
		System.out.println(nomes.indexOf("Tib�rcio"));
		System.out.println(nomes.indexOf("Mar�lia")); //se n�o existir retorna -1
		//verificar se um elemento est� contido na lista [lista.contains(elemento)]
		System.out.println(nomes.contains("Jo�o"));
		System.out.println(nomes.contains("Bartolomeu"));
		//criar uma sublista[lista.subList(inicio, fim)]
		List<String> sublista = nomes.subList(2,nomes.size());
		System.out.println(sublista);
		//remover um elemento da lista atrav�s do �ndice [lista.remove(index)]
		System.out.println(nomes);
		nomes.remove(0);
		System.out.println(nomes);
		//remover um elemento da lista atrav�s da refer�ncia[lista.remove(elemento)]
		nomes.remove("Maria");
		System.out.println(nomes);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
