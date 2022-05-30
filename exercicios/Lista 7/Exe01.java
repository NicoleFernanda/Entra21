/*
Criar um vetor A com 15 elementos inteiros. Construir um vetor B demesmo tipo e tamanho, sendo que cada elemento do vetor B 
deverá ser o quadrado do respectivo elemento de A, ou seja:B[i] = A[i] * A[i].
*/


package lista7;

import java.util.Scanner;

public class Exe01 {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		
		int vetorA[] = new int [15];
		int vetorB[] = new int [vetorA.length];
		
		for (int i = 0; i < vetorB.length; i++) {
			System.out.println("insira o elemento [" + (i + 1) + "] do vetor A");
			vetorA[i] = t.nextInt();
		}
		
		for (int j = 0; j < vetorB.length; j++) {
			vetorB[j] = vetorA[j] * vetorA[j];
			System.out.println("["+(j + 1)+"]"+vetorB[j]);

		}
	
		t.close();
	}

}
