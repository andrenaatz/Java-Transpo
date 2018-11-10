package br.com.cursojava;

import java.util.HashMap;
import java.util.Map;

public class ExemploMap {
	
	public static void main(String[] args) {
		Map<String, Pessoa> mapa = new HashMap<>();
		
		//adicionar elementos
		mapa.put("123456", new Pessoa("Maria"));
		mapa.put("789012", new Pessoa("João"));
		mapa.put("teste1", new Pessoa("Mariana"));
		System.out.println(mapa);
		//quantidade de elementos
		System.out.println(mapa.size());
		//troca de valores
		mapa.put("troca", new Pessoa("Pessoa1"));
		mapa.put("troca", new Pessoa("Tibúrcio"));
		mapa.put("troca2", new Pessoa("Tibúrcio"));
		System.out.println(mapa);
		
		//verifica se existe uma chave
		System.out.println(mapa.containsKey("123456"));
		System.out.println(mapa.containsKey("naoexiste"));
		
		//verifica se existe um valor específico
		System.out.println(mapa.containsValue(new Pessoa("Maria")));
		System.out.println(mapa.containsValue(new Pessoa("Joana")));
		
		//busca um elemento através da chave
		System.out.println(mapa.get("123456"));
		System.out.println(mapa.get("troca1000"));
		//retorna o conjunto de keys(chaves)
		System.out.println(mapa.keySet());
		//retorna o conjunto dos valores
		System.out.println(mapa.values());
		//percorre todos os elementos através de um entryset
		for(Map.Entry<String, Pessoa> entry: mapa.entrySet()){
			System.out.println(entry.getKey() +" - "+entry.getValue());
		}
		
		//remover um elemento
		mapa.remove("123456");
		System.out.println(mapa);
		//remover todos os itens
		mapa.clear();
		System.out.println(mapa);
		
		
	}
	
	
	

}
