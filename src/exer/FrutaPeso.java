package exer;

public class FrutaPeso extends Fruta{
	//Fields
	private float peso = 0;
	
	//Construtor
	public FrutaPeso(String aNome, double aPrecoBase, float aPeso) {
		super(aNome, aPrecoBase, true);
		peso = aPeso;
	}
	
	//Métodos
	public float peso() {
		return peso;
	}
	
	public double pagar() {
		return super.pagar()*peso;
	}
}
