package model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

// Aplicado o primeiro princ�pio do SOLID(Princ�pio da responsabilidade �nica), gerar uma validade a partir a data
// de fabrica��o da cerveja

// Aplicado o segundo princ�pio do SOLID(Princ�pio Aberto-Fechado), a classe Validade estende da classe Cerveja(classe m�e).

//Aplicado o quarto princ�pio do SOLID(Princ�pio da substitui��o de Liskov) essa classe pode ser substitu�da pela classe m�e.

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

	
