package lista7;

import java.util.Scanner;

public class Exe10 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		float nota1[] = new float[10];
		float nota2[] = new float[10];
		float result[] = new float[10];
		
		for (int i = 0; i < nota2.length; i++) {
			System.out.println("\nnota 1 do aluno [" + (i + 1) + "]");
			nota1[i] = tec.nextFloat();
			System.out.println("\nnota 2 do aluno [" + (i + 1) + "]");
			nota2[i] = tec.nextFloat();
			
			result[i] = (nota2[i] + nota1[i])/2;
			if (result[i] >= 7) {
				System.out.println("\nAPROVADO");
			} else {
				System.out.println("\nREPROVADO");
			}
			
			System.out.println("media = "+result[i]);

		}
		
		tec.close();
	}
}
