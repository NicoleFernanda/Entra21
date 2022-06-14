package extras;

import java.util.Scanner;

public class Extra7Exe06 {
	public static void main(String[] args) {
		
		/* ENUNCIADO:
		peca ao usuario para ele digitar um numero maior que 0 e menor que 100. 
		Se o numero que digitado for par, some 1 a ele, se for impar, nao precisa mudar. 
		Imprima os numeros x em uma progressao aritmetica com razao 2.
		 */

		
		Scanner in = new Scanner(System.in);
		int x = -1;
		
		while (x <= 0 || x >= 100) {
			System.out.print("Digite um nœmero maior que zero e menor que 100: ");
			x = in.nextInt();
		}
		
		in.close();
		
		if (x%2 == 0){//se for par, somar um ao valor de x
			x = x + 1;
		}
		
		while (x < 100) {//imprimir x em uma progreessao aritemtica com razao 2
			System.out.print(x + ", ");
			x = x + 2;
		}

	
	}
	
}

