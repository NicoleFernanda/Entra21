/*
Fa�a um programaque leia v�rios n�meros e informe quantos desses n�meros entre 100 e 200 foram digitados. 
Quando o valor 0 (zero) for lido o programadever� encerrarsua execu��o.
 */
package lista6;

import java.util.Scanner;

public class Exe07 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int i = 1, valor, quantos = 0;
		while (i >= 1) {
			System.out.println("informe um valor:      ["+i+"]");
			valor = tec.nextInt();
		 
			if (valor > 100 && valor < 200) {quantos++;}
			else if (valor == 0) {System.out.println("\nnumeros digitados entre 100 e 200 = " + quantos); break;}
			
			
		}
		
		
		
		
		tec.close();
	}
}
