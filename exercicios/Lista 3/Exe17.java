package lista3;
import java.util.Scanner;

public class Exe17 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Seu nome: ");
        String nome = t.next();
        System.out.println("Sua idade: ");
        int idade = t.nextInt();

        int dias = idade * 365;

        System.out.println(nome + " viveu " + dias + " dias");



        t.close();
    }
    
}
