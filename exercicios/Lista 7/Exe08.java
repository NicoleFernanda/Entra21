package lista7;

import java.util.Scanner;

public class Exe08 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int vetor[] = new int[10];
		int inferiores = 0, superiores = 0;
		byte quant = 0;
		byte maiores = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("insira o elemento [" + (i + 1)+"]");
			vetor[i] = tec.nextInt();
			if (vetor[i] < 15) {
				inferiores = inferiores + vetor[i];
			} else if (vetor[i] == 15) {
				quant++;
			} else if (vetor[i] > 15) {
				superiores += vetor[i];
				maiores++;
			}
		}
		
		float media = superiores / maiores;
		System.out.println("soma de elementos armazenados nestevetor que são inferiores a 15 = " + inferiores);
		System.out.println("quantidade de elementosarmazenados no vetor que são iguais a 15 = " + quant);
		System.out.println("média dos elementos armazenados no vetor que são superiores a 15 = " + media);
		tec.close();
	}
}
