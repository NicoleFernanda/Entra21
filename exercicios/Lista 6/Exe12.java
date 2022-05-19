package lista6;

public class Exe12 {
	public static void main(String[] args) {
		double num = 0, total = 1;
		
		for (int i = 1; i <= 64; i++) {
			
			if (i == 2) {
			total = num + 1;
			} else if (i > 2){
				total = (int) Math.pow(2, num);
			}
			num++;
			System.out.println("["+i+"]     " + total + ";");
		}
	
	
	
	}

}
