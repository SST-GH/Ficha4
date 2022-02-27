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
	public abstract double pagar();
	
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
	
	public void setNome() {
		this.nome = nome;
	}
	
	public boolean isCartao() {
		return cartao;
	}
	
	public void setCartao() {
		this.cartao = cartao;
	}
	
	public double getPrecoBase() {
		return precoBase;
	}
	
	public void setPrecoBase() {
		this.precoBase = precoBase;
	}
	
	@Override
	public String toString() {
		return "Fruta {" + "nome: " + nome + ", precoBase: " + precoBase + '}';
	}
}
