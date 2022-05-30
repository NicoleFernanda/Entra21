/*
Criar um vetor A com 10 elementos inteiros. Construir um vetor B demesmo tipo e tamanho, sendo que cada elemento do vetor B 
deveráser o respectivo elemento de A multiplicado por sua posição (ouíndice), ou seja:B[i] = A[i] * i.Construir um vetor C demesmo tipo e 
tamanho que A, sendo que cada elemento do vetor C deveráser o resto da divisão do respectivo elemento de A por 2 (dois), ouseja: 
C[i] := A[i] % 2. 
*/


package lista7;

import java.util.Scanner;

public class Exe02 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int vetorA[] = new int[10];
		int vetorB[] = new int[vetorA.length];
		int vetorC[] = new int[vetorA.length];
		
		System.out.println("VETOR A");
		for (int i = 0; i < vetorA.length; i++) {//A
			System.out.println("insira o elemento [" + (i + 1) + "] do vetor A");
			vetorA[i] = tec.nextInt();
		}
		
		System.out.println("\nVETOR B");
		for (int i = 0; i < vetorB.length; i++) {//B
			vetorB[i] = vetorA[i] * i;
			System.out.println("[" + (i + 1)+ "] - " + vetorB[i] + "    ( " + vetorA[i] + " x " + i + " )");
		}
		
		System.out.println("\nVETOR C");
		for (int i = 0;  i < vetorC.length; i ++) {
			vetorC[i] = vetorA[i] % 2;
			System.out.println("[" + (i + 1)+ "] - " + vetorC[i]+ "    ( " + vetorA[i] + " % 2 )");
		}
		
		tec.close();
	}

}



/*
import java.util.Scanner;
Scanner tec = new Scanner(System.in);
		
tec.close();

*/