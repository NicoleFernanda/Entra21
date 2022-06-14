package extras;

import java.util.Scanner;

public class Extra7Exe02 {
	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		int a;
		int b;
		
		System.out.println("insira o valor de A:");
        a = tec.nextInt();
		System.out.println("insira o valor de B:");
        b = tec.nextInt();

        tec.close();
        
        int fator = 2;
        boolean primos = true;

        for (; fator <= a;) {
            
            if (a ==  fator ) {
                break;
            } else if (a % fator == 0) {
                //System.out.println("nao sao primos entre si");
                primos = false;
                break;
            } else {
                fator++;
                primos = true;
            }
        
        }
            
            fator = 2;

            for (; fator <= b;) {
                
                if (b == fator) {
                    break;
                } else if (b % fator == 0) {
                    primos = false;
                    break;
                } else {
                    fator++;
                }
                
            }
        
    
        System.out.println("sao primos entre si ? [" + primos + ']');
    
    }

}