package utilizandoStatic;

public class AgendaContato {
	
    private String nome;
    private String telefone;
    private String email;
    
    public AgendaContato() {//construtor vazio

    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String showContatos() {
        return "nome : " + this.getNome() + "\ntelefone : " + this.getTelefone() + "\ne-mail : " + this.getEmail() + "\n";
    }

    public String informa() {//qual a diferenca entre informa e  showContatos
        return "nome : " + nome + "\ntelefone : " + telefone + "\ne-mail : " + email + "\n";
    }

}

