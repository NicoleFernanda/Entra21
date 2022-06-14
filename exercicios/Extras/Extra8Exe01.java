package extras;

public class Extra8Exe01 {
	public static void main(String[] args) {
		
		int cuboA[][][] = new int[10][3][5];
		int aleatorio = 1;
		int cuboB[][][] = new int[10][3][5];
		int cuboC[][][] = new int[10][3][5];
		
		for (int i = 0; i < cuboA.length; i++) {
			for (int j = 0; j < cuboA[i].length; j++) {
				for (int c = 0; c < cuboA[i][j].length; c++) {
					cuboA[i][j][c] = aleatorio;
					aleatorio++;
					cuboB[i][j][c] = aleatorio;
					aleatorio++;
					cuboC[i][j][c] = cuboA[i][j][c] + cuboB[i][j][c];
					System.out.print(cuboC[i][j][c] + "\t");
					
				}
				System.out.println();
			}
			System.out.println("\n\n");
		}
	
	
	
	
	
	
	}

}
