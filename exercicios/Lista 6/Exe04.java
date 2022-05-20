package lista6;

import java.util.Scanner;

public class Exe04 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("quantas pessoas pesquisadas: ");
		int n = tec.nextInt();
		byte sexo;
		double altura, alturasF = 0, alturasM = 0, menor = 0, maior = 0;
		int homens = 0, mulheres = 0;
		
		for (int i = 1; i <= n; i++) {
			System.out.println("sexo:         0 - masc / 1 -fem         ["+i+"]");
			sexo = tec.nextByte();
			System.out.println("altura:                                 ["+i+"]");
			altura = tec.nextDouble();
			
			if (sexo == 0) {
				homens++;
				alturasM += altura;
			} else if (sexo == 1) {
				mulheres++;
				alturasF += altura;
			}
			
			if (i == 1) {
				menor = altura;
				maior = altura;
			}
			
			if (altura > maior) {maior = altura;}
			else if (altura < menor) {menor = altura;}
		
		}
		double somaalturas = alturasF + alturasM;
		int popu = homens + mulheres;
		System.out.println("maior altura = " + maior + "\nmenor altura = " + menor);
		System.out.println("media de altura da populacao = " + (somaalturas / popu));
		System.out.println("media de alturas dos homens = " + (alturasM/homens));
		System.out.println("percentual de homens na populacao = " + (homens * 100/popu) + "%");
		tec.close();
	}

}
