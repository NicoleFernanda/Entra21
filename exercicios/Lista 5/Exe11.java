package lista5;

import java.util.Scanner;

public class Exe11 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Escolha dois operandos:");
		double a = tec.nextDouble(), b = tec.nextDouble(), result = 0;
		System.out.println("Escolha uma operaçãoa ser executada (+, -, *, /): ");
		char op = tec.next().charAt(0);
		
		
		switch (op) {
		case '*':
			result = a*b;
			break;
			
		case '+':
			result = a + b;
			break;
		
		case '-':
			result = a - b;
			break;
		
		case '/':
			result = a / b;
			break;
		
		default:
			System.out.println("Operação inválida");
			break;
		}
		
		System.out.println("Resultado = " + result);
		
		tec.close();
	}

}
