package exerccios;

import java.util.Scanner;

public class AppAnimal {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		CadastroAnimais cadastro = new CadastroAnimais();
		cadastro.mostrarMenu(teclado);
		teclado.close();
	}

}
