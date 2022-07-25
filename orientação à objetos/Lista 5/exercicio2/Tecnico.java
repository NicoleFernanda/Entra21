package lista5.exercicio2;

import java.util.Scanner;

public class Tecnico extends Funcionario {
	
	Scanner read = new Scanner(System.in); 
	private String cargo;
	private String departamento;
	private double auxTransporte;
	private double auxAlimentacao;
	private double salTec;
	
	public Tecnico() {
		
	}
	
	public Tecnico(String cargo, String departamento, double auxTransporte, double auxAlimentacao) {
		
	}
	
	
	public void recebTec() {
		
		
		receber();
		
		System.out.println("Insira seu cargo : ");
		this.cargo = read.next();
		System.out.println("Insira seu departamento : ");
		this.departamento = read.next();
		
		System.out.println("valor do auxulio alimentacao : ");
		this.auxAlimentacao = read.nextDouble();
		System.out.println("valor do auxulio transporte : ");
		this.auxTransporte = read.nextDouble();
		
		System.out.println("faz hora extra ? (s = sim / n = nao)");
		char resposta = read.next().charAt(0);
		resposta = Character.toLowerCase(resposta);
		
		if (resposta == 's') {
			System.out.println("quantidade de horas extras trabalhadas: ");
			int horas = read.nextInt();
			System.out.println("valor por hora trabalhada: ");
			double valor = read.nextDouble();
			
			calcularSalario(horas, valor);
		} else {
			calcularSalario();//calcular salario padrao
		}
		
		
	}

	@Override
	protected double calcularSalario() {
		salTec = salario + auxTransporte + auxAlimentacao;
		return salTec;
	}
	
	
	protected double calcularSalario(int quantHoras, double valorHora) {
		salTec = salario + auxTransporte + auxAlimentacao + (quantHoras * valorHora);
		return salTec;
	}
	
	public void mostrarTec() {
		System.out.println("----------------------------");
		System.out.println("Tecnico(a) [" + nome.toUpperCase() + "]");
		mostrar();
		System.out.println("Cargo:\t\t" + this.cargo + "\nDepartamento:\t" + this.departamento + "\nSalario:\t" + salTec);//salTec ou chamar o metodo?
		System.out.println("----------------------------");
	}

	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public String getDepartamento() {
		return departamento;
	}


	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	
	

}
