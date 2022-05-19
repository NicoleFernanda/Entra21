package lista6;

import java.util.Scanner;

public class Exe01 {
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int soma = 0, multiplicacao = 1;
	
	for (int i = 1;i >= 1; i++) {
			System.out.println("insira um numero inteiro positivo (parar = -1): ");
			int numero = teclado.nextInt();
			
			if (numero == -1) {break;}
			else if (numero % 2 == 0) {soma += numero;}
			else if (numero % 2 != 0 ) {multiplicacao *= numero;}
			
			
		}
		
		System.out.println("soma dos numeros pares = " + soma);
		System.out.println("multiplicacao dos numeros impares = " + multiplicacao);
		
	teclado.close();
	}

}
