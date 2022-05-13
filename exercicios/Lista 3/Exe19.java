package lista3;
import java.util.Scanner;

public class Exe19 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Insira uma hora qualquer, da seguente forma: \nHora: ");
        int hora, min, total;
        hora = tec.nextInt();
        System.out.println("Minutos: ");
        min = tec.nextInt();

        total = min + hora * 60;

        System.out.println("Tal horrário tranformado em minutos é " + total);

        tec.close();


    }
    
}
