package lista7;

public class Exe18 {
	public static void main(String[] args) {
		
		int vetorx[] = new int[10];
		int fator = 2;
		int j = 100;
		for (int i = 0; i < vetorx.length; i++) {
			fator = 2;
			for (; j >= 100;) {
				j++;
				if (j == fator){
					vetorx[i] = j;
					break;
				}else if (j % fator == 0 ) {
					fator = 2;
				} else {
					fator++;
					j--;
					continue;
				}
			
			}
		}
		
		for (int i = 0; i < vetorx.length; i++) {
			System.out.println("["+ (i+1) + "]" +"\t" + vetorx[i]);
		}
	
	
	}

}
