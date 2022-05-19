package lista6;
import java.util.Scanner;

public class Exe11 {
	public static void main(String[] args) {
		 
		Scanner tec = new Scanner(System.in);
		System.out.println("tabuada de qual numero: ");
		int n = tec.nextInt();
		
		for (int i = n; i <= n; i++) {
			System.out.println("tabuada de " + i);
			for (int j = 0; j <= 10; j++) {
				System.out.println(i + "X" + j + " = " + i*j);
			}
		}
		
		
		tec.close();
	}

}
