package lista7;

import java.util.Scanner;

public class Exe17 {
	public static void main(String[] args) {
	Scanner tec = new Scanner(System.in);
		
		String nomes[] = new String[3];
		int cds[] = new int[nomes.length];
		int gratis = 0;
		
		for (int i = 0; i < nomes.length; i++) {
			System.out.println("nome [" + (i + 1)+ "]");
			nomes[i] = tec.next();
			System.out.println("quantidades de cds de " + nomes[i]);
			cds[i] = tec.nextInt();
		}
		
		
		for (int i = 0; i < cds.length; i++) {
			
			gratis = 0;

			if (cds[i] / 10 >= 1) {
				gratis = cds[i] / 10;
				
			} 
	
			System.out.println("["+nomes[i] + "] tem direito a [" + gratis + "] locacoes gratis \t[" + cds[i] + " cd(s)]");
		}
		
		tec.close();
	}

}
