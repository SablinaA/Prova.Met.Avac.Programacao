package view;

import cervejasArtesanais.MetodCerveja;
import model.FactoryCerveja;

//Aplicado o primeiro conceito de SOLID(Princípio da responsabilidade única), a classe CriarCerveja é apenas para criar o objeto
//da classe que está sendo instânciada

public class CriarCerveja {
	
	public static void main(String[] args) {
		
		FactoryCerveja factory = new FactoryCerveja("c167453", false, "30/09/2021", 20);
		MetodCerveja cerveja = factory.criarCerveja("cereja com amendoas");
		System.out.println(cerveja);
		
		FactoryCerveja factory1 = new FactoryCerveja("l548516", true, "01/10/2021", 10);
		MetodCerveja cervejaLaranja = factory1.criarCerveja("laranja");
		System.out.println(cervejaLaranja);
		
		FactoryCerveja factory2 = new FactoryCerveja("t852469", true, "02/10/2021", 22);
		MetodCerveja cervejaTrigo = factory2.criarCerveja("trigo");
		System.out.println(cervejaTrigo);
		
		FactoryCerveja factory3 = new FactoryCerveja("pm74123", false, "03/10/2021", 15);
		MetodCerveja cervejaPuroMalte = factory3.criarCerveja("puro malte");
		System.out.println(cervejaPuroMalte);
		
		FactoryCerveja factory4 = new FactoryCerveja("p541754", false, "03/10/2021", 15);
		MetodCerveja cervejaPilsen = factory4.criarCerveja("pilsen");
		System.out.println(cervejaPilsen);
		
		FactoryCerveja factory5 = new FactoryCerveja("p541754", true, "04/10/2021", 28);
		MetodCerveja cervejaLagger = factory5.criarCerveja("lagger");
		System.out.println(cervejaLagger);
		
		
		

}
	}	
    
	