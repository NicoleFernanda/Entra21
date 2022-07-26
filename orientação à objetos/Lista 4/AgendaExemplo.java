package utilizandoStatic;

import java.util.Scanner;

public class AgendaExemplo {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        String nome;
        // String telefone; onde usa-los meu deus
        // String email;

        System.out.println("insira o nome da sua agenda:");
        nome = tec.next();
        Agenda agendando = new Agenda(nome);

        System.out.println("");

        // System.out.println("seu telefone: ");
        // System.out.println("seu email: ");

        AgendaContato[] contatos = new AgendaContato[2];

        AgendaContato contato1 = new AgendaContato();
        System.out.println("nome do primeiro contato");
        contato1.setNome(tec.next());
        System.out.println("email do primeiro contato");
        contato1.setEmail(tec.next());
        System.out.println("telefone do primeiro contato");
        contato1.setTelefone(tec.next());

        AgendaContato contato2 = new AgendaContato();
        System.out.println("nome do segundo contato");
        contato2.setNome(tec.next());
        System.out.println("email do segundo contato");
        contato2.setEmail(tec.next());
        System.out.println("telefone do segundo contato");
        contato2.setTelefone(tec.next());

        contatos[0] = contato1;
        contatos[1] = contato2;

        agendando.setContatos(contatos);

        System.out.println("ver contatos da " + agendando.getNome() + "?                1 - sim    0 - nao");
        int a = tec.nextInt();

        if (a == 1) {
            //System.out.println(agendando.informa());
        }




        


        tec.close();
    }
    
}
