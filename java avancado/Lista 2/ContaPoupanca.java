package lista2;

public class ContaPoupanca extends Conta implements Comparable <ContaPoupanca>{
//public class ContaPoupanca extends Conta {
	String situacaoConta;
	
	@Override
	public int compareTo(ContaPoupanca outraConta) {
		
		if (super.saldo < outraConta.saldo) {//super -> compara com a super classe
			return -1;
		}
		
		if (super.saldo > outraConta.saldo) {
			return 1;
		}
		
		
		return 0;
		//para inverter a ordem, so trocar os return -> de -1 para 1 e de 1 para -1

	}
	
//	@Override
//	public int compareTo(ContaPoupanca outraConta) {
//		
//		if (super.numero < outraConta.numero) {//super -> compara com a super classe
//			return -1;
//		}
//		
//		if (super.numero > outraConta.numero) {
//			return 1;
//		}
//		
//		
//		return 0;
//		//para inverter a ordem, so trocar os return -> de -1 para 1 e de 1 para -1
//
//	}
	
//	public int compareTo(ContaPoupanca outraConta) {
//		return nome.compareTo(outraConta.nome);
//	}
	
	public String toString() {
		return "NOME = " + nome + "\nAGENCIA = " + agencia + "\nNUMERO DA CONTA = " + numero + "\nSALDO = " + saldo + "\n";
	}
	
	
	//the method compareTo(ContaPoupanca) of type ContaPoupanca must override or implement a supertype method
	//o metodo precisa ter o implements Comparable <ContaPoupanca> para funcionar

}
