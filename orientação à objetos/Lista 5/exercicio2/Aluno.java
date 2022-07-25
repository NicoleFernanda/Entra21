package lista5.exercicio2;

import java.util.Scanner;

public class Aluno extends Curso {
	
	Scanner tec = new Scanner(System.in);
	private String nome;
	private int matricula;
	private int cpf;
	
	public Aluno() {
		
	}
	
	public void recebAluno() {
		
		System.out.println("~ Aluno ~");
		System.out.println("nome do aluno: ");
		nome = tec.next();
		System.out.println("codigo de matricula do aluno: ");
		matricula = tec.nextInt();
		System.out.println("cpf do aluno: ");
		cpf = tec.nextInt();
		
		recebCurso();
	}
	
	public void mostraAluno() {
		
		System.out.println("----------------------------");
		System.out.println("nome: \t\t" + nome);
		System.out.println("matricula:\t" + matricula);
		System.out.println("cpf: \t\t" + cpf);
		
		mostraCurso();
		System.out.println("----------------------------");
		
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	
	
}