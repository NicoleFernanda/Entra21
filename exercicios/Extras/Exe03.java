package extras;

import java.util.Scanner;

public class Exe03 {
	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		System.out.println("digite um ano");
		int ano = tec.nextInt();
		
		boolean bissexto = true;
		
		if ((ano % 400 == 0) || (ano % 400 == 0 && ano % 100 != 0)) {
			bissexto = true;
		} else {
			bissexto = false;
		}
		

		tec.close();
	}
	

}
