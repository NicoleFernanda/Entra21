package utilizandoStatic;

public class CalculadoraExemplo {
    public static void main(String[] args) {
        System.out.println("somando 4 e 5");
        imprimir(Calculadora.soma(4, 5));
        System.out.println("dividindo 8 e 2");
        imprimir(Calculadora.divide(8, 2));
        System.out.println("subtraindo 9 e 12");
        imprimir(Calculadora.subtrai(9, 12));
        System.out.println("7 elevado a 2");
        imprimir(Calculadora.potencia(7, 2));
    }


    public static void imprimir(int num){
        System.out.println(num);
    }
}
