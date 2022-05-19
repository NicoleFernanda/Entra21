package lista6;

import java.util.Scanner;

public class Exe09 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("escolha um numero positivo inteiro:");
		double num = tec.nextInt();
		boolean primo = true;
		
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {primo = false;}
		}
		
		String result = (primo == true) ? "" : "nao";
		System.out.println(num + " "+ result + " eh primo");
		tec.close();
	}

}
