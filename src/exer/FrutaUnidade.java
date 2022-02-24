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
	
	public double pagar() {
		return super.pagar()*unidade;
	}
}
