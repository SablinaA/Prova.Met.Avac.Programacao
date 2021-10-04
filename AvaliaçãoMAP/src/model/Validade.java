package model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

// Aplicado o primeiro princípio do SOLID(Princípio da responsabilidade única), gerar uma validade a partir a data
// de fabricação da cerveja

// Aplicado o segundo princípio do SOLID(Princípio Aberto-Fechado), a classe Validade estende da classe Cerveja(classe mãe).

//Aplicado o quarto princípio do SOLID(Princípio da substituição de Liskov) essa classe pode ser substituída pela classe mãe.

public class Validade extends Cerveja  {
	
	public Validade(String codigo, boolean alcool, String dataProducao, float preco) {
		super(codigo, alcool, dataProducao, preco);
		// TODO Auto-generated constructor stub
	}

	public String gerarValidade() throws ParseException{
		
		 DateFormat df = new SimpleDateFormat ("dd/MM/yyyy");
	     java.util.Date data = df.parse (dataProducao);
	     Calendar calendario = Calendar.getInstance();
	     calendario.setTime (data);
	     Calendar cal = calendario;
	     cal.add (Calendar.YEAR, 1); 
	     System.out.println ("\tValidade: "+df.format (cal.getTime()));
			return "";
		  }

		
 }

	
