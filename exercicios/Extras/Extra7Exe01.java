/**
Escreva um programaque verifique a validade de uma senha fornecida pelo usuário. A senha válida é o número 1234. 
Se a senha informada pelo usuário for inválida, a mensagemACESSO NEGADOdeve ser impressa e repetida a solicitação de uma nova senha até que ela 
seja válida. 
Caso contrário, deve ser impressa a mensagemACESSO PERMITIDO junto com um número que representa quantas vezes a senha foi informada.

*/

package extras;
import java.util.Scanner;

public class Extra7Exe01 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int repetidas = 0;
		String senha;
		boolean correta = false;
		
		while (correta == false) {
			System.out.println("insira senha: ");
			senha = tec.next();
			repetidas++;

			if (senha.equals("1234")) {
				System.out.println("\nACESSO PERMITIDO");
				correta = true;
			}
		
			else {
				System.out.println("\nACESSO NEGADO");
				continue;
			}
		
		}
		
		System.out.println("senha informada ["+repetidas+"] vezes");
		
		tec.close();
	}

}
