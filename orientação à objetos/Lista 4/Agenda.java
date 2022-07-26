package utilizandoStatic;

public class Agenda {
    private String nome;
    private AgendaContato[] contatos;

    public Agenda(String nome) {//dar nome à agenda (eu acho)
        super();
        this.nome = nome;
    }

    public Agenda() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public AgendaContato[] getContatos() {
        return contatos;
    }

    public void setContatos(AgendaContato[] contatos) {
        this.contatos = contatos;
    }

    
    
}
