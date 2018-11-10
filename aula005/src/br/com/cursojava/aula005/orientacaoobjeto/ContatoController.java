package br.com.cursojava.aula005.orientacaoobjeto;

public class ContatoController {
	
	Contato[] contatos = new Contato[50];
	
	int quantidade = 0;
	public void criarContato(String nome, String email, String telefone) {
		if(contatos.length > quantidade){
			Contato novoContato = new Contato();
			novoContato.nome = nome;
			novoContato.email = email;
			novoContato.telefone = telefone;
			contatos[quantidade++] = novoContato;
		}else{
			System.out.println("Limite de contatos ultrapassado!!!");
		}
	}

	public int contarContatos() {
		return quantidade;
	}

	public Contato buscarContato(int index) {
		if(index > -1 && index <= quantidade){
			return contatos[index];
		}
		return null;
	}

}








