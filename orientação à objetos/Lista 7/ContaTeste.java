package lista7;

import java.util.Scanner;

public class ContaTeste {
	public static void main(String[] args) throws lista7.ContaExcecao {
		
		Scanner tec = new Scanner(System.in);
		
		Conta minhaConta = new Conta();
		System.out.println("deposita 100");
		minhaConta.deposita(100);
		minhaConta.imprimeSaldo();
		System.out.println("deposita 600");
		minhaConta.deposita(600);
		minhaConta.imprimeSaldo();
		minhaConta.setLimite(600);
		System.out.println("limite = " + minhaConta.getLimite());
		
		try {
			System.out.println("\ndigite um valor para sacar");
			double valor = tec.nextDouble();
			minhaConta.saca(valor);
		}
		catch(lista7.ContaExcecao e) {//nao sei pq tive que colocar o nome do package aqui
			System.out.println("saldo insuficiente");
			System.out.println("defina outro valor para sacar");
			double valor = tec.nextDouble();
			minhaConta.saca(valor);
			
		}finally {
			minhaConta.imprimeSaldo();
		}
		
		
		
		
		tec.close();
		
	}
}
