package exer;

public class FrutaVolume extends Fruta{
	//Fields
	private int volume = 0;
	
	//Construtor
	public FrutaVolume(String aNome, double aPrecoBase, int aVolume) {
		super(aNome, aPrecoBase, true);
		volume = aVolume;
	}
	
	//Métodos
	public int volume() {
		return volume;
	}
	
	public double pagar() {
		return super.pagar()*volume;
	}
}
