package exer;

public class FrutaUnidade extends Fruta {
	//Fields
	private int unidade = 0;
	
	//Construtor
	public FrutaUnidade(String aNome, double aPrecoBase, int aUnidade) {
		super(aNome, aPrecoBase, true);
		unidade = aUnidade;
	}
	
	//Métodos
	public int unidade() {
		return unidade;
	}
	
	@Override
	public double pagar() {		//Override pq cada funcão vai ter especificidades próprias
		return getPrecoBase()*unidade;
	}
}
