package lista2;

import java.util.Scanner;

public class Exe03_Aluno {
	String nome;
	String curso;
	int matricula;
	
	Scanner tec = new Scanner(System.in);
	
	String materias[] = new String[3];
	int quantidade = 1000;//quantas notas por materia
	float notas[][] = new float[materias.length][quantidade];//tres linhas, com a quantidade notas.
	float media[] = new float[materias.length];

	
	void materias() {
		
		System.out.println("\nentre com o nome de tres materias");
		for (int i = 0; i < materias.length; i++) {
			System.out.println("materia  [" + (1 + i)+ "]");
			materias[i] = tec.next();
		}
	}
	

	int notasPorMateria() {
		
		System.out.println("quantidade de notas por materia: ");
		quantidade = tec.nextInt();
		//notas[materias.length][quantidade] = 0;
		return quantidade;
	}

	void calculoMedia() {
		
		float soma = 0;
		
		for (int i = 0; i < notas.length; i++) {
			
			soma = 0;
			
			for (int j = 0; j < quantidade; j++) {
				System.out.println("nota ["+ (j+1) + "/" + quantidade +"] da materia [" + materias[i] + "]");
				notas[i][j] = tec.nextFloat();
				soma = soma + notas[i][j];
			}
		
			media[i] = soma/quantidade;
			
		}
		
	}
	
	void imprimir() {
		
		System.out.println();
		
		for (int i = 0; i < materias.length; i++) {
			System.out.print(materias[i] + "\t\tmedia = " + media[i]);
			
			if (media[i] >= 7) {
				System.out.println("\t\tAPROVADO");
			} else {
				System.out.println("\t\tREPROVADO");
			}
				
		}
	
	}


}
