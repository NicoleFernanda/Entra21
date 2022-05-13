//O salario líquido correspondeao salário bruto menos os descontos
// O programa deverápedir ao usuário o valor da sua hora e a quantidade de horas 
//trabalhadas no mês
package extras;
import java.util.Scanner;

public class Exe05 {
	public static void main(String[] args) {
		double inss, ir = 0, fgts, totaldescontos, salarioliquido, salariobruto;
		
		Scanner tec = new Scanner(System.in);
		System.out.println("valor de sua hora: ");
		double valorHora = tec.nextDouble();
		System.out.println("quantidade de horas trabalhadas no mes: ");
		double horasTrabalhadas = tec.nextDouble();
		
		salariobruto = horasTrabalhadas * valorHora; 
		
		if (salariobruto <= 900) {
			ir = 0;
		} else if (salariobruto > 900 && salariobruto <= 1500) {
			ir = 0.05;
		} else if (salariobruto > 1500 && salariobruto < 2500) {
			ir = 0.1;
		} else if (salariobruto >= 2500) {
			ir = 0.2;
		}
		
		
		System.out.println("salario bruto = " + salariobruto);
		System.out.println("(-) IR " + "(" +(ir)+ "%) = " + (ir * salariobruto));
		
		ir = ir * salariobruto;
		inss = salariobruto * 0.1;
		totaldescontos = ir + inss;
		salarioliquido = salariobruto - totaldescontos;
		
		System.out.println("(-) INSS (10%) = " + inss);
		System.out.println("total de descontos = " + totaldescontos);
		System.out.println("salario liquido = " + salarioliquido);

		
		
		tec.close();
	}

}
