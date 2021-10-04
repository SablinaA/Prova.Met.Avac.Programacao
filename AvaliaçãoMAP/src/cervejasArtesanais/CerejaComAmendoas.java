package cervejasArtesanais;

import java.text.ParseException;
import model.Validade;


// Aplicado o segundo princ�pio do SOLID (Princ�pio Aberto-Fechado), a classe CerejaComAmendoas estende da classe Validade.
// Aplicado o quarto princ�pio do SOLID (Princ�pio da Segrega��o da Interface), interface MetodCerveja � implementada na classe CerejaComAmendoas.
public class CerejaComAmendoas extends Validade implements MetodCerveja {

	public CerejaComAmendoas(String codigo, boolean alcool, String dataProducao, float preco) {
		super(codigo, alcool, dataProducao, preco);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public String saborCerveja() {
			
		 if (isAlcool() == true){	
				System.out.println("\nCriando cerveja com �lcool, sabor cereja com am�ndoas:");
			} else {
				System.out.println("\nCriando cerveja sem �lcool, sabor cereja com am�ndoas:");
			}
		return "";		
		
	}
		
	public String toString() {
			try {
				codigo = "\tData de fabrica��o: " +this.getDataProducao()+
						"\n\tNome/C�digo: " +this.codigo +saborCerveja()+
						 gerarValidade()+
						"\n\tPre�o:" +this.getPreco();
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
			return codigo;}

}
