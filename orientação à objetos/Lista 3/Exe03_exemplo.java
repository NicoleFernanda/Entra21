package lista3;

import java.util.Scanner;

public class Exe03_exemplo {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        Exe03_ aluno = new Exe03_();
        
        System.out.println("nome do aluno");
        aluno.setNome(t.next());
        System.out.println("matricula do aluno");
        aluno.setMatricula(t.nextInt());
        System.out.println("curso do aluno");
        aluno.setCurso(t.next());
        
        

        aluno.notasPorMateria();
        aluno.materias();

        aluno.calculoMedia();
        aluno.imprimir();


        t.close();

    }
    
}
