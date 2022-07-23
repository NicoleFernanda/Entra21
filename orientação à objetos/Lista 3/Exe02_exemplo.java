package lista3;

import java.util.Scanner;

public class Exe02_exemplo {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        Exe02_ cliente = new Exe02_();

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
		
		cliente.fazerconsultaEspecial(tec);
		cliente.imprimir();
	
		tec.close();
        

    }
}
