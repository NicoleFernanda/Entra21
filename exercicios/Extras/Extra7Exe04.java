package extras;
import java.util.Scanner;

public class Extra7Exe04 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("numero total de mercadorias no estoque: ");
		int total = tec.nextInt();
		float soma = 0;
		float mercadoria = 0;
		
		for (int i = 0; i < total; i++) {
			System.out.println("valor mercadoria   [" + (1 + i)+"/"+total+"]");
			mercadoria = tec.nextFloat();
			
			soma += mercadoria;		
		
		}
		tec.close();

		System.out.format("total = [R$: %.2f]", soma);//duas casas decimais apos a virgula
		
		float media = soma/total;
		System.out.format("\nmedia de valor dasmercadorias = [R$: %.2f]", media);
	}

}
