package lista6;

import java.util.Scanner;

public class Exe13 {
	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		int i = 1;
		int numero;
		int maior = 0;
		
		while (i >= 1) {
			System.out.println("um numero inteiro positivo:     ["+i+"]   (parar = -1)");
			numero = tec.nextInt();
			
			if (numero == -1) {
				System.out.println("maior numero digitado = " + maior); 
				break;
			} 
			
			if (i == 1) {
				maior = numero;
			} else if (numero > maior) {
				maior = numero;
			}
			
			
			i++;
		}
		
		
		
		tec.close();
	}
}
