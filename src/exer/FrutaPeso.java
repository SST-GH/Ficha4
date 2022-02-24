package exer;

public class FrutaPeso extends Fruta{
	//Fields
	private double peso = 0;
	
	//Construtor
	public FrutaPeso(String aNome, double aPrecoBase, double aPeso) {
		super(aNome, aPrecoBase, true);
		peso = aPeso;
	}
	
	//Métodos
	public double peso() {
		return peso;
	}
	
	public double pagar() {
		return super.pagar()*peso;
	}
}
