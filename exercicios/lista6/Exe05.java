/*
 Faça um programa que o usuário informa um número e o programa verifica se ele é um número triangular.
 Obs.: Um número é triangular quando o resultado do produto de três números consecutivos.Exemplo: 24 = 2 x 3 x 4.
 */

package lista6;

import java.util.Scanner;

public class Exe05 {
	public static void main(String[] args) {
	Scanner tec = new Scanner(System.in);
	
	int numero = 1, entrada = 0, numerodois, numerotres, multi;
	for (int i = 1; i >= 1; i++) {
		
		if (i == 1) {
			System.out.println("entre com um numero");
			entrada = tec.nextInt();
		}
		
        numerodois = numero + 1;
        numerotres = numerodois + 1;
		multi = numero * numerodois * numerotres;

        if (entrada == multi) {
			System.out.println(entrada + " = " + numero + " X " + numerodois + " X " + numerotres);
			break;
		} else {i++; numero++;}
	
	}
	tec.close();
	}
}