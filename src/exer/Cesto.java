package exer;

import java.util.ArrayList;
import java.util.List;

public class Cesto {
	//Fields
	private int totalItems;		//Varia
	private int capacidadeMax = 100;	//Const
	private List<Fruta>frutas;
	
	//Construtor
	public Cesto(int aTotalItems) {
		totalItems = aTotalItems;
		frutas = new ArrayList<Fruta>();
	}
	
	//Métodos
	
	//Adicionar as frutas no cesto
	public void guardarFrutas(Fruta auxFruta) {
		frutas.add(auxFruta);
		totalItems++;
	}
	
	//Calcular o valor total a pagar pelas frutas no cesto
	public double calValorTotalCesto() {
		double valorTotal = 0;
		for(Fruta aux: frutas) {
			valorTotal += aux.pagar();
		}
		return valorTotal;
		
	}
	
	//Obter quantidade de cada tipo de fruta.
	public int numFrutaCesto(String aTipoFruta) {
		int numTotal = 0;
		for(Fruta aux: frutas) {
			if(aux.getClass().getSimpleName().equals(aTipoFruta))
				numTotal++;
		}
		return numTotal;
	}
}
