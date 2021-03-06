package exer;

public class FrutaVolume extends Fruta implements Descontavel{
	//Fields
	private float volume = 0;
	private double desconto;
	
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
		return ((getPrecoBase()*(1-desconto))*volume);
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
