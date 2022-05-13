package lista5;

import java.util.Scanner;

public class Exe5 {
	public static void main(String[] args) {
	Scanner t = new Scanner(System.in);
	System.out.println("Sua idade: ");
	byte idade = t.nextByte();
	
	if (idade <= 7 && idade >= 5) {
		System.out.println("Infantil A");
	
	} else if (idade >= 8 && idade <= 10) {
		System.out.println("Infantil B");
	
	} else if (idade >= 11 && idade <= 13) {
		System.out.println("Juvenil A");
	
	} else if (idade >= 14 && idade <= 17) {
		System.out.println("Juvenil B");
	
	} else if (idade >= 18) {
		System.out.println("Adulto");
	} else {
		System.out.println("Inválido");
	}

	t.close();
			
	}
}
