package lista3;
import java.util.Scanner;

public class Exe15 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Insira o lado do seu quadrado: ");
        float lado = tec.nextFloat();

        float area = lado * lado;
        System.out.println("A área do seu quadrado é de " + area + " m²");

        tec.close();
    }
    
}
