package sala;

public class OperadorTernario {
	public static void main(String[] args) {
		/*double salario = 1000;
		String b;
		
		(b) = (salario > 1000) ? "bonus de 10% \nsalario: 1100 reais" : "bonus de 15% \nsalario: 1150 reais";
		System.out.println(b);
		*/
		
		int a = 12; 
		String b;
		
		b = (a == 5) ? "a � igual a 5" : "a n�o � igual a 5";
		System.out.println(b);
		
		b = (a == 12) ? "a � igual a 12" : "a n�o � igual a 12";
		
		System.out.println(b); //sai os dois => a n�o � igula a 5; a � igual a 12;
		
	}

}
