package br.com.cursojava.aula003;

public class Exercicios {
	
	public static void main(String[] args) {
		String texto = "Hoje È dia de Curso!";
		int index = texto.trim().lastIndexOf(" ");
		System.out.println(texto.trim().substring(index+1));
		
//		String teste = texto.replaceAll("[aA·¡‡¿„√‚¬eEÈ…iIÌÕoOı’Û”Ù‘uU˙⁄]", "");
//		System.out.println(teste);
//		String consoantes = texto.replaceAll("a","");
//		consoantes = consoantes.replaceAll("A","");
//		consoantes = consoantes.replaceAll("¡","");
//		consoantes = consoantes.replaceAll("·","");
//		consoantes = consoantes.replaceAll("‚","");
//		consoantes = consoantes.replaceAll("¬","");
//		consoantes = consoantes.replaceAll("„","");
//		consoantes = consoantes.replaceAll("√","");
//		consoantes = consoantes.replaceAll("‡","");
//		consoantes = consoantes.replaceAll("¿","");
//		consoantes = consoantes.replaceAll("e","");
//		consoantes = consoantes.replaceAll("E","");
//		consoantes = consoantes.replaceAll("…","");
//		consoantes = consoantes.replaceAll("È","");
//		consoantes = consoantes.replaceAll("Í","");
//		consoantes = consoantes.replaceAll(" ","");
//		consoantes = consoantes.replaceAll("i","");
//		consoantes = consoantes.replaceAll("I","");
//		consoantes = consoantes.replaceAll("Õ","");
//		consoantes = consoantes.replaceAll("Ì","");
//		consoantes = consoantes.replaceAll("o","");
//		consoantes = consoantes.replaceAll("O","");
//		consoantes = consoantes.replaceAll("Û","");
//		consoantes = consoantes.replaceAll("”","");
//		consoantes = consoantes.replaceAll("ı","");
//		consoantes = consoantes.replaceAll("’","");
//		consoantes = consoantes.replaceAll("Ù","");
//		consoantes = consoantes.replaceAll("‘","");
//		consoantes = consoantes.replaceAll("u","");
//		consoantes = consoantes.replaceAll("U","");
//		consoantes = consoantes.replaceAll("˙","");
//		consoantes = consoantes.replaceAll("⁄","");
//		System.out.println(consoantes);
	}

}
