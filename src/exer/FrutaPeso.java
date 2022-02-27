package exer;

public class FrutaPeso extends Fruta implements Descontavel{
	//Fields
	private float peso = 0;
	private double desconto;
	
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
		return ((getPrecoBase()*(1-desconto)*peso));
	}
	
	@Override
	public double descontar(double percentagem) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public double setPercentagemDesconto(double aDesconto) {
		return desconto = aDesconto;
	}

	
	
	
}
