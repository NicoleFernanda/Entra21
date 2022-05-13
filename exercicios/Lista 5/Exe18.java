package lista5;

import java.util.Scanner;

public class Exe18 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("escolha uma letra: ");
		char letra = tec.next().charAt(0);
		
		if (letra == 'a' || letra == 'i' || letra == 'o' || letra == 'u' || letra == 'e') {
			System.out.println("vogal");
		} else {
			System.out.println("consoante");
		}
		
		tec.close();
	}
}
