package lista8;

import java.util.Scanner;

public class Exe04 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		String agenda [][] = new String [31][24];//
		byte opcao = 0;
		byte dia = 0;//coluna 0
		byte hora;//coluna 1
		String compromisso = "";//coluna 2
		
		while (true) {
			System.out.println("digite \n1 - agendar compromisso \n2 - consultar \n3 - finalizar");
			opcao = tec.nextByte();
			
			
			if (opcao == 1) {
				System.out.println("escolha o dia (1 a 31): ");
				dia = tec.nextByte();
				dia--;
				
				
				System.out.println("digite o horario desejado (0h - 23h) :");
				hora = tec.nextByte();
					
				System.out.println("digite seu compromisso: \n");
				compromisso = tec.next();
					
				agenda[dia][hora] = compromisso;
						
			
			} else if (opcao == 2) {
				System.out.println("digite o dia do agendamento : ");
				dia = tec.nextByte();
				dia--;
				
				System.out.println("digite o horario do agendamento :");
				hora = tec.nextByte();
				
				System.out.println("compromisso : [" + agenda[dia][hora] + "]\n");
								
				
			} else if (opcao == 3) {
				break;
			} else {
				System.out.println("opcao nao identificada, digite novamente");
			}
		
			//tec.close();
		
		}
		
		
	}

}
