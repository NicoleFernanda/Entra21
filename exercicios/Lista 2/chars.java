package lista2;
import java.util.Scanner;

public class chars {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        char a = 'a' ; //97
        char b = 'b'; //98
        char A = 'A';
        System.out.println("a: " + (a + b - b));
        System.out.println("b: " + (b + a - a));

        System.out.println("A: " + (A - b + b));
        


        System.out.println();

        tec.close();
    }
    
}
