package utilizandoStatic;

public class Calculadora {
    
    public static int soma (int a, int b){
        return (a + b);
    }

    public static int multiplica (int a, int b){
        return (a * b);
    }

    public static int subtrai (int a, int b){
        return (a - b);
    }

    public static int divide (int a, int b){
        return (a / b);
    }

    public static int potencia (int a, int b){
        return ((int) Math.pow(a, b));
        
        /* OU 
        int total = 1;
        for (int i = 0; i < b; i++) {
            total = total * a;
        }

        return total;
        */
    }
}
