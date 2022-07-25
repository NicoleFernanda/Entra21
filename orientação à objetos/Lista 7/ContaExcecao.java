package lista7;

public class ContaExcecao extends Exception {
	
	@Override
	public String getMessage() {
		return "saldo insuficiente";
	}
}
