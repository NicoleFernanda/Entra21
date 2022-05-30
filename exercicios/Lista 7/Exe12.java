package lista7;

import java.util.Scanner;

public class Exe12 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int vetor[] = new int[10];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("elemento   [" +(i + 1) + "]");
			vetor[i] = tec.nextInt();
			
			if (!(vetor[i] % 2 == 0)) {
				System.out.print("elemento impar");
				break;
			}
		}
		
		tec.close();
	}

}
