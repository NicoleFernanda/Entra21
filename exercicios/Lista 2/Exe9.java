package lista2;
import java.util.Scanner;

public class Exe9 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int carne, pessoas;
        double cerveja, valor;

        System.out.println("Insira a quantidade de pessoas as quais irao comparecer: ");
        pessoas = tec.nextInt();

        carne = pessoas * 9;
        cerveja = pessoas * 1.7 * 6; //6 cerveja por pessoa
        valor = cerveja + carne;
        
        System.out.println("o total a pagar sera R$: " + valor);

        tec.close();
    }
    
}
