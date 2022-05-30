package lista7;
import java.util.Scanner;
public class Exe07 {
	
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int vetor[] = new int[10];
		byte pares = 0, impares = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("elemento [" + (i + 1) + "]");
			vetor[i] = tec.nextInt();
			if (vetor[i] % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
		}
		
		System.out.println("porcentagem impares = " + (impares * 100 / vetor.length) + "%");
		System.out.println("porcentagem pares = " + (pares * 100 / vetor.length) + "%");
		
		tec.close();
	}
}
