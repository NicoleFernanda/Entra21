package lista8;

import java.util.Random;

public class Exe03 {
	public static void main(String[] args) {
		
		int matriz[][] = new int[10][10];
		Random numero = new Random();
		
		for (int i = 0; i < matriz.length; i++) {//imprimir
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = numero.nextInt(20);
			}
			System.out.println();
		}
		
		for (int i = 0; i < matriz.length; i++) {//imprimir
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		int maior5 = -1;
		int menor5 = 10;
		
		for (int i = 5, j = 0; j < matriz.length;j++) {//i = linha
			
			if (matriz[i][j] > maior5) {
				maior5 = matriz[i][j];
			} else if (matriz[i][j] < menor5) {
				menor5 = matriz[i][j];
			}
		}
		
		int maior7 = -1;
		int menor7 = 10;
		
		for (int i = 7, j = 0; j < matriz.length; j++) {//i = coluna
			
			if (matriz[j][i] > maior7) {
				maior7 = matriz[j][i];
			} else if (matriz[j][i] < menor7) {
				menor7 = matriz[j][i];
			}
		}
		
		
		System.out.println("menor valor da linha 5 = " + menor5);
		System.out.println("maior valor da linha 5 = " + maior5);
		System.out.println("menor valor da coluna 7 = " + menor7);
		System.out.println("maior valor da coluna 7 = " + maior7);


		
	}

}
