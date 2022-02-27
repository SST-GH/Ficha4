package exer;

public class FrutaPeso extends Fruta implements Descontavel{
	//Fields
	private float peso = 0;
	private float desconto;
	
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
	public double pagar() {		//Override pq cada funcão vai ter especificidades próprias
		return ((getPrecoBase()*(1-desconto))*peso);
	}
	
	@Override
	public double descontar(double percentagem) {
		return percentagem;
	}
	
	
	public double setPercentagemDesconto() {
		return desconto;
	}
}
