/*caseQuest�o_1:  Elabore  um  PROGRAMA,  que  dado  um  n�mero inteiro, positivo, verifique e exiba se ele � par ou �mpar 
 * (Obs.: um n�mero par � divis�vel por 2, ou seja, o resto da divis�o por 2 � igual a zero).
 */

package lista5;
import java.util.Scanner;

public class Exe1 {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		
		int numero = t.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("� um n�mero par");
		} else { System.out.println("N�o � par"); }
		
		
		
		t.close();
	}
}
