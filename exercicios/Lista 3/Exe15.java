package lista3;
import java.util.Scanner;

public class Exe15 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Insira o lado do seu quadrado: ");
        float lado = tec.nextFloat();

        float area = lado * lado;
        System.out.println("A �rea do seu quadrado � de " + area + " m�");

        tec.close();
    }
    
}
