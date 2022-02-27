package exer;

public class Main {
	
	public static void main(String[] args) {
		
		//Criar as frutas
		FrutaPeso fruta1 = new FrutaPeso("laranja", 1.2, 2);
		FrutaUnidade fruta2 = new FrutaUnidade("pêra", 0.6, 5);
		FrutaVolume fruta3 = new FrutaVolume("tomate", 0.9, 10);
		
		//Obter o nome e o preço pago pelas frutas
		System.out.println("A " + fruta1.getNome() + " teve um custo de " + fruta1.pagar() + "€");
		System.out.println("A " + fruta2.getNome() + " teve um custo de " + fruta2.pagar() + "€");
		System.out.println("O " + fruta3.getNome() + " teve um custo de " + fruta3.pagar() + "€");

		//Criar o cesto
		Cesto cesto1 = new Cesto(1);
		
		//Inserir frutas no cesto
		cesto1.guardarFrutas(fruta1);
		cesto1.guardarFrutas(fruta2);
		cesto1.guardarFrutas(fruta3);
		
		//Obter valor total da fruta no cesto
		System.out.println("\nO valor total pago no cesto é de " + cesto1.calValorTotalCesto() + "€");
		
		//Determinar se é pago em cartão ou valor monetário.
		fruta3.monetario();
		System.out.println("\nFoi pago por catão? " + fruta3.isCartao());

		System.out.println("\nA quantidade do tipo FrutaPeso é " + cesto1.numFrutaTipo("FrutaPeso") + ", com valor de " + fruta1.pagar() + "€");
		System.out.println("A quantidade de tipo FrutaUnidade é " + cesto1.numFrutaTipo("FrutaUnidade") + ", com valor de " + fruta2.pagar() + "€");
		System.out.println("A quantidade de tipo FrutaVolume é " + cesto1.numFrutaTipo("FrutaVolume") + ", com valor de " + fruta3.pagar() + "€");
		
		
		//Obter o desconto e o novo preço depois do desconto
		fruta1.setPercentagemDesconto(0.1);
		System.out.println("\nValor a pagar depois do desconto: " + fruta1.pagar() + "€");
		
		fruta3.setPercentagemDesconto(0.3);
		System.out.println("\nValor a pagar depois do desconto: " + fruta3.pagar() + "€");
		
		
//		System.out.println(fruta1.toString());
		
	}
}
