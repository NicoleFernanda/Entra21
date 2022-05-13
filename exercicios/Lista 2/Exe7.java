package lista2;
import java.util.Scanner;

public class Exe7 {
    public static void main(String[] args) {
        float peso, valor;
        Scanner tec = new Scanner(System.in);
        System.out.println("Peso do prato (em gramas):");
        peso = tec.nextFloat();
        valor = (peso - 230) * 0.02f;
        System.out.println("O valor do prato ficou R$: " + valor);  
        
        tec.close();
    
    }
}
