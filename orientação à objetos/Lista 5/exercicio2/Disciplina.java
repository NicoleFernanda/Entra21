package lista5.exercicio2;

import java.util.Scanner;

public class Disciplina {
	
	Scanner tec = new Scanner(System.in);
	
	private int codigo;
	private int carga_Hora;
	private int v1 = 30;//quantidade de materias (tive que iniciar com um numero)
	private int v2 = 3;//codigo e carga horaria de cada materia + nome de cada materia
	private String disciplinas[][] = new String[v1][v2];
	
	public void recebDisciplia() {
		
		System.out.println("quantidade de disciplinas do seu curso : ");
		v1 = tec.nextInt();
		
		for (int i = 0; i < v1; i++) {//seria o v1
			System.out.println("nome da disciplina [" + (i + 1) + "]");
			disciplinas[i][0] = tec.next();
			System.out.println("codigo da disciplina [" + disciplinas[i][0] + "]");
			disciplinas[i][1] = tec.next();
			System.out.println("carga horaria da disciplina [" + disciplinas[i][0] + "]");
			disciplinas[i][2] = tec.next();
		}
		
	}
	
	public void mostrarDisciplinas() {
		
		System.out.println("\t\t --");
		
		for (int i = 0; i < v1; i++) {
			
			System.out.println("materia:\t" + disciplinas[i][0]);
			System.out.println("codigo: \t" + disciplinas[i][1]);
			System.out.println("carga horaria:\t" + disciplinas[i][2] + " horas");
			
			System.out.println("\t\t --\n");
			
		}
		
		
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getCarga_Hora() {
		return carga_Hora;
	}
	public void setCarga_Hora(int carga_Hora) {
		this.carga_Hora = carga_Hora;
	}
	public String[][] getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(String disciplinas, int v1, int v2) {
		this.disciplinas[v1][v2] = disciplinas;
	}
	
	
	

}
