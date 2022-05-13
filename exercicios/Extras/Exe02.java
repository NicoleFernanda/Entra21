package extras;
import java.util.Scanner;

public class Exe02 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int i = 1;
		double preco, maior = 0, menor = 0;
		
		
		while (i <= 3) {
			System.out.println("preco do produto " + i);
			preco = tec.nextDouble();
			
			if (i == 1) {
				maior = preco;
				menor = preco;
			} 
			if (preco > maior) {
				maior = preco;
			
			} else if (preco < menor) {
				menor = preco;
			}
			
			
			i++;
		}
		
		System.out.println("voce deve comprar o produto com preco = " + menor + " pois ele eh mais barato");
	
	
		tec.close();
	}

}
