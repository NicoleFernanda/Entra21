package lista2;

import java.util.Scanner;

public class Exe01_LigarDesligar {
	
	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		Exe01_Lampada primeira = new Exe01_Lampada();
		System.out.println("luz ligada ou desligada?    1 - sim    0 - nao");
		primeira.sim = tec.nextByte();
		
		//primeira.ligar();
		
		
		byte opcao = 0;
		tec.close();
		
		while (opcao == 0) {
			
			System.out.println("\nescolha:");
			System.out.println("1 - ligar luz \n2 - desligar luz \n3 - verificar estado \n4 - mudar estado \n5 - sair");
			opcao = tec.nextByte();
			
			switch (opcao) {
			case 1:
				primeira.ligar();
				
				break;
				
			case 2:
				primeira.desligar();
				
				break;

				
			case 3:
				primeira.verificarEstado();
				
				break;

	
			case 4:
				System.out.println(primeira.mudarEstado());
					
				break;


			default:
				System.out.println("opcao invalida");
				break;
			}
		
		
		}
		
		
		
		
		
		
		/*while (true) {
			if (primeira.ligar()) {
				System.out.println("ligada");
				primeira.sim--;
			} else {
				System.out.println("desligada");
				primeira.sim++;
			}

		}*/		
		
		

		
		/*Scanner tec = new Scanner(System.in);
		int entrada = tec.nextInt(); 
		tec.close();
		
		while (true) {
			if (entrada == 1) {
				System.out.println("ligada");
				entrada--;
			} else if (entrada == 0) {
				System.out.println("desligada");
				entrada++;
			}

		}
		
		*/
		
		
	
	}

}
