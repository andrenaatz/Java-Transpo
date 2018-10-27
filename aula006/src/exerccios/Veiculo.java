package exerccios;

public class Veiculo {

	private int velocidadeAtual;
	private boolean ligado;
	
	public void acelerar(int valor){
		if(ligado){
			this.velocidadeAtual+= valor;
		}
	}
	public void parar(){
		this.velocidadeAtual = 0;
	}
	public void ligar(){
		ligado = true;
	}
	
	public void desligar(){
		ligado = false;
	}
	
	
}
