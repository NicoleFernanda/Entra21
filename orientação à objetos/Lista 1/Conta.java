package lista1;

public class Conta {
	public static void main(String[] args) {
		
		ContaCorrente cliente1 = new ContaCorrente();
	
		cliente1.numeroConta = 724258;
		cliente1.saldo = 36;
		cliente1.status = "especial";
		cliente1.limite = 100000;
		
		ContaCorrente cliente2 = new ContaCorrente();
		
		cliente2.numeroConta = 796;
		cliente2.saldo = 150236;
		cliente2.status = "nao especial";
		cliente2.limite = 58385533;
		
	}
	
	
	

}
