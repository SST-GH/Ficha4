package exer;

public class FrutaVolume extends Fruta implements Descontavel{
	//Fields
	private float volume = 0;
	
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
	
	public double setPercentagemDesconto() {
		return pagar()*Descontavel.descontar(0.2);
	}
	
	public double precoDepoisDesconto() {
		return pagar() - setPercentagemDesconto();
	}
	
}
