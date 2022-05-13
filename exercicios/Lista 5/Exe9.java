package lista5;

import java.util.Scanner;

public class Exe9 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		byte unidades = 0;
		System.out.println("Fruto: ");
		String fruta = teclado.next();
		fruta = fruta.toLowerCase();
		System.out.println("Preço unitario do fruto: ");
		double preco = teclado.nextDouble();
		
		if (fruta.equals("laranja")) {
			System.out.println("Laranja");
			unidades = 60;
			
		} else if (fruta.equals("limao") || fruta.equals("limão")) {
			System.out.println("Limão");
			unidades = 80;
		
		} else if (fruta.equals("morango")) {
			System.out.println("Morango");
			unidades = 20;
		}
		
		double valor = unidades * preco;
		System.out.println("Total a pagar sera R$: " + valor);
		
		teclado.close();
	}

}
