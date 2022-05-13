package lista5;

import java.util.Scanner;

public class Exe13 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Escolha tres valores inteiros para formarem um triangulo");
		int a = tec.nextInt(),b = tec.nextInt(),c = tec.nextInt();
		
		if (a + b > c && c + a > b && c + b > a) { //é triangulo
			if (a == b && a == c) {
				System.out.println("equilatero");
				
			} else if (a == b || a == c || b == c) {
				System.out.println("isoceles");
		
			} else if (a != b && b != c && c != a) {
				System.out.println("escaleno");
			
			}
			
		
		} else {
			System.out.println("tais valores nao formam um triangulo");
			
		}
		
		
		
		tec.close();
	}

}
