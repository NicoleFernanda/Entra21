package lista7;
import java.util.Scanner;

public class Exe04 {

	public static void main(String[] args) {
	
		Scanner tec = new Scanner(System.in);
		int vetor[] = new int[10];
		byte quant = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("elemento [" + (i + 1)+ "] do vetor [" + i + "]");
			vetor[i] = tec.nextInt();
			if (vetor[i] % 2 == 0) {
				quant++;
			}
		}
		
		System.out.println("quantidade de numeros pares no vetor = " + quant);
	
		tec.close();
	}
}
