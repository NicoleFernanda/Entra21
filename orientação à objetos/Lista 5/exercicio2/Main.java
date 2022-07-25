package lista5.exercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner read = new Scanner(System.in);
		
		byte opcao = 0;
		
		do {
			
			System.out.println("\t\nMenu de opcoes:");
			System.out.println("\t  1 - adicionar aluno");
			System.out.println("\t  2 - adicionar professor");
			System.out.println("\t  3 - adicionar tecnico");
			System.out.println("\t  4 - sair");
			System.out.print("opcao : ");
			opcao = read.nextByte();
			
			switch (opcao) {
			case 1:
				
				Aluno alu = new Aluno();
				System.out.println();
				alu.recebAluno();
				alu.mostraAluno();
				
				break;
				
			case 2:
				
				Professor prof = new Professor();
				System.out.println();
				prof.recebProf();
				prof.mostrarProf();
				opcao = 0;
				
				break;
			
			case 3:
				
				Tecnico tec = new Tecnico();
				System.out.println();
				tec.recebTec();
				tec.mostrarTec();
				opcao = 0;
	
				break;

			default:
				
				if (opcao != 4) {
					System.out.println("opcao invalida, insira novamente:");
				}
				
				break;
			}
			
		} while (opcao != 4);//ou qualquer numero que resolver ser o de saida
		
		
		read.close();
		
	}

}
