package lista5;

import java.util.Scanner;

public class Exe14 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("seu saldo medio do ultimo ano: ");
		double saldo = tec.nextDouble();

		
		System.out.println("Valor medio do saldo anual = " + saldo);
		
		if (saldo >= 0 && saldo <= 200) {
			System.out.println("nenhum credito");
		} else if (saldo > 200 && saldo <= 400) {
			System.out.println("20% do valor do saldo medio");
		}else if (saldo > 400 && saldo <= 600) {
			System.out.println("30% do valor do saldo medio");
		}else if (saldo > 600) {
			System.out.println("40% do valor do saldo medio");
		}



		
		
		tec.close();
	
	}
}
