package lista7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exe02 {
	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		System.out.println("eu sei dividir:");
		
		int x = 0;
		int y = 0;
		double r = 0;
		
			try {
				System.out.println("informe o primeiro valor:");
				x = tec.nextInt();
				System.out.println("informe o segundo valor:");
				y = tec.nextInt();
				r = (x/y);
				
			} catch (InputMismatchException e) {
				System.out.println("numero negado");
			} catch (ArithmeticException e) {
				System.out.println("numero negado2");
			}
	
		
		System.out.println("resultado da divisao �: \t" + r);
		
		
		tec.close();
	}

}
