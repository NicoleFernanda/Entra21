package lista8;

import java.util.Scanner;

public class Exe02 {
	public static void main(String[] args) {
		int matriz[][] = new int[3][3];
		Scanner tec = new Scanner(System.in);
		int pares = 0;
		int impares = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			System.out.println("linha [" + i + "]");
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("coluna [" + j + "]");
				matriz[i][j] = tec.nextInt();
			}
			System.out.println();
		}
		
		tec.close();
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = 0; i < matriz.length; i++) {//pares ou impares
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] % 2 == 0) {
					pares++;
				} else {
					impares++;
				}
			}
			System.out.println();
		}
		
		System.out.println("quantidade de numeros pares = " + pares);
		System.out.println("quantidade de numeros impares = " + impares);
		
	}
}
