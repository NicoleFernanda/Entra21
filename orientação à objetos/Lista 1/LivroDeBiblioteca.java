package lista1;

import java.util.Scanner;

public class LivroDeBiblioteca {
	
	public static void main(String[] args) {
	
		Scanner tec = new Scanner(System.in);
		
		Livros terceiro = new Livros();
		
		System.out.print("nome do livro : ");
		terceiro.nome = tec.nextLine();
		
		System.out.print("\nidioma do livro : ");
		terceiro.idioma = tec.next();
		
		System.out.print("\nquantidade de paginas do livro : ");
		terceiro.paginas = tec.nextInt();
		
		System.out.print("\nquantas vezes o livro foi alugado : ");
		terceiro.vezesAlugado = tec.nextInt();
		
		System.out.print("\ncadastro do leitor : ");
		terceiro.cadastroDoLeitor = tec.next();
		
		System.out.println("\nlivro alugado ao cadastro [" + terceiro.cadastroDoLeitor + "]");
		
		tec.close();
		
	}

}
