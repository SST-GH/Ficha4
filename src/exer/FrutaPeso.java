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
		return (getPrecoBase()*peso);
	}
	
	@Override
	public double descontar(double percentagem) {
		return pagar()*percentagem;
	}
	
	
	public double setPercentagemDesconto() {
		return desconto;
	}
	
	public double precoDepoisDesconto() {
		return pagar() - setPercentagemDesconto();
	}
}
