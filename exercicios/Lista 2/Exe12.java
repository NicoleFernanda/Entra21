package lista2;
import java.util.Scanner;

public class Exe12 {
    public static void main(String[] args) {
        System.out.println("Quantidade de fotos: ");
        Scanner tec = new Scanner(System.in);
        
        int fotos = tec.nextInt();
        int a = fotos % 100;
        float avulsas = a * 0.07f; //o resto de a vem pra ca, se fotos = 400, avulsas = 0;

        int p = fotos - a; //quantas fotos do pacote - avulsas (fica quantas fotos para pacote) 
        int pacote = ((p/100)*44);

        float valor = avulsas + pacote;
        System.out.println("O valor total sera R$: " + valor);

        tec.close();
    }
    
}
