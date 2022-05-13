
package lista5;

import java.util.Scanner;

public class Exe10 {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int compra = t.nextInt();
		int pagamento = t.nextInt();
		int troco = pagamento - compra;
		
		if (troco < 0) {
			System.out.println("Pagamento Negado");
		} else {
			int cem, dez, um, restocem, restodez;
			cem = troco / 100;
			restocem = troco % 100;
			
			dez = restocem / 10;
			restodez = restocem % 10;
			
			um = restodez / 1;
			
			System.out.println("Valor da compra = " + compra);
			System.out.println("Valor do pagamento = " + pagamento);
			System.out.println("Troco = " + troco);
			System.out.println();
			System.out.println(cem + " nota(s) de cem");
			System.out.println(dez + " nota(s) de dez");
			System.out.println(um + " nota(s) de um");
		}
		
	
		
		t.close();
	}
}
