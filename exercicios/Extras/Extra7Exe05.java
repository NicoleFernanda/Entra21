package extras;

import java.util.Scanner;

public class Extra7Exe05 {
	public static void main(String[] args) {
		
		float valor, soma = 0, media;
		char resp;
		int total = 0;
		
		Scanner tec = new Scanner(System.in);
		
		for (int i = 0; i >= 0; i++) {
			System.out.println("valor mercadoria   [" + (1 + i) + "]");
			valor = tec.nextFloat();
			total++;

			System.out.println("mais mercadorias? (S/N)");
			resp = tec.next().charAt(0);
			resp = Character.toLowerCase(resp);
			soma += valor;

			if (resp == 'n') {
				break;
			}
					
		}
		
		tec.close();
		
		System.out.format("total = [R$: %.2f]", soma);//duas casas decimais apos a virgula
		
		media = soma/total;
		System.out.format("\nmedia de valor dasmercadorias = [R$: %.2f]", media);
		
	}

}
