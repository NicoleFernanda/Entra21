package lista7;

import java.util.Scanner;

public class Exe06 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int vetor[] = new int[10];
		int quant = 0;
		int soma = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("elemento [" + (i + 1)+ "] do vetor [" + i + "]");
			vetor[i] = tec.nextInt();
			if (!(vetor[i] % 2 == 0)) {
				soma = soma + vetor[i];
				quant++;
			}
		}
			
		float media = (float) soma / quant;
		System.out.println("media dos numeros impares = " + media);
		
		tec.close();
	}
}
