package exer;

public class FrutaVolume extends Fruta implements Descontavel{
	//Fields
	private float volume = 0;
	private float desconto;
	
	//Construtor
	public FrutaVolume(String aNome, double aPrecoBase, float aVolume) {
		super(aNome, aPrecoBase, true);
		volume = aVolume;
	}
	
	//Métodos
	public float volume() {
		return volume;
	}
	
	@Override
	public double pagar() {		//Override pq cada funcão vai ter especificidades próprias
		return getPrecoBase()*volume;
	}
	
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
