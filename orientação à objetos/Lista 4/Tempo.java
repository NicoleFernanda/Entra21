package utilizandoStatic;

public class Tempo {
    
    private static float seg;
    private static float horas;
    private static float dias;

    public static float minsParaSeg(float min) {
        seg = min * 60;
        return seg;
    }

    public static float minsParaHoras(float min) {
        horas = min / 60;
        return horas;
    }

    public static float diasParaHoras(int dias) {
        horas = dias * 24;
        return horas;
    }

    public static float semanasParaDias(int semanas) {
        dias = 7 * semanas;
        return dias;
    }

    public static float mesParaDias(int meses) {
        dias = meses * 30;
        return dias;
    }

    public static float anoParaDias(int anoss) {
        dias = 365 * anoss;
        return dias;
    }

}


