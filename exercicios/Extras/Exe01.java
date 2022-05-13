/*

A Secretaria de Meio Ambiente que controla o �ndice de polui��o mant�m 3 grupos deind�strias que s�o altamente poluentes do meio ambiente. 
O �ndice de polui��o aceit�vel varia de 0 (zero) at� 0,25. Se o �ndice sobe para 0,3 as ind�strias do 1o grupo s�o intimadas asuspenderem 
suas atividades, se o �ndice crescer para 0,4 as industrias do 1o e 2o grupo s�ointimadas a suspenderem suas atividades, se o �ndice atingir 
0,5 todos os grupos devem serem notificados a paralisarem suas atividades. Fa�a um algoritmo que leia o �ndice de polui��o medido e emita a 
notifica��o adequada aos diferentes grupos de empresas. 
 
 */


package extras;

import java.util.Scanner;

public class Exe01 {
	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		System.out.println("o �ndice de polui��o medido: ");
		double indice = tec.nextDouble();
		
		if (indice > 0 && indice <= 0.25) {
			System.out.println("�ndice de polui��o aceit�vel");
		} else if (indice >= 0.3) {
			System.out.println("ind�strias do 1o grupo estao intimadas asuspenderem suas atividades");
		} else if (indice >= 0.4) {
			System.out.println("industrias do 1o e 2o grupo estao intimadas a suspenderem suas atividades");
		} else if (indice == 0.5) {
			System.out.println("todos os grupos (1o, 2o e 3o) foram notificados a paralisarem suas atividades");
		}
		
		tec.close();
		
	}

}
