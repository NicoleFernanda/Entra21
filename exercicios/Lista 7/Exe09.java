package lista7;

import java.util.Scanner;

public class Exe09 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int idade[] = new int[10];
		int superior = 0;
		
		for (int i = 0; i < idade.length; i++) {
			System.out.println("idade   [" + (i + 1) + "] :");
			idade[i] = tec.nextInt();
			if (idade[i] > 35) {
				superior++;
			}
		}
		
		System.out.println("pessoas com idade superior a 35 = " + superior + " pessoas");
		tec.close();
	}

}
