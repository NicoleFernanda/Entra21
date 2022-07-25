package lista7;

public class Conta {
	
	private double limite;
	private double saldo;
	
	public void deposita(double depositando) {
		
		this.saldo = this.saldo + depositando;
		
	}
	
	public void saca(double sacando) throws ContaExcecao {
		
		if (this.saldo < sacando) {
			throw new ContaExcecao();//entra em excecao
		} else {
			this.saldo = this.saldo - sacando;
		}
	
	}
	
	public void imprimeSaldo() {
		System.out.println("saldo atual = " + this.saldo);
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	

}
