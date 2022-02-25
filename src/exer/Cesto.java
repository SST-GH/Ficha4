package exer;

import java.util.ArrayList;
import java.util.List;

public class Cesto {
	//Fields
	private int totalItems;		//Varia
	private int capacidadeMax;	//Const
	private List<Fruta>frutas;
	
	//Construtor
	public Cesto(int aTotalItems) {
		totalItems = aTotalItems;
		frutas = new ArrayList<Fruta>();
	}
	
	//Métodos
	public void guardarFrutas(Fruta auxFruta) {
		frutas.add(auxFruta);
		totalItems++;
	}
	
	public double calValorTotalCesto() {
		double valorTotal = 0;
		for(Fruta aux: frutas) {
			valorTotal += aux.pagar();
		}
		return valorTotal;
		
	}
	
	public int numFrutaCesto(String aTipoFruta) {	//Quantidade de cada tipo de fruta
		int numTotal = 0;
		for(Fruta aux: frutas) {
			if(aux != null)
				numTotal++;
		}
		return numTotal;
	
	}
	
	
	
	
	
	
	
	

}
