package lista6;

import java.util.Scanner;

public class Exe02 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		double valor = 0, uni, maior = 0, recursos = 0;
		int i = 1, carteira, quant, maiorcarteira = 0;
		while (i >= 1) {
			System.out.println("seu numero de carteira (parar = 0)");
			carteira = tec.nextInt();
			if (carteira == 0) {break;}
			
			System.out.println("quantidade de multas");
			quant = tec.nextInt();
			System.out.println("valor unitario dessas multas");
			uni = tec.nextDouble();
			
			valor = uni * quant;
			System.out.println("valor de dividas da carteira ' " + carteira + " ' eh de = R$: " + valor);
			if (i == 1) {
				maior = quant;
				maiorcarteira = carteira;}
			
			if (quant > maior) {
				maior = quant;
				maiorcarteira = carteira;}
		
		recursos += valor; //valor de todas as multas de todas as repeticoes
		i++;
		}
	
		System.out.println("total de recursos arrecadados = " + recursos);
		System.out.println("número da carteira do motorista que obteve o maior número de multa = " + maiorcarteira);
		
		tec.close();
	}

}
