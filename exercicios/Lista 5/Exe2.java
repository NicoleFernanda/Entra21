//Escreva um programa que receba como entrada um n�mero e exiba uma mensagem informando se ele � positivo, negativo ou neutro.

package lista5;
import java.util.Scanner;
public class Exe2 {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		
		double numero = t.nextDouble();
		
		if (numero > 0) {
			System.out.println("N�mero positivo");
		
		} else if (numero == 0) {
			System.out.println("N�mero neutro");

		} else { //numero < 0
			System.out.println("N�mero negativo");

		}
		
		
		t.close();
		
	}

}
