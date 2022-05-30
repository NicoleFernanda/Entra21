package lista7;

import java.util.Scanner;

public class Exe13 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int vetorA [] = new int[10];
		int vetorB [] = new int[vetorA.length];
		int ultimo = vetorA.length - 1;
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("insira o elemento   [" + (i + 1) + "]");
			vetorA[i] = tec.nextInt();
		}
		
		for (int i = 0; i < vetorB.length; i++) {
			vetorB[i] = vetorA[ultimo];
			ultimo--;
			System.out.print(vetorB[i] + " ; ");
		}
		
		tec.close();
	}

}
