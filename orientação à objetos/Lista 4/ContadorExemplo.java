package utilizandoStatic;

public class ContadorExemplo {
    public static void main(String[] args) {
        System.out.print("valor atual: ");
        Contador.imprimir();
        System.out.print("incrementando: ");
        Contador.incrementar();
        Contador.imprimir();
        System.out.print("zerando: ");
        Contador.zerar();
        Contador.imprimir();
        System.out.print("incremento mais 3 vezes: ");
        Contador.incrementar();
        Contador.incrementar();
        Contador.incrementar();
        Contador.imprimir();
        System.out.println("instancio a classe 5 vezes");
        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();
        Contador c4 = new Contador();
        Contador c5 = new Contador();
        System.out.print("valor atual (depois de instanciar 5 vezes): ");
        Contador.imprimir();
        Contador.zerar();
        System.out.print("zerando valor: ");
        Contador.imprimir();
        
    }
}