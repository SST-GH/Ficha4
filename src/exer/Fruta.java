package exer;

public abstract class Fruta {
	
	private String nome = "";
	private double precoBase;
	
	//Construtores
	public Fruta(String aNome, double aPrecoBase) {
		this.nome = aNome;
		this.precoBase = aPrecoBase;
	}
	
	//Métodos
	public double pagar() {
		double peso =0;
		return precoBase*peso;
	}
	
	public String metodoPagamento() {
		return ;
	
	}

}
