package br.com.cursojava.aula003;

public class ExemploString {
	
	public static void main(String[] args) {
		
		String curso = "Curso Java TranspoBrasil Sábado";
		
		//Quantidade de caracteres
		System.out.printf("O texto %s possui %d caracteres\n",curso, curso.length());
		
		//replace
		String semEspaco = curso.replace(" ", "");
		System.out.println(semEspaco);
		System.out.println(curso);
		System.out.println(curso.replace(" ", "").length());
		
		System.out.println(curso.contains("TranspoBrasil"));
		System.out.println(curso.startsWith("Curso"));
		System.out.println(curso.endsWith("Domingo"));
		
		System.out.println(curso.indexOf("TranspoBrasil"));
		System.out.println(curso.indexOf("a"));
		System.out.println(curso.indexOf("a", 10));
		System.out.println(curso.lastIndexOf("a"));
		
		//
		System.out.println(curso.toUpperCase());
		System.out.println(curso.toLowerCase());
		
		
		System.out.println(curso.substring(11));
		System.out.println(curso.substring(11,17));

		String palavra = "sábado";
		int indice= curso.toLowerCase().indexOf(palavra.toLowerCase());
		System.out.println(indice);
		
		
		System.out.println(curso.charAt(10));
		System.out.println(curso.charAt(11));
		System.out.println(curso.charAt(12));
		System.out.println(curso.charAt(13));
		System.out.println("========================");
		String user1 = "João";
		String user2 = "João";
		String user3 = new String("João");
		System.out.println(user1 == user2);
		System.out.println(user1 == user3);
		System.out.println(user1.equals(user2));
		System.out.println(user1.equals(user3));
		
		System.out.println(user1.equalsIgnoreCase("JOÃO"));
		System.out.println("joão".equalsIgnoreCase("JOÃO"));
		
		String texto = "    oi pessoal    ";
		String registro ="contato;contato@teste.com;33221100";
		
		System.out.printf(">%s< , length = %d\n",texto,texto.length());
		System.out.printf(">%s< , length = %d\n",texto.trim(), texto.trim().length());
		String[] valores = registro.split(";");
		System.out.println(valores[0]);
		System.out.println(valores[1]);
		System.out.println(valores[2]);
		
		
		
	}

}










