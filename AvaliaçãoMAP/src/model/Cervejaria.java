package model;
import cervejasArtesanais.MetodCerveja;

// Aplicado o primeiro princ�pio do SOLID(Princ�pio da responsabilidade �nica), onde a �nica responsabilidade
// � realizar a inst�ncia do tipo da cerveja.

// Aplicado o quinto princ�pio do SOLID(Princ�pio da invers�o da depend�ncia), onde o m�todo produzirCerveja n�o tem a m�nima ideia de 
//qual classe ser� intanciada.

public class Cervejaria{
	
	private MetodCerveja cerveja;
	
	public void produzirCerveja() {	
		//instanciando o tipo da cerveja
		FactoryCerveja factory = new FactoryCerveja(null, false, null, 0);
		cerveja = factory.criarCerveja(null);
		
	}
}
