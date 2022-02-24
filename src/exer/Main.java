package exer;

public class Main {
	
	public static void main(String[] args) {
		
		var fruta1 = new FrutaPeso("laranja", 1.2, 2);
		var fruta2 = new FrutaUnidade("pêra", 0.6, 5);
		var fruta3 = new FrutaVolume("tomate", 0.9, 10);
		
		fruta3.monetario();
		System.out.println(fruta3.isCartao());
		
		System.out.println(fruta1.getNome() + " " + fruta1.pagar() + "€");
		System.out.println(fruta2.getNome() + " " + fruta2.pagar());
		System.out.println(fruta3.getNome() + " " + fruta3.pagar());
		
	}
}
