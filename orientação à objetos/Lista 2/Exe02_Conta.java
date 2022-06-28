package lista2;

import java.util.Scanner;

public class Exe02_Conta {
	public static void main(String[] args) {
		
	
		Scanner tec = new Scanner(System.in);
		
		
		Exe02_ContaCorrente cliente = new Exe02_ContaCorrente();
		
		System.out.println("nome : ");
		cliente.nome = tec.nextLine();
		cliente.nome = cliente.nome.toUpperCase();
		
		System.out.println("numero da conta: ");
		cliente.numeroConta = tec.nextInt();
		
		System.out.println("saldo do cliente: ");
		cliente.saldo = tec.nextDouble();
		
		System.out.println("qual o seu limite? ");//o maximo que a conta pode ter
		cliente.limite = tec.nextDouble();
				
		System.out.println("realizar saque? N - nao     S - sim");
		char saque = tec.next().charAt(0);
		
		if (saque == 'S' || saque == 's') {
			cliente.fazersaque();
			System.out.println("saldo atual = " + cliente.saldo);
		}
		
		
		System.out.println("realizar deposito?      N - nao     S - sim");
		char depositar = tec.next().charAt(0);
		
		if (depositar == 'S' || depositar == 's') {
			cliente.fazerdeposito();
			System.out.println("saldo atual = " + cliente.saldo);
		}
		
		cliente.fazerconsultaEspecial();
		cliente.imprimir();
	
		tec.close();
		
		
		
		
		
	}
	
	
	

}
