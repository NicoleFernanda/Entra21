package lista3;
import java.util.Scanner;

public class Exe01_ {

    boolean ligada;

    Scanner tec = new Scanner(System.in);
    
    Exe01_(boolean ligada) {

        //this.ligada = ligada;

        if (ligada == true) {
            System.out.println("luz ligada");
        } else {
            System.out.println("luz desligada");
        }

    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public void desligar(boolean ligada) {
        
        if (ligada == true) {
            System.out.println("luz foi desligada");
            this.ligada = false;
        } else {
            System.out.println("a luz ja esta desligada");
        }

        //return ligada;
        
    }

    public void ligar(boolean ligada) {
        
        if (ligada == false) {
            System.out.println("luz foi ligada");
            this.ligada = true;
        } else {
            System.out.println("a luz ja esta ligada");
        }

        
        //return ligada;

        
    }
    
}
