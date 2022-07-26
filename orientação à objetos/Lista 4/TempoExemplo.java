package utilizandoStatic;

public class TempoExemplo {
    public static void main(String[] args) {
        System.out.print("12 minutos    = \t");
        imprimir(Tempo.minsParaSeg(12));
        System.out.println(" segundos");
        System.out.print("60 minutos    = \t");
        imprimir(Tempo.minsParaHoras(60));
        System.out.println(" horas");
        System.out.print("8 dias        = \t");
        imprimir(Tempo.diasParaHoras(8));
        System.out.println(" horas");
        System.out.print("3 semanas     = \t");
        imprimir(Tempo.semanasParaDias(3));
        System.out.println(" dias");
        System.out.print("5 meses       = \t");
        imprimir(Tempo.mesParaDias(5));
        System.out.println(" dias");
        System.out.print("2 anos        = \t");
        imprimir(Tempo.anoParaDias(2));
        System.out.println(" dias");

    }

    public static void imprimir(float numero) {
        System.out.print(numero);
    }

}
