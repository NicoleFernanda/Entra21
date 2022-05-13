package lista2;
import java.util.Scanner;

public class Exe8 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Insira o seu nome: ");
        String nome = tec.next();
        System.out.println("Insira o tempo (em horas) e a distancia (km) da viagem: ");
        float tempo = tec.nextFloat();
        float distancia = tec.nextFloat();
        float velocidade = distancia / tempo;

        System.out.println( "A velocidade media do(a) piloto(a) " + nome + " foi de " + velocidade + " km/h");

        tec.close();
    }
    
}
