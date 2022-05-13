package lista2;
import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) {
        System.out.println("insira sua idade: ");
        Scanner tec = new Scanner(System.in);
        int idade = tec.nextInt();
        System.out.println("sua idade: " + idade);
        tec.close();
    }
}
