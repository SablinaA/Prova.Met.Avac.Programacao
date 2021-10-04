package model;

import cervejasArtesanais.CerejaComAmendoas;
import cervejasArtesanais.Lagger;
import cervejasArtesanais.Laranja;
import cervejasArtesanais.MetodCerveja;
import cervejasArtesanais.Pilsen;
import cervejasArtesanais.PuroMalte;
import cervejasArtesanais.Trigo;

// Aplicado o primeiro princípio do SOLID(Princípio da responsabilidade única), sendo a única responsabilidade da classe
// fazer a verificação 

// Aplicado o segundo principio do SOLID(Princípio Aberto-Fechado), a classe FactoryCerveja estende da classe Cerveja(

public class FactoryCerveja extends Cerveja {


	public FactoryCerveja(String codigo, boolean alcool, String dataProducao, float preco) {
		super(codigo, alcool, dataProducao, preco);
		// TODO Auto-generated constructor stub
	}

	public MetodCerveja criarCerveja(String codigo) {

		MetodCerveja cerveja = null;
		
		//realizando a verificação do tipo da cerveja e instânciando
		
		if(codigo == "cereja com amendoas" || codigo =="c167453") {
			cerveja = new CerejaComAmendoas(codigo, isAlcool(), getDataProducao(), getPreco());			
		
		}else if(codigo == "laranja" || codigo =="l548516") {
			cerveja = new Laranja(codigo, isAlcool(), getDataProducao(), getPreco());
		
		}else if(codigo == "lagger" || codigo =="lg82136") {
			cerveja = new Lagger (codigo, isAlcool(), getDataProducao(), getPreco());
		
		}else if(codigo == "pilsen" || codigo == "p541754") {
			cerveja = new Pilsen(codigo, isAlcool(), getDataProducao(), getPreco());
		
		}else if(codigo == "puro malte" || codigo == "pm74123") {
			cerveja = new PuroMalte(codigo, isAlcool(), getDataProducao(), getPreco());
		
		} else if(codigo == "trigo" || codigo == "t852469") {
			cerveja = new Trigo(codigo, isAlcool(), getDataProducao(), getPreco());
			
		}else {System.out.print("\nO código é iválido"); }
		
		return cerveja;		

}
}
		