package br.com.cursojava;

public class Automovel extends Veiculo {
	
	{
		System.out.println("Bloco no Automóvel");
	}

	public Automovel() {
		super((Integer)null);
	}
	
	public String retornarMarca(){
		return super.getMarca();
	}
	
	public String getMarca(){
		return "marca sobrescrita";
	}

}
