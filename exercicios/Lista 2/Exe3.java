package lista2;
import java.util.Scanner;

public class Exe3 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("numero de paginas que deseja imprimir: ");
        float valor, folhas;
        folhas = tec.nextInt();
        valor = 0;

        if ((folhas / 2) % 2 == 0) { //par
            valor = (folhas / 2) * 0.08f; //0.08 folha frente e verso
            System.out.println("O valor da impressao das folhas sera R$: " + valor);

        } else { //impar
            valor = ((((folhas - 1)/2) * 0.08f) + 0.08f);  
            System.out.println("O valor da impressao da folhas sera R$: " + valor);
        }

        tec.close();
    }
    
}
