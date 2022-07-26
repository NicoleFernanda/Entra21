package utilizandoStatic;

public class Contador {

    private static int numero;//valor compatilhado com todas as intancias das classes

    public Contador(){//toda vez instanceado, aumenta valor
        numero++;
    }

    public static void incrementar () {
        numero++;
    }

    public static void zerar () {
        numero = 0;
    }

    public static int retornar () {
        return (numero);
    }

    public static void imprimir () {
        System.out.println(retornar());
    }



    



    
}