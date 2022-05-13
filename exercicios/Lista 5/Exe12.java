package lista5;

import java.util.Scanner;

public class Exe12 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		double n1,n2,n3,exer,media;
		System.out.println("Nota das três verificações, espectivamente (N1, N2 e N3)");
		n1 = tec.nextDouble();
		n2 = tec.nextDouble();
		n3 = tec.nextDouble();
		System.out.println("Média dos exercícios: ");
		exer = tec.nextDouble();
		
		media = ((n1 + (n2 * 2) + (n3*3) + exer)/7);
		
		if (media >= 9) {
			System.out.println("Conceito A");
		} else if (media < 9 && media >= 7.5) {
			System.out.println("Conceito B");
		} else if (media < 7.5 && media >= 6.0) {
			System.out.println("Conceito C");
		} else {
			System.out.println("Conceito D");
		}
		
		tec.close();
	}

}
