package lista6;

import java.util.Scanner;

public class Exe15 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int i = 1;
		
		while (i == 1) {
		System.out.println("codigo: ");
		String codigo = tec.next();
		System.out.println("senha: ");
		String senha = tec.next();
		
		if (senha.equals(codigo)) {
			System.out.println("erro; insira informacoes novamente");
			continue;
		} else {
			System.out.println("obrigado!");
			break;
			}
		
		}
		
		tec.close();
	}

}
