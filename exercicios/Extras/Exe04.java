/*
 Fa�a um programa com 5 perguntas para uma pessoa sobre um crime.
 As perguntas s�o:
 a-Telefonou para a v�tima?
 b-Esteve nolocal do crime?
 c-Mora perto da vitima?
 d-Devia para vitima?
e-J� trabalhou com a vitima?
O programa deve no final emitir uma classifica��o  sobre a participa��o  da pessoa no crime. 
Se a pessoa responder positivamente a 2 quest�es,ela deve ser Classificada como �Suspeita�, 
entre 3 e 4 como �C�mplice� e 5  como �Assassino�. 
Caso  contrario , ele ser� classificado como �Inocente 
  
 */


package extras;
import java.util.Scanner;

public class Exe04 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int verdadeiras = 0;
		System.out.println("Telefonou para a v�tima?");
		char a = tec.next().charAt(0);
		a = Character.toLowerCase(a);
		
		if (a == 's') {
			verdadeiras++;
		}
		
		System.out.println("Esteve no local do crime?");
		char b = tec.next().charAt(0);
		b = Character.toLowerCase(b);
		
		if (b == 's') {
			verdadeiras++;
		}
		
		System.out.println("Mora perto da vitima?");
		char c = tec.next().charAt(0);
		c = Character.toLowerCase(c);
		
		if (c == 's') {
			verdadeiras++;
		}
		
		System.out.println("Devia para vitima?");
		char d = tec.next().charAt(0);
		d = Character.toLowerCase(d);
		
		if (d == 's') {
			verdadeiras++;
		}
		
		System.out.println("J� trabalhou com a vitima?");
		char e = tec.next().charAt(0);
		e = Character.toLowerCase(e);
		
		if (e == 's') {
			verdadeiras++;
		}
		
		
		if (verdadeiras == 2) {
			System.out.println("suspeita");
		} else if (verdadeiras == 3 || verdadeiras == 4) {
			System.out.println("cumplice");
		} else if (verdadeiras == 5) {
			System.out.println("assassino");
		} else if (verdadeiras == 1 || verdadeiras == 0) {
			System.out.println("inocente");
		}

		
		
		tec.close();
	}

}
