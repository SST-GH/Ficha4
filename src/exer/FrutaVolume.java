package exer;

public class FrutaVolume extends Fruta{
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
	
	public double pagar() {
		return super.pagar()*volume;
	}
}
