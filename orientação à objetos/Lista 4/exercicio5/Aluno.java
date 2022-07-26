package lista4.exercicio5;

import java.util.Scanner;

public class Aluno {

	private int quantAlunos = 5;
	private int quantNotas = 4;
	protected String nomeEmatricula[][] = new String[quantAlunos][2];
	protected float notas[][] = new float [quantNotas][quantAlunos];
	
	Scanner tec = new Scanner(System.in);
	
	public void cadastrarAlunos () {
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("nome do aluno [" + (i + 1) + "/5]");//aluno 0 = aluno 1/5 (aluno 1 de cinco alunos)
			
			nomeEmatricula[i][0] = tec.next();
			
			System.out.println("matricula do aluno [" + (i + 1) + "/5]");
			nomeEmatricula[i][1] = tec.next();
			
			for (int j = 0; j < notas[i].length; j++) {
				System.out.println("nota [" + (j + 1) + "]");
				notas[i][j] = tec.nextFloat();
				
				while (notas[i][j] > 10 || notas[i][j] < 0) {
					System.out.println("nota nao existe, insira novamente sua nota");
					notas[i][j] = tec.nextFloat();
				}
				//while (notas[i][j] > 10 || notas[i][j] < 0)
				//System.out.println("nota nao existe, insira novamente sua nota");
				//notas[i][j] = tec.nextFloat();
			
			}
		
		}
		
	
	
	}
	
	public void imprimirAlunos() {
		
		float media;
		float soma = 0;
		
		System.out.println("----------------------------------------------------");
		
		for (int i = 0; i < notas.length; i++) {
			
			System.out.println("aluno(a) [" + nomeEmatricula[i][0].toUpperCase() + "] com matricula [" + nomeEmatricula[i][1] + "]");
			System.out.println();
			soma = 0;
			
			for (int j = 0; j < quantAlunos; j++) {
				System.out.println("nota [" + (j + 1) + "]: \t" + notas[i][j]);
				soma = soma + notas[i][j];
			}
			media = soma / 5;
			
			System.out.println("media = " + media);
			
			if (media >= 7) {
				System.out.println("APROVADO");
			} else {
				System.out.println("REPROVADO");
			}
			
			System.out.println("----------------------------------------------------");

		}
	
	}

	public int getQuantAlunos() {
		return quantAlunos;
	}

	public void setQuantAlunos(int quantAlunos) {
		this.quantAlunos = quantAlunos;
	}

	public int getQuantNotas() {
		return quantNotas;
	}

	public void setQuantNotas(int quantNotas) {
		this.quantNotas = quantNotas;
	}

	public String[][] getNomeEmatricula() {
		return nomeEmatricula;
	}

	public void setNomeEmatricula(String[][] nomeEmatricula) {
		this.nomeEmatricula = nomeEmatricula;
	}

	public float[][] getNotas() {
		return notas;
	}

	public void setNotas(float[][] notas) {
		this.notas = notas;
	}
	
	
	
}
