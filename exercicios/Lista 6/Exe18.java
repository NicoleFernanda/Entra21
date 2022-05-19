package lista6;

import java.util.Scanner;

public class Exe18 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		//pais A
		System.out.println("habitantes do Pais A");
		double popua = tec.nextDouble();
		System.out.println("taxa de crescimento do Pais A (em porcentagem)");
		double taxaa = tec.nextDouble();
		taxaa = taxaa / 100;
		//pais B
		System.out.println("habitantes do pais B");
		double popub = tec.nextDouble();
		System.out.println("taxa de crescimento do Pais B (em porcentagem)");
		double taxab = tec.nextDouble();
		taxab = taxab / 100;
		
		int anos = 0;
		
		for (int i = 1; i >= 1; i++) {
		
			if (popua >= popub) {
				System.out.println("vai levar " + anos + " anos para que a populacao A ultrapasse ou iguale a populacao B");
				break;
			} else {
				popua = (popua * taxaa) + popua;
				popub = (popub * taxab) + popub;
				anos++;
			}
		
		}
		
		
	tec.close();
	}

}
