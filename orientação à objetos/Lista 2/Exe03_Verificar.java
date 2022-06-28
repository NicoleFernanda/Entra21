package lista2;

import java.util.Scanner;

public class Exe03_Verificar {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		Exe03_Aluno carlos = new Exe03_Aluno();
		
		System.out.print("nome do aluno: ");
		carlos.nome = tec.nextLine();
		
		System.out.print("codigo de matricula do aluno: ");
		carlos.matricula = tec.nextInt();
		
		System.out.print("curso: ");
		carlos.curso = tec.next();
		
		System.out.println();
		
		carlos.materias();
		carlos.notasPorMateria();
		carlos.calculoMedia();
		carlos.imprimir();
		
		
		tec.close();
		
		
	}

}
