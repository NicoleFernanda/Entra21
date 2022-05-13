package lista2;

import java.util.Scanner;
public class Exe10 {
    public static void main(String[] args) {
        //salario por dia
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Seu nome: ");
        String nome = tec.next();
        
        System.out.println("Horas diarias trabalhadas: ");
        int horas = tec.nextInt();
        
        System.out.println("Valor que recebe por hora trabalhada: ");
        double valorHora = tec.nextDouble();
        
        System.out.println("Quantidade de filhos (se tiver): ");
        int filhos = tec.nextInt();

        double salarioDia = valorHora * horas;


        double salario = ((filhos * 0.03) * salarioDia) + salarioDia;
        System.out.println("O salario diario de " + nome + " é de R$: " + salario);        
        tec.close();
    }
    
}
