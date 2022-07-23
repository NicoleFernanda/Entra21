package lista3;

import java.util.Scanner;

public class Exe03_ {
    
    Scanner tec = new Scanner(System.in);
    
    String nome;
	String curso;
	int matricula;
	String materias[] = new String[3];
	int quantidade = 10;//quantas notas por materia
	float notas[][] = new float[materias.length][quantidade];//tres linhas, com a quantidade notas.
	float media[] = new float[materias.length];


    Exe03_(){
        
    }

    public void materias() {
		System.out.println("\nentre com o nome de tres materias do curso [" + (this.curso) + "]");
		for (int i = 0; i < materias.length; i++) {
			System.out.println("materia  [" + (1 + i)+ "]");
			this.materias[i] = tec.next();
		}
	}

    public void notasPorMateria() {
		System.out.println("quantidade de notas por materia: ");
		this.quantidade = tec.nextInt();
	}

    public void calculoMedia() {
		
		float soma = 0;
		
		for (int i = 0; i < notas.length; i++) {
			
			soma = 0;
			
			for (int j = 0; j < quantidade; j++) {
				System.out.println("nota ["+ (j+1) + "/" + quantidade +"] da materia [" + materias[i] + "]");
				this.notas[i][j] = tec.nextFloat();
				soma = soma + notas[i][j];
			}
		
			this.media[i] = soma/this.quantidade;
			
		}
		
	}

    public void imprimir() {
		
		System.out.println();
		
		for (int i = 0; i < materias.length; i++) {
            
            System.out.println(this.materias[i]);

            for (int j = 0; j < this.quantidade; j++) {
                System.out.println("nota [" + (j + 1) + "]:\t" + this.notas[i][j]);

            }
            
            System.out.print("media:       ");
            System.out.println(this.media[i]);
            
            System.out.print("situação:\t");
            if (this.media[i] >= 7) {
				System.out.println("APROVADO");
			} else {
				System.out.println("REPROVADO");
			}

            System.out.println("-------------------");
        
        }
        
	
	}


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCurso() {
        return curso;
    }


    public void setCurso(String curso) {
        this.curso = curso;
    }


    public int getMatricula() {
        return matricula;
    }


    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }


    public String[] getMaterias() {
        return materias;
    }


    public void setMaterias(String[] materias) {
        this.materias = materias;
    }


    public int getQuantidade() {
        return quantidade;
    }


    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


    public float[][] getNotas() {
        return notas;
    }


    public void setNotas(float[][] notas) {
        this.notas = notas;
    }


    public float[] getMedia() {
        return media;
    }


    public void setMedia(float[] media) {
        this.media = media;
    }

    
}
