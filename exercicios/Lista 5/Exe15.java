package lista5;

import java.util.Scanner;

public class Exe15 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("a quantidade (kg) de carne que queres: ");
		double quant = tec.nextDouble(), valor = 0;
		
		System.out.println("o tipo de carne que queres (file duplo (escrever file), alcatra, picanha): ");
		String tipo = tec.next();
		tipo = tipo.toLowerCase();
		
		System.out.println("Pagamente com cartao? 1 = sim e 0 = nao");
		String cartao = tec.next();
		System.out.println(cartao);
		
		if (quant < 5 && quant > 0) {
			if (tipo.equals("file")) {
				valor = 4.9;
			} else if (tipo.equals("alcatra")){
				valor = 5.9;
			} else if (tipo.equals("picanha")) {
				valor = 6.9;
			}
		
		} else if (quant >= 5 && quant > 0) { //< 5 ou = a 5
			if (tipo.equals("file")) {
				valor = 5.8;
			} else if (tipo.equals("alcatra")){
				valor = 6.8;
			} else if (tipo.equals("picanha")) {
				valor = 7.8;
			}
		} else {
			System.out.println("quantidade invalida");
		}
		
		if (cartao.equals("1")) {
			valor = (valor*quant) - (0.05 * (valor * quant));
		} else if (cartao.equals("0")) {
			valor = valor * quant;
		}
		
		System.out.println("\ntotal a pagar = " + valor);
		
		tec.close();
	}

}
