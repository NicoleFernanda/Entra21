package lista5;

import java.util.Scanner;

public class Exe8 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Combustivel escolhido (Gasolina, Etanol ou Diesel): ");
		char combus = teclado.next().charAt(0);
		combus = Character.toUpperCase(combus);
		
		System.out.println("Quantidade de litros que deseja abastecer: ");
		double litros = teclado.nextDouble();
		double pag = 0;
		
		if (combus == 'E') {
			pag = litros * 2.09;
				 System.out.println("Total a pagar: R$:" + pag);
				 
				 if (combus == 'E' && litros > 30) {
				 System.out.println("Ganhou troca de óleo");
				 } else {
					 System.out.println("Não ganhou troca de óleo");
				 }
			
			
		} else if (combus == 'D') {
			pag = litros * 1.92;
			System.out.println("Total a pagar: R$:" + pag);
			System.out.println("Não ganhou troca de óleo");
			
		} else if (combus == 'G') {
			pag = litros * 2.53;
			System.out.println("Total a pagar: R$:" + pag);
			System.out.println("Não ganhou troca de óleo");
			
		} else {
			System.out.println("Escolha inválida");
			}

		
		teclado.close();
	}

}
