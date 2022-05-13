package lista2;
import java.util.Scanner;
public class Exe4 {
    public static void main(String[] args) {
        float c,f;
        Scanner tec = new Scanner(System.in);
        System.out.println("escreva uma temperatura em Â°C: ");
        c = tec.nextFloat();
        f = (c * 1.8f) + 32;
        System.out.println("a temperatura " + c + "°C sera " + f + "°F em Farenheit");

        tec.close();
    }
    
}
