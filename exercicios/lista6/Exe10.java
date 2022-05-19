package lista6;

import java.util.Scanner;

public class Exe10 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int numero = 1000;
		
		for (int i = 1; i <= 5;) {
			numero++;
			if (numero % 11 == 5) {
				i++;
		} else {continue;}
		}
		
		System.out.println(numero);
		tec.close();
	}

}


/*
 public static void main(String[] args) {
 
		Scanner tec = new Scanner(System.in);
		
		tec.close();
	}*/