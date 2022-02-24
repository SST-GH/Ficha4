package exer;

public abstract class Fruta {
	
	private String nome = "";
	private double precoBase;
	private boolean cartao = true;
	
	//Construtores
	public Fruta(String aNome, double aPrecoBase, boolean aCartao) {
		nome = aNome;
		precoBase = aPrecoBase;
		cartao = aCartao;
	}
	
	//Métodos
	public double pagar() {
		return precoBase;
	}
	
	public void cartao() {
		cartao = true;
	}
	
	public void monetario() {
		cartao = false;
	}
	
	//Getters e Setters
	public String getNome() {
		return nome;
	}
	
	public boolean isCartao() {
		return cartao;
	}
}
