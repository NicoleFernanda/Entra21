package extras;

import java.util.Scanner;

public class Extra8Exe02 {
	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);

		int alunos = 1;

		int saida[] = new int[alunos];//notas
		String gabarito[] = {"a", "b", "c", "d", "e"};//0 a 4
		int g = 0;//0 a 4
		String entrada[][] = new String[alunos][6];//matricula +  5 respostas

		System.out.println();
		byte numeroQuestao = 1;
		int nota = 0;

		for (int i = 0; i < entrada.length; i++) {
			numeroQuestao = 1;
			g = 0;
			nota = 0;
			for (int j = 0; j < entrada[i].length; j++) {
				if (j == 0) {
					System.out.println("matricula so aluno [" + (i + 1) + "] : ");
					entrada[i][j] = tec.next();
				} else {
					System.out.println("sua resposta da questao [" + numeroQuestao + "]");
					entrada[i][j] = tec.next();
					numeroQuestao++;

					if (entrada[i][j].equalsIgnoreCase(gabarito[g])) {
						nota = nota + 2;
					}
					g++;
				}

			}

			saida[i] = nota;
			//System.out.println(nota);
			//System.out.println(saida[i]);
		}


		System.out.println("M \t1\t2\t3\t4\t5\tnota");
		for (int i = 0; i < entrada.length; i++) {
			for (int j = 0; j < entrada[i].length; j++) {
				System.out.print(entrada[i][j] + "\t");
			}

			System.out.print(saida[i]);
			System.out.println();
		}

		tec.close();

	}

}
