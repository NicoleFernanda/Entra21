//package lista3;

import java.util.Scanner;

public class Exe06_ {
	
    static char jogo[][] = new char[3][3];
    byte contador = 2;
    char jogada;
    char simbolo;
    boolean valida = false;
    boolean ganhou = false;
    byte ganhador = 0; //jogador 1 ou 2;
    byte velha = 1;
    Scanner tec = new Scanner(System.in);
    
    Exe06_() {
        preencherMapa(jogo);
    }

    public void preencherMapa(char jogo[][]){
        jogo[0][0] = '1'; jogo[0][1] = '2'; jogo[0][2] = '3';
        jogo[1][0] = '4'; jogo[1][1] = '5'; jogo[1][2] = '6';
        jogo[2][0] = '7'; jogo[2][1] = '8'; jogo[2][2] = '9';
    }

    public void imprime() {
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


	public void jogar() {
		
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

    public char[][] getJogo() {
        return jogo;
    }

    public void setJogo(char[][] jogo) {
        this.jogo = jogo;
    }

    public byte getContador() {
        return contador;
    }

    public void setContador(byte contador) {
        this.contador = contador;
    }

    public char getJogada() {
        return jogada;
    }

    public void setJogada(char jogada) {
        this.jogada = jogada;
    }

    public char getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(char simbolo) {
        this.simbolo = simbolo;
    }

    public boolean isValida() {
        return valida;
    }

    public void setValida(boolean valida) {
        this.valida = valida;
    }

    public boolean isGanhou() {
        return ganhou;
    }

    public void setGanhou(boolean ganhou) {
        this.ganhou = ganhou;
    }

    public byte getGanhador() {
        return ganhador;
    }

    public void setGanhador(byte ganhador) {
        this.ganhador = ganhador;
    }

    public byte getVelha() {
        return velha;
    }

    public void setVelha(byte velha) {
        this.velha = velha;
    }


    

}

