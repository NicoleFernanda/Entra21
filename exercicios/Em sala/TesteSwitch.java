package sala;

import java.util.Scanner;

public class TesteSwitch {
	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		System.out.println("Digite o dia da semana de 1 a 7:");
		byte dia = tec.nextByte();
		
		switch (dia) {
		case 2:
			System.out.println("Segunda-feira");
			
			break;
		case 3:
			System.out.println("Terça-feira");

			break;
		case 4:
			System.out.println("Quarta-feira");

			break;
		case 5:
			System.out.println("Quinta-feira");

			break;
		case 6:
			System.out.println("Sexta-feira");

			break;
		case 7:
			System.out.println("Sábado");

			break;
		case 1:
			System.out.println("Domingo");

			break;
		default:
			System.out.println("Numero nao valido");
			break;
		}
		
		
		tec.close();
		
	}

}
