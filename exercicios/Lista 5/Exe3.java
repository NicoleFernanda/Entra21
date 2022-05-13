package lista5;
import java.util.Scanner;
public class Exe3 {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.println("Qual o seu sexo? (M para homens e F para mulheres)");
		char sexo = t.next().charAt(0);
		sexo = Character.toUpperCase(sexo); //letra maiuscula
		System.out.println(sexo);
		double peso = 0, alt;
		System.out.println("Qual a sua altura (em metros) ?");
		alt = t.nextDouble();
		
		if (sexo == 'F') {
			peso = (alt * 62.1) - 44.7;
			System.out.println("Seu peso ideial: " + peso);
		} else if (sexo == 'M') {
			peso = (alt * 72.7) - 58;
		} else {
			System.out.println("sexo não identificado");
		}
		
		t.close();
	}
}
