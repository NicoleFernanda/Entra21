package lista2;

import java.util.Scanner;

public class Exe06_JogoArrumado {
	
	Scanner tec = new Scanner(System.in);
	
	char jogo[][] = new char[3][3];
	byte contador = 2;
    char jogada;
    char simbolo;
    boolean valida = false;
    boolean ganhou = false;
    byte ganhador = 0; //jogador 1 ou 2;
    byte velha = 1;
	
	void mapa() {
		jogo[0][0] = '1'; jogo[0][1] = '2'; jogo[0][2] = '3';
        jogo[1][0] = '4'; jogo[1][1] = '5'; jogo[1][2] = '6';
        jogo[2][0] = '7'; jogo[2][1] = '8'; jogo[2][2] = '9';
	}
	
	void imprime() {
        System.out.println("-------------");
        
        for (int i = 0; i < jogo.length; i++) {
            System.out.print("| ");

            for (int j = 0; j < jogo[i].length; j++) {
                System.out.print(jogo[i][j] + " " + "|" + " ");
            }
            
            System.out.println();
        }

        System.out.println("-------------");
	}
	
	void jogar() {
		
		while (true) {

            if (ganhou == true) {
                System.out.println("jogador [" + ganhador + "] ganhou!");
                break;
            }

            valida = false;
			System.out.print("vez do ");
        	if (contador % 2 == 0) {//1
				System.out.println("jogador 1 : ");
				jogada = tec.next().charAt(0);
				simbolo = 'X';
			} else {//2
				System.out.println("jogador 2 : ");
				jogada = tec.next().charAt(0);
				simbolo = 'O';
			}
		
        	for (int i = 0; i < jogo.length; i++) {//3/3
				if (valida == true) {
                    break;
                }
        		for (int j = 0; j < jogo.length; j++) {//2/3
					
        			if (jogo[i][j] == jogada) {//valido ; contador++
        				jogo[i][j] = simbolo;
        				System.out.println("-------------");
        
                        for (int k = 0; k < jogo.length; k++) {
                            System.out.print("| ");

                            for (int h = 0; h < jogo[k].length; h++) {
                                System.out.print(jogo[k][h] + " " + "|" + " ");
                            }      
            
                            System.out.println();
                        }

                    System.out.println("-------------");
        				
        				valida = true;
        				contador++;
        				break;
						
					} else {//jogue novamente
						valida = false;
					}
				
        		
        		
        		}//fim for 2/3
        		
			}//fim for 3/3
        
        
        	if (valida == false) {
        		System.out.println("jogada invalida");
        	}

            if (jogo[0][0] == jogo[0][1]  && jogo[0][0] == jogo[0][2]) {
                ganhou = true;
                if (jogo[0][0] == 'X') {
                    ganhador = 1;//jogador 1
                } else if (jogo[0][0] == 'O'){
                    ganhador = 2;
                }

            } else if (jogo[1][0] == jogo[1][1]  && jogo[1][0] == jogo[1][2]){
                ganhou = true;
                if (jogo[1][0] == 'X') {
                    ganhador = 1;//jogador 1
                } else if (jogo[1][0] == 'O'){
                    ganhador = 2;
                }

            } else if (jogo[2][0] == jogo[2][1]  && jogo[2][0] == jogo[2][2]){
                ganhou = true;
                if (jogo[2][0] == 'X') {
                    ganhador = 1;//jogador 1
                } else if (jogo[2][0] == 'O'){
                    ganhador = 2;
                }

            } else if (jogo[0][0] == jogo[1][0]  && jogo[0][0] == jogo[2][0]){
                ganhou = true;
                if (jogo[1][0] == 'X') {
                    ganhador = 1;//jogador 1
                } else if (jogo[1][0] == 'O'){
                    ganhador = 2;
                }

            } else if (jogo[0][1] == jogo[1][1]  && jogo[0][1] == jogo[2][1]) {
                ganhou = true;
                if (jogo[1][0] == 'X') {
                    ganhador = 1;//jogador 1
                } else if (jogo[1][0] == 'O'){
                    ganhador = 2;
                }

            } else if (jogo[0][2] == jogo[1][2]  && jogo[1][2] == jogo[2][2]) {
                ganhou = true;
                if (jogo[1][0] == 'X') {
                    ganhador = 1;//jogador 1
                } else if (jogo[1][0] == 'O'){
                    ganhador = 2;
                }

            } else if (jogo[0][0] == jogo[1][1]  && jogo[1][1] == jogo[2][2]) {
                ganhou = true;
                if (jogo[1][0] == 'X') {
                    ganhador = 1;//jogador 1
                } else if (jogo[1][0] == 'O'){
                    ganhador = 2;
                }
            } else if (jogo[0][2] == jogo[1][1]  && jogo[0][2] == jogo[2][0]) {
                ganhou = true;
                if (jogo[1][0] == 'X') {
                    ganhador = 1;//jogador 1
                } else if (jogo[1][0] == 'O'){
                    ganhador = 2;
                }
            } else if (velha == 10) {
                System.out.println("EMPATOU");
                break;
            } else {
                ganhou = false;
            }
            
            velha++;
	
		}//fim while

	}

}
