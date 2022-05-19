/*
Escreva um programa para mostrar os númerosentre 1000 e 2000 que quando divididos por 11 dão resto igual a 5.
*/
package lista6;

import java.util.Scanner;

public class Exe03 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		for (int i = 1000; i<= 2000; i++) {
			if (i % 11 == 5) {
				System.out.println(i);
			} 
			
		}
		
		
		tec.close();
	}

}
