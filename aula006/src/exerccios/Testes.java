package exerccios;

public class Testes {

	public static void main(String[] args) {
		
		Veiculo v1 = new Veiculo();
		Veiculo v2 = new Carro();
		Aviao av = new Aviao();
		Veiculo v3 = av;
		
		v3.ligar();
		v3.acelerar(10);
		v3.parar();
		v3.desligar();
		
		av.ligar();
		av.acelerar(10);
		av.voar();
		av.parar();
		av.desligar();
		
		
		if(v3 instanceof Aviao){
			((Aviao) v3).voar();
			Aviao a = (Aviao)v3;
			a.voar();
		}
		
		
		
		
	}
}








