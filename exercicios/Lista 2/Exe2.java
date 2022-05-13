package lista2;
import java.util.Scanner;
public class Exe2 {
    public static void main(String[] args) {
        System.out.println("minutos usados: ");
        Scanner tec = new Scanner(System.in);
        int min = tec.nextInt();

        float valor = (min * 2.30f) / 60; //2.30 por hora
        System.out.println("O valor a pagar sera R$: " + valor );

        tec.close();
    }
    
}
