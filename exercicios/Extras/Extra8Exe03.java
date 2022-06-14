package extras;

import java.util.Scanner;

public class Extra8Exe03 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		
		int matriz[][]= new int[8][8];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("linha["+i+"]       coluna["+j+ "]" );
				matriz[i][j] = tec.nextInt();
			}
		}
	
		boolean simetrica = true;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == matriz[j][i]) {
					simetrica = true;
				} else {
					simetrica = false;
				}
			}
		}
		
		if (simetrica == true) {
			System.out.println("eh simetrica");
		} else {
			System.out.println("NAO eh simetrica");
		}
	
		tec.close();
	}

}
