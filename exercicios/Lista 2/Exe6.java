package lista2;
import java.util.Scanner;

public class Exe6 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("dias de atraso: ");
        int dia = tec.nextInt();
        System.out.println("o valor a pagar sera R$: " + (dia * 2.5));
        tec.close();
    }
    
}
