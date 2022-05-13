package lista3;
import java.util.Scanner;

public class Exe16 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        double receita, lucro, percentual, despesa;
        System.out.println("Informe a sua receita e despesas, respectivamente:  ");
        receita = t.nextDouble();
        despesa = t.nextDouble();
        
        lucro = receita - despesa;
        percentual = despesa * 100 / receita;

        System.out.println("Seu lucro foi de: " + lucro + "\nO percentual das despesas em relação à  receita é: " + percentual + "%");

        t.close();
    }
    
}
