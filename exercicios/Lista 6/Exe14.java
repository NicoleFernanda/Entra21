/*
 Faça um programa que calcule o valor total investido por um colecionador de em 
sua coleção de CDs e o valor médio gasto em cada um deles. O usuário deverá informar a 
quantidade de CDs e o valor para cada um deles.

 */


package lista6;
import java.util.Scanner;
public class Exe14 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int totalcds = 0;
		float valor, total = 0;
		int i = 1;
		
		System.out.println("quantidade de cds: ");
		int quant = tec.nextInt();
		
		while (i <= quant) {
		
			System.out.println("valor cd      ["+i+"]");
			valor = tec.nextFloat();
			
			total = valor + total;
			
			totalcds++;
			
			i++;
		}
		float media = total/totalcds;
		
		System.out.println("valor total investido = " + total);
		System.out.println("valor medio gasto por cd = " + media);
		tec.close();
	
	}

}
