package lista5.exercicio2;

import java.util.Scanner;

public class Curso extends Disciplina {
	
	Scanner tec = new Scanner(System.in);
	private int codigo;
	private int duracao;
	protected String nomeCurso;
	
	public Curso() {
		
	}

	public Curso(int codigo, int duracao, String nomeCurso) {
		super();
		this.codigo = codigo;
		this.duracao = duracao;
		this.nomeCurso = nomeCurso;
	}
	
	public void recebCurso() {
		
		System.out.println("~ Curso ~");
		System.out.println("codigo do curso:");
		codigo = tec.nextInt();
		System.out.println("nome do curso: ");
		nomeCurso = tec.next();
		System.out.println("duracao do curso (horas totais) :");
		duracao = tec.nextInt();
		
		recebDisciplia();
		
		//todo curso tem disciplinas
	}
	
	public void mostraCurso() {
		
		System.out.println("curso: \t\t" + nomeCurso);
		System.out.println("codigo: \t" + codigo);
		System.out.println("duracao:\t" + duracao + " horas");
		
		System.out.println("\n\t - disciplinas:");
		mostrarDisciplinas();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	

}
