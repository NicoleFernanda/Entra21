package lista7;

import java.util.Scanner;

public class Exe14 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int vetora[] = new int[10];
		int vetorb[] = new int[10];
		int vetorc[] = new int[20];
		
		int j = 0;
		
		System.out.println("VETOR A:");
		for (int i = 0; i < vetora.length; i++) {
			System.out.println("elemento   [" + (i + 1) + "]");
			vetora[i] = tec.nextInt();
			vetorc[j] = vetora[i];
			j++;
		}

		System.out.println("\nVETOR B:");
		for (int i = 0; i < vetorb.length; i++) {
			System.out.println("elemento   [" + (i + 1) + "]");
			vetorb[i] = tec.nextInt();
			vetorc[j] = vetorb[i];
			j++;
		}
		
		for (int i = 0; i < vetorc.length; i++) {
			System.out.print(vetorc[i] + " ; ");
		}
		
		tec.close();
	}

}
