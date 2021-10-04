package cervejasArtesanais;

import java.text.ParseException;
import model.Validade;


// Aplicado o segundo princípio do SOLID (Princípio Aberto-Fechado), a classe CerejaComAmendoas estende da classe Validade.
// Aplicado o quarto princípio do SOLID (Princípio da Segregação da Interface), interface MetodCerveja é implementada na classe CerejaComAmendoas.
public class CerejaComAmendoas extends Validade implements MetodCerveja {

	public CerejaComAmendoas(String codigo, boolean alcool, String dataProducao, float preco) {
		super(codigo, alcool, dataProducao, preco);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public String saborCerveja() {
			
		 if (isAlcool() == true){	
				System.out.println("\nCriando cerveja com álcool, sabor cereja com amêndoas:");
			} else {
				System.out.println("\nCriando cerveja sem álcool, sabor cereja com amêndoas:");
			}
		return "";		
		
	}
		
	public String toString() {
			try {
				codigo = "\tData de fabricação: " +this.getDataProducao()+
						"\n\tNome/Código: " +this.codigo +saborCerveja()+
						 gerarValidade()+
						"\n\tPreço:" +this.getPreco();
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
			return codigo;}

}
