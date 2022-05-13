/*caseQuestão_1:  Elabore  um  PROGRAMA,  que  dado  um  número inteiro, positivo, verifique e exiba se ele é par ou ímpar 
 * (Obs.: um número par é divisível por 2, ou seja, o resto da divisão por 2 é igual a zero).
 */

package lista5;
import java.util.Scanner;

public class Exe1 {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		
		int numero = t.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("É um número par");
		} else { System.out.println("Não é par"); }
		
		
		
		t.close();
	}
}
