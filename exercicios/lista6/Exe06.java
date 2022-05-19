package lista6;

public class Exe06 {
	 public static void main(String[] args) {
	        
	        int i = 1, chico = 150, juca = 110;

	        while (i >= 1) {

	            if (juca > chico) {
	                System.out.println("vai levar " + i + " anos para que Juca seja mais alto que Chico");
	                System.out.println("altura de Chico em " + i + " anos = " + (chico / 100) +"m");
	                System.out.println("altura de Juca em " + i + " anos = " + (juca / 100) + "m");
	                break;

	            } else {
	                i ++;
	                chico += 2;
	                juca += 3;
	                continue;
	            }
	            
	        }


	    }
	    
	}





