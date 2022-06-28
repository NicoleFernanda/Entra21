package lista2;

import java.util.Scanner;

public class Exe02_ContaCorrente {
	Scanner tec = new Scanner(System.in);
	
	String nome;
	int numeroConta;
	double saldo;
	String status;
	double limite;
	
	double fazersaque() {
		System.out.println("valor para sacar: ");
		double sacar = tec.nextDouble();
		if (sacar <= saldo && saldo > 0 && sacar > 0) {
			saldo = saldo - sacar;
		} else {
			System.out.println("saldo insuficiente");
		}
				
		return saldo;
	}
	
	
	double fazerdeposito() {
		System.out.println("valor para depositar: ");
		double depositar = tec.nextDouble();
		
		saldo = saldo + depositar;
		
		if (saldo > limite) {
			saldo = saldo - depositar;
			System.out.println("limite excedido");
		}
		
		
		return saldo;
	}
	
	String fazerconsultaEspecial() {
		System.out.println("o cliente [" + nome + "] usa cheque especial?            sim/nao");
		status = tec.next();
		
		return status;
	}
	
	
	void imprimir() {
		System.out.println("\n"+nome);
		System.out.println("NUMERO DA CONTA = " + numeroConta);
		System.out.println("SALDO = " + " R$: " + saldo );
		if (status.equalsIgnoreCase("sim")) {
			System.out.println("USO DO CHEQUE ESPECIAL");
		} else {
			System.out.println("DESUSO DO CHEQUE ESPECIAL");
		}
		
	}

}
