package lista7;

import java.util.Scanner;

public class Exe15 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
        int numeros[] = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("elemento  ["+ (i + 1)+"]");
            numeros[i] = tec.nextInt();
        }

        int j = 0, number, fator = 2;
        
        while (j < numeros.length) {
            number = numeros[j];
            System.out.print("\n"+numeros[j]+" - ");
            fator = 1;
            
            for (; fator <= number;) {
                
                if (number % fator == 0) {
                    number = number/fator;
                    System.out.print(fator + " ; ");
                    fator++;
                } else if (number == 1) {
                    break;
                } else {
                    fator = fator + 1;
                }
            
            }
        
        j++;
        
        }




        tec.close();
    }
}