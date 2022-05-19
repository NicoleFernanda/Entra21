package lista6;

public class Exe17 {
	public static void main(String[] args) {
		
		double taxaa = 0.03;
		double taxab = 0.015;
		double popua = 80000;
		double popub = 200000;
		int anos = 0;
		
		for (int i = 1; i >= 1; i++) {
		
			if (popua >= popub) {
				System.out.println("vai levar " + anos + " anos para que a populacao A ultrapasse ou iguale a populacao B");
				break;
			} else {
				popua = (popua * taxaa) + popua;
				popub = (popub * taxab) + popub;
				anos++;
			}
		
		}
		
		
	
	}

}
