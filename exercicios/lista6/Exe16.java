package lista6;

import java.util.Scanner;

public class Exe16 {
	public static void main(String[] args) {
Scanner tec = new Scanner(System.in);
		
		int i = 1;
		byte idade;
		float salario;
		char estadocivil, sexo;
		
		while (i == 1) {
			
			System.out.println("\nidade: ");
			idade = tec.nextByte();
			
			if (idade < 1 || idade > 99) {
				System.out.println("erro; \ninsira novamente");
				continue;
			}
			
			System.out.println("\nsalario: ");
			salario = tec.nextFloat(); //maior que zero
			
			if (salario <= 0) {
				System.out.println("erro; \ninsira tudo novamente");
				continue;
			}
			
			System.out.println("\nsexo: ");
			sexo = tec.next().charAt(0);
			sexo = Character.toLowerCase(sexo);
			
			if (!(sexo == 'f' || sexo == 'm')) { //testar
				System.out.println("erro; \ninsira tudo novamente");
				continue;
			}
			
			System.out.println("\nestado civil: ");
			estadocivil = tec.next().charAt(0);
			estadocivil = Character.toLowerCase(estadocivil);
			
			if (!(estadocivil == 's' || estadocivil == 'c' || estadocivil == 'd' || estadocivil == 'v')) {
				System.out.println("erro; \ninsira tudo novamente");
				continue;
			} else {
				System.out.println("obrigado!");
			}
		
		i++;
		}
		
		tec.close();
	}

}
