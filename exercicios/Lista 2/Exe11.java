package lista2;
import java.util.Scanner;

public class Exe11 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Quantidade de rosas e tulipas, respectivamente: ");
        int rosas = tec.nextInt();
        int tulipas = tec.nextInt();

        float valor = ((rosas * 2.8f ) + (tulipas * 4.2f));
        
        System.out.println("O totlal a pagar sera R$: " + valor);


        tec.close();
    }
    
}
