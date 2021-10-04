package model;
import cervejasArtesanais.MetodCerveja;

// Aplicado o primeiro princípio do SOLID(Princípio da responsabilidade única), onde a única responsabilidade
// é realizar a instância do tipo da cerveja.

// Aplicado o quinto princípio do SOLID(Princípio da inversão da dependência), onde o método produzirCerveja não tem a mínima ideia de 
//qual classe será intanciada.

public class Cervejaria{
	
	private MetodCerveja cerveja;
	
	public void produzirCerveja() {	
		//instanciando o tipo da cerveja
		FactoryCerveja factory = new FactoryCerveja(null, false, null, 0);
		cerveja = factory.criarCerveja(null);
		
	}
}
