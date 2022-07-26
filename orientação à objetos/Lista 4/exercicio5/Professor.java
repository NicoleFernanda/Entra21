package lista4.exercicio5;

public class Professor {
	
	protected String nomeProf;
	protected String departProf;
	protected String emailProf;
	
	public Professor() {
		
	}
	
	public void cadastrarProf (String nomeProf, String departProf, String emailProf) {
		this.nomeProf = nomeProf;
		this.departProf = departProf;
		this.emailProf = emailProf;
	}
	
	public void imprimirProf() {
		System.out.println("\t- Professor(a) ["+ nomeProf.toUpperCase() + "]-");
		System.out.println("departamento de ["+ departProf + "]");
		System.out.println("endereco de email: [" + emailProf.toUpperCase() + "]");
	}
	
	public String getNomeProf() {
		return nomeProf;
	}
	public void setNomeProf(String nomeProf) {
		this.nomeProf = nomeProf;
	}
	public String getDepartProf() {
		return departProf;
	}
	public void setDepartProf(String departProf) {
		this.departProf = departProf;
	}
	public String getEmailProf() {
		return emailProf;
	}
	public void setEmailProf(String emailProf) {
		this.emailProf = emailProf;
	}
	
	
}
