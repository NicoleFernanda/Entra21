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

        int j = 0, fator = 2;
        
        while (j < numeros.length) {
            System.out.print("\n"+numeros[j]+" - ");
            fator = 1;
            
            for (; fator <= numeros[j];) {
                
                if (numeros[j] % fator == 0) {
                    System.out.print(fator + " ; ");
                    fator++;
                } else {
                    fator = fator + 1;
                }
            
            }
        
        j++;
        
        }




        tec.close();
    }
}
