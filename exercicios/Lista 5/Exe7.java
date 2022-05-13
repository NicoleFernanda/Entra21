package lista5;

import java.util.Scanner;

public class Exe7 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Valor  do produto comprado: ");
		double valor = teclado.nextDouble();
		System.out.println("Forma de pagamento: ");
		char pagamento = teclado.next().charAt(0);
		pagamento= Character.toUpperCase(pagamento);
		//System.out.println(pagamento);
		double promo = 0;
		
		if (valor >= 100 && pagamento == 'D') {
			promo = valor - (valor * 0.1); //desconto
			System.out.println("O valor total da sua compra sera R$: " + promo);
		} else {
			System.out.println("O valor total da sua compra sera R$: " + valor);
		}
		
		
		teclado.close();
	}
}
