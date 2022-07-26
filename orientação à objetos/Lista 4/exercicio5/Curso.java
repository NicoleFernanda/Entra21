package lista4.exercicio5;

public class Curso {
	
	protected String nomeCurso;
	protected int cargaHoraria;
	
	public Curso () {
		
	}
	
	public void cadastrarCurso (String nomeCurso, int cargaHoraria) {
		this.nomeCurso = nomeCurso;
		this.cargaHoraria = cargaHoraria;
	}
	
	public void imprimirCurso() {
		System.out.println("\t- Curso de [" + nomeCurso.toUpperCase() + "] - ");
		System.out.println("carga horaria do curso: " + cargaHoraria + " horas");
	}
	
	
	
	
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	
}
