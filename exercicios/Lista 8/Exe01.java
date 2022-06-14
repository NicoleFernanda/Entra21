package lista8;

import java.util.Random;

public class Exe01 {
	public static void main(String[] args) {
		Random numero = new Random();
		int matriz[][] = new int[4][4];
		
		for (int i = 0; i < matriz.length; i++) {//imprimir
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = numero.nextInt(9);
			}
			System.out.println();
		}
		
		for (int i = 0; i < matriz.length; i++) {//imprimir
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
		
		
	}

}
