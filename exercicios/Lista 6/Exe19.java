package lista6;

import java.util.Scanner;

public class Exe19 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int primeiro = 0, ultimo = 0;
		System.out.println("insira um numero inteiro : ");
		primeiro = tec.nextInt();
		System.out.println("insira um numero inteiro: ");
		ultimo = tec.nextInt();
		System.out.println("numeros entre os dois digitados: ");
		System.out.print("[");
		
		for (int i = 1; i >= 1; i++) {
			
			if (primeiro == ultimo) {
				System.out.println("]");
				break;
				}
		
			if (primeiro > ultimo) { //o primeiro numero adicionado maior que o segundo; ex: 39, 25
				if (i == 1) {i++; primeiro = primeiro - 1;} //nao imprime
				else {
					ultimo++;
					System.out.print(ultimo + ";");
				}
			
			}else if (ultimo > primeiro) { //o segundo numero adicionado maior que o primeiro; ex: 25,39
				if (i == 1) {i++; ultimo = ultimo - 1;} //nao imprime
				else {
					primeiro++;
					System.out.print(primeiro + ";");
					}
				}
		
		}
	
		tec.close();
	}

}
