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
	
	@Override
	public double pagar() {
		return getPrecoBase()*peso;
	}
}
