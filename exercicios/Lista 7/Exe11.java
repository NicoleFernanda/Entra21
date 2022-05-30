package lista7;

import java.util.Scanner;

public class Exe11 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int vetor[] = new int[10];
		int compara[] = new int[vetor.length];
		int c = vetor.length - 1;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("elemento   [" + (i + 1)+"]");
			vetor[i] = tec.nextInt();
			compara[c] = vetor[i];
			c--;
		}
		
		c = 0;
		int soma = 0;

		for (int i = 0; i < compara.length; i++) {
			
			

			if (vetor[i] == compara[c]) {
				soma++;
			}
			
			c++;
		}
		
		if (soma == 10) {
			System.out.println("o vetor eh palindromo");
		} else {
			System.out.println("o vetor NAO eh palindromo");
		}
		
		
		
		tec.close();
	}
}
