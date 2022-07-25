package lista5.exercicio2;

import java.util.Scanner;

public class Professor extends Funcionario{
	
	Scanner read = new Scanner(System.in); 
	private String titulo;
	private String area;
	private double retribTitulacao;
	private double valorDedicacao;
	private double salProf;
	
	public Professor() {
	
	}
	
	
	public void recebProf() {
		
		receber();
		System.out.println("Insira seu titulo : ");
		this.titulo = read.next();
		System.out.println("Insira sua area de ensino : ");
		this.area = read.next();
		System.out.println("valor da retribuicao de titulo : ");
		this.retribTitulacao = read.nextDouble();
		System.out.println("valor de dedicacao : ");
		this.valorDedicacao = read.nextDouble();
		
		
		
		//read.close();
		
	}
	
	@Override
	protected double calcularSalario() {
		salProf = salario + valorDedicacao + retribTitulacao;
		//System.out.println(salProf + "           " + valorDedicacao + "           " + retribTitulacao);
		return salProf;
	}
	
	public void mostrarProf() {
		
		System.out.println("----------------------------");
		System.out.println("Professor(a) [" + nome.toUpperCase() + "]");
		mostrar();//para tentar imprimir endereco, cpf, ctps, blablabla sem ter que pedir aqui
		System.out.println("Titulo:\t\t" + this.titulo + "\nArea de Ensino:\t" + this.area + "\nSalario:\t" + calcularSalario());//salProf ou chamar o metodo?
		System.out.println("----------------------------");
	}


	
	
}
