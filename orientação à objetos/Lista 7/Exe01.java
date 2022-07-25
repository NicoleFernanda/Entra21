package lista7;

public class Exe01 {
	
	static int array [] = new int [10];
	
	public static void main(String[] args) {
	
		System.out.println("\t\t--- inicio do main ---");
		metodo1();
		System.out.println("metodo imprime:");
		imprime();
		System.out.println("\n\t\t--- fim do main ---");
	}
	
	static void metodo1() {
		System.out.println("\t--inicio do metodo 1--");
		metodo2();
		System.out.println("\t--fim do metodo 1--");
	}
	
	static void metodo2() {
		System.out.println("\n-inicio do metodo 2-");
		
		
		for (int i = 0; i <= 15 ; i++) {
			
			try {
				array[i] = i;
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("ESTOURO DE ARRAY");
				break;
			}
		}
		//execao
		System.out.println("-fim do metodo 2-\n");
	}
	
	static void imprime() {
		
		for (int i = 0; i < 10; i++) {
			System.out.print(array[i] + "\t");
		}
	}

}
