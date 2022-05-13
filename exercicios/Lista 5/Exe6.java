package lista5;

import java.util.Scanner;

public class Exe6 {
	 
	public static void main(String[] args) {
		 	Scanner teclado = new Scanner(System.in);
	        
	        //entradas
	        System.out.println("Insira sua massa corporal (em quilogramas): ");
	        float massa = teclado.nextFloat();

	        System.out.println("Insira a sua altura (em metros) : ");
	        float altura = teclado.nextFloat();

	        //processamento
	        float imc = (massa)/(altura * altura);
	        System.out.println(imc);

	        if (imc < 18.5) {
	            System.out.println("Abaixo do peso");
	        
	        } else if (imc >= 18.5 && imc <= 25) {
	            System.out.println("Peso Normal");

	        } else if (imc > 25 && imc <= 30) {
	            System.out.println("Acima do peso");

	        } else if (imc > 30) {
	            System.out.println("Obeso");
	        }
	        
	        teclado.close();
	    }
	    

}
