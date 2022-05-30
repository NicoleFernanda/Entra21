package lista7;

import java.util.Scanner;

public class Exe16 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int vetor[] = new int[20];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("elemento ["+ (i) + "]");
			vetor[i] = tec.nextInt();
		}
		
		for (int i = 0; i < vetor.length; i++) {
			if (!(vetor[i] <= 0)) {
				System.out.println("[" +(i)+ "]" + vetor[i]);
			}
		}
		
		tec.close();
	}

}
