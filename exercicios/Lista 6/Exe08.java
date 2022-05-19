package lista6;

import java.util.Scanner;

public class Exe08 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("primeiro termo (inteiro) da progressao crescente: ");
		int termo = tec.nextInt();
		System.out.println("termo somatorio   (exemplo:2; 4,6,8,10,etc)");
		int soma = tec.nextInt();
		System.out.println("limite inferior: ");
		int minimo = tec.nextInt();
		System.out.println("limite superior: ");
		int maximo = tec.nextInt();
		String termos = "";
		String pares = "";
		
		int somatorio = 0;
		
		int i = 1;
		
		while (i >= 1) {
			if (termo == maximo || termo > maximo) {break;}
			
			if (termo > minimo && termo < maximo) {
				termos = termos + termo + "," ;
				if (termo % 2 == 0) {
					somatorio = somatorio + termo;
					pares = pares + termo + ";";
				}
			}
			
		termo = termo + soma;
		i++;
		}
		
		System.out.println("termos = "+termos);
		System.out.println("soma dos termos pares = " + somatorio);
		System.out.println("termos pares = " + pares);
		tec.close();
	}

}
