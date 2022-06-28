package lista2;


public class Exe01_Lampada {
	
	byte sim;//situacao da lampada
	
	boolean saber () {
		boolean ligada = true;
		
		if (sim == 1) {
			ligada = true;
		} else if (sim == 0) {
			ligada = false;
		}
		
		
		return ligada;
	}
	
	
	byte ligar () {
		
		if (sim == 0) {//desligada
			sim = 1;//liga
			System.out.println("luz foi ligada!");
		} else {
			System.out.println("luz ja ligada");
		}
		
		return sim;
	}
	
	byte desligar () {
		
		if (sim == 1) {//ligada
			sim = 0;//desliga
			System.out.println("luz foi desligada!");
		} else {
			System.out.println("luz ja desligada");
		}
		
		return sim;
	}
	
	void verificarEstado() {
		
		if (sim == 1) {
			System.out.println("estado da luz : ligada");
		} else if (sim == 0) {
			System.out.println("estado da luz : desligada");
		}	

	}
	
	byte mudarEstado() {
		
		if (sim == 0) {//desligada
			sim = 1;//liga
			System.out.println("luz foi ligada");
		} else {
			sim = 0;
			System.out.println("luz foi desligada");
		}
		
		return sim;
	}
}



