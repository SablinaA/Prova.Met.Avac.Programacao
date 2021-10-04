package model;

// Aplicado o primeiro princípio do SOLID (Princípio da responsabilidade única), esta é a classe mãe.

public class Cerveja {
	// Attributes
	protected String codigo;
	String dataProducao;
	private float preco;
	private boolean alcool;
	
	
	//Constructor
	public Cerveja(String codigo, boolean alcool, String dataProducao, float preco) {
		this.codigo = codigo;
		this.alcool = alcool;
		this.dataProducao = dataProducao;
		this.preco = preco;
	}
	
	
	//get and setter 
	
	public String getDataProducao() {
		return dataProducao;
	}
	public void setDataProducao(String dataProducao) {
		this.dataProducao = dataProducao;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public String getCodigo() {
		return codigo;
	}
	public String setCodigo(String codigo) {
		return this.codigo = codigo;
	}

	public boolean isAlcool() {
		return alcool;
	}

	public void setAlcool(boolean alcool) {
		this.alcool = alcool;
	}

}
