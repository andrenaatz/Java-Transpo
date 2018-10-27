package exerccios;

import exerccios.base.Cachorro;
import exerccios.base.Voador;

public class CachorroVoador extends Cachorro implements Voador {

	@Override
	public void voar() {
		System.out.println("Cachorro Voador Voando...");
		
	}

}
