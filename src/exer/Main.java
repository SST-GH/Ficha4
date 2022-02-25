package exer;

public class Main {
	
	public static void main(String[] args) {
		
		//Criar as frutas
		FrutaPeso fruta1 = new FrutaPeso("laranja", 1.2, 2);
		FrutaUnidade fruta2 = new FrutaUnidade("pêra", 0.6, 5);
		FrutaVolume fruta3 = new FrutaVolume("tomate", 0.9, 10);
		
		//Criar o cesto
		Cesto cesto1 = new Cesto(1);
		
		//Guardar as frutas no cesto
		cesto1.guardarFrutas(fruta1);
		cesto1.guardarFrutas(fruta2);
		cesto1.guardarFrutas(fruta3);
		
	
		System.out.println("A quantidade de tipo de laranjas é de " + cesto1.numFrutaCesto("FrutaPeso"));
		System.out.println("A quantidade de tipo de pêras é de " + cesto1.numFrutaCesto("FrutaUnidade"));
		System.out.println("A quantidade de tipo de tomate é de " + cesto1.numFrutaCesto("FrutaVolume"));
		
		//Determinar se é pago em cartão ou moedas.
		fruta3.monetario();
		System.out.println("\n" + fruta3.isCartao());
		
		//Obter o nome e o preço pago pelas frutas
		System.out.println("\nA " + fruta1.getNome() + " teve um custo de " + fruta1.pagar() + "€");
		System.out.println("A " + fruta2.getNome() + " teve um custo de " + fruta2.pagar() + "€");
		System.out.println("O " + fruta3.getNome() + " teve um custo de " + fruta3.pagar() + "€");
		
		//Obter valor total da fruta no cesto
		cesto1.calValorTotalCesto();
		System.out.println("\nO valor total pago no cesto é de " + cesto1.calValorTotalCesto() + "€");
		
		
		//Obter o desconto e o novo preço depois do desconto
		System.out.println("\nA " + fruta1.getNome() +" tem um desconto de "+ fruta1.setPercentagemDesconto() + "€ " + " e o preço depois do desconto é " + fruta1.precoDepoisDesconto() + "€");
		System.out.println("A " + fruta3.getNome() +" tem um desconto de "+ fruta3.setPercentagemDesconto() + "€ " + " e o preço depois do desconto é " + fruta3.precoDepoisDesconto() + "€");
		
		
		
	}
}
