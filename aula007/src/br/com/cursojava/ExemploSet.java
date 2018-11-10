package br.com.cursojava;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploSet {
	
	public static void main(String[] args) {
		Set<String> nomes = new HashSet<>();
		
		//adicionar elementos
		nomes.add("Maria");
		nomes.add("Ana");
		System.out.println(nomes);
		//não são permitidos elementos duplicados
		boolean adicionado = nomes.add("Ana");
		System.out.println(adicionado);
		System.out.println(nomes);
		//verificar a quantidade de elementos
		System.out.println(nomes.size());
		//verifica se o conjunto tem um elemento
		System.out.println(nomes.contains("Ana"));
		System.out.println(nomes.contains("Beatriz"));
		//verifica se o conjunto está vazio
		System.out.println(nomes.isEmpty());
		//itera sobre o conjunto.
		for (String atual : nomes) {
			System.out.println(atual);
		}
		Iterator<String> iterator = nomes.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		//remove um elemento do conjunto
		System.out.println(nomes);
		nomes.remove("Maria");
		System.out.println(nomes);
		
	}
	
}









