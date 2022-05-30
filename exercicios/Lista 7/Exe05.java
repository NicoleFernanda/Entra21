package lista7;
import java.util.Scanner;

public class Exe05 {
	
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int vetor[] = new int[10];
		String elementos = "";
		int soma = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("elemento [" + (i + 1)+ "] do vetor [" + i + "]");
			vetor[i] = tec.nextInt();
			
			if (vetor[i] % 5 == 0) {
				soma += vetor[i];
				elementos = elementos + vetor[i] + " ; ";
			}
		}		
		
		System.out.println("elementos multiplos de 5 = " + elementos);
		System.out.println("soma dos elementos multiplos de 5 = " + soma);
		tec.close();
	}

}
