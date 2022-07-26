package lista4.exercicio5;

import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		String info, prof, depart, email;
		int tempo;
		
		Curso novoCurso = new Curso();
		Professor novoProf = new Professor();
		Aluno novosAlunos = new Aluno();
		
		System.out.print("nome do curso: ");
		info = tec.next();
		System.out.print("carga horaria total do curso: ");
		tempo = tec.nextInt();
		
		novoCurso.cadastrarCurso(info, tempo);
		////////
		
		System.out.print("\nnome do professor: ");
		prof = tec.next();
		System.out.print("departamento do professor: ");
		depart = tec.next();
		System.out.print("email do professor: ");
		email = tec.next();
		System.out.println();
		
		novoProf.cadastrarProf(prof, depart, email);
		////////
		
		novosAlunos.cadastrarAlunos();
		
		novoCurso.imprimirCurso();
		System.out.println();
		novoProf.imprimirProf();
		System.out.println();
		novosAlunos.imprimirAlunos();
		
		tec.close();
		
	}
}
