package extras;

import java.util.Random;

public class Extra8Exe04 {
	public static void main(String[] args) {
		
		int matriz[][] = new int[10][5];
		int multiplos[] = new int[50];
		int k = 0;
		Random numero = new Random();
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = numero.nextInt(80);
				System.out.print(matriz[i][j] + "\t");
				
				if (matriz[i][j] % 7 == 0) {
					multiplos[k] = matriz[i][j];
					k++;
				}
			}
			System.out.println();
		}
		
		System.out.println("\n\n\nmultiplos\n");
		
		for (int i = 0; i < multiplos.length; i++) {
			System.out.print(multiplos[i] + "\t");
		}
	
	
	
	}

}
