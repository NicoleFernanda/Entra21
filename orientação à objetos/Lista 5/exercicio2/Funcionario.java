package lista5.exercicio2;

import java.util.Scanner;

public abstract class Funcionario {
	
	Scanner read = new Scanner(System.in); 
	protected String nome;
	protected String telefone;
	protected String endereco;
	protected String cpf;
	protected String ctps;
	protected double salario;
	
	public Funcionario() {
		
	}

	public void receber() {
				
		System.out.println("~~ Criacao de Funcionario ~~ ");
		System.out.println();
		System.out.println("Nome do funcionario : ");
		this.nome = read.next();
		System.out.println("Insira o endereco (cidade): ");
		this.endereco = read.next();
		System.out.println("Insira o CPF : ");
		this.cpf = read.next();
		System.out.println("Insira o telefone : ");
		this.telefone = read.next();
		System.out.println("Insira seu CTPS");
		this.ctps = read.next();
		System.out.println("Insira seu salario : ");
		this.salario = read.nextDouble();
		
	}
	
	protected abstract double calcularSalario();
	
	public void mostrar() {

		System.out.println("Endereco:\t" + this.endereco + "\nTelefone:\t" + this.telefone + "\nCPF:\t\t" + this.cpf + "\nCTPS:\t\t" + this.ctps);
	}

}
