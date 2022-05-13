/*

A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos deindústrias que são altamente poluentes do meio ambiente. 
O índice de poluição aceitável varia de 0 (zero) até 0,25. Se o índice sobe para 0,3 as indústrias do 1o grupo são intimadas asuspenderem 
suas atividades, se o índice crescer para 0,4 as industrias do 1o e 2o grupo sãointimadas a suspenderem suas atividades, se o índice atingir 
0,5 todos os grupos devem serem notificados a paralisarem suas atividades. Faça um algoritmo que leia o índice de poluição medido e emita a 
notificação adequada aos diferentes grupos de empresas. 
 
 */


package extras;

import java.util.Scanner;

public class Exe01 {
	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		System.out.println("o índice de poluição medido: ");
		double indice = tec.nextDouble();
		
		if (indice > 0 && indice <= 0.25) {
			System.out.println("índice de poluição aceitável");
		} else if (indice >= 0.3) {
			System.out.println("indústrias do 1o grupo estao intimadas asuspenderem suas atividades");
		} else if (indice >= 0.4) {
			System.out.println("industrias do 1o e 2o grupo estao intimadas a suspenderem suas atividades");
		} else if (indice == 0.5) {
			System.out.println("todos os grupos (1o, 2o e 3o) foram notificados a paralisarem suas atividades");
		}
		
		tec.close();
		
	}

}
