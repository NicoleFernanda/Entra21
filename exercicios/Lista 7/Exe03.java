package lista7;
import java.util.Scanner;
public class Exe03 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int vetorA[] = new int[10];
		int vetorB[] = new int[vetorA.length];
		float vetorC[] = new float[vetorA.length];
		
		System.out.println("VETOR A :");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("insira o elemento ["+ (i + 1)+"] do vetor ["+i+"]");
			vetorA[i] = tec.nextInt();
		}
		
		System.out.println("\nVETOR B :");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("insira o elemento ["+ (i + 1)+"] do vetor ["+i+"]");
			vetorB[i] = tec.nextInt();
		}
		
		System.out.println("\n\nVETOR C (soma) :");
		for (int i = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
			System.out.print(vetorC[i] + " ; ");
		}
		
		System.out.println("\n\nVETOR C (diferenca) :");
		for (int i = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i] - vetorB[i];
			System.out.print(vetorC[i] + " ; ");
		}
		
		System.out.println("\n\nVETOR C (multiplicacao) :");
		for (int i = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i] * vetorB[i];
			System.out.print(vetorC[i] + " ; ");
		}
		
		System.out.println("\n\nVETOR C (divisao) :");
		for (int i = 0; i < vetorC.length; i++) {
			vetorC[i] = (float) vetorA[i] / vetorB[i];
			System.out.print(vetorC[i] + " ; ");
		}
		
		
		tec.close();
	}
	
	
			
	
}
