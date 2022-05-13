package lista5;

import java.util.Scanner;

public class Exe4 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Insira o código de seu produto:");
		byte codigo = tec.nextByte();
		
		if (codigo == 1) {
			System.out.println("Alimento nao-perecivel");

		} else if (codigo == 2 || codigo == 3 || codigo == 4) {
			System.out.println("Alimento perecivel");

		} else if (codigo == 6 || codigo == 5) {
			System.out.println("Vestuario");

		} else if (codigo == 7) {
			System.out.println("Higiene Pessoal");

		} else if (codigo == 8 || codigo == 9 || codigo == 10 || codigo == 11 || codigo == 12 || codigo == 13 || codigo == 14 || codigo == 15) {
			System.out.println("Limpeza e ultensilios domesticos");

		} else {
			System.out.println("Inválido");
		}
		
		tec.close();
	}
}
