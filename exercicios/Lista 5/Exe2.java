//Escreva um programa que receba como entrada um número e exiba uma mensagem informando se ele é positivo, negativo ou neutro.

package lista5;
import java.util.Scanner;
public class Exe2 {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		
		double numero = t.nextDouble();
		
		if (numero > 0) {
			System.out.println("Número positivo");
		
		} else if (numero == 0) {
			System.out.println("Número neutro");

		} else { //numero < 0
			System.out.println("Número negativo");

		}
		
		
		t.close();
		
	}

}
