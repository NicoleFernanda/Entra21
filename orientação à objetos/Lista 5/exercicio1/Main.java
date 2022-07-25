package lista5.exercicio1;

public class Main 
{
	 public static void main(String[] args) 
	 {
		 
		 	System.out.println("===============");
	        System.out.println(" ContaBancaria ");
	        System.out.println("===============");
	        
	        
	        ContaBancaria contaSimples = new ContaBancaria();
	        contaSimples.setNomeCliente("Nicole foda");
	        
	        contaSimples.setNumConta("98998");
	        
	        contaSimples.depositar(100);
	        realizarSaque(contaSimples, 50);
	        realizarSaque(contaSimples, 70);
	        
	        System.out.println(contaSimples);
	        System.out.println("========================================================================");
	        System.out.println("\n");
	        
	        System.out.println("=====================");
	        System.out.println(" Teste ContaPoupança ");
	        System.out.println("=====================");
	        
	        ContaPoupaca contaPoupacanca = new ContaPoupaca();

	        contaPoupacanca.setNomeCliente("Emanuel foda");
	        contaPoupacanca.setNumConta("66666");
	        contaPoupacanca.setDiaRendimento(3);
	        
	        contaPoupacanca.depositar(100);
	        
	        realizarSaque(contaPoupacanca, 50);
	        realizarSaque(contaPoupacanca, 70);
	        
	        if (contaPoupacanca.calcularNovoSaldo(0.5))
	        {
	            System.out.println("Rendimento aplicado, novo saldo é de = " + contaPoupacanca.getSaldo());
	        } 
	        else
	        {
	            System.out.println("Hoje não é dia de rendimento, novo saldo não calculado");
	        }
	        
	        
	        System.out.println(contaPoupacanca);
	        System.out.println("=============================================================================================================");
	        System.out.println("\n");
	        
	        System.out.println("=====================");
	        System.out.println(" Teste ContaEspecial ");
	        System.out.println("=====================");
	        
	        ContaEspecial contaEspecial = new ContaEspecial();

	        contaEspecial.setNomeCliente("Jota foda");
	        contaEspecial.setNumConta("12345");
	        contaEspecial.setLimite(100);
	        
	        contaEspecial.depositar(50);
	        
	        realizarSaque(contaEspecial, 60);
	        realizarSaque(contaEspecial, 50);
	        realizarSaque(contaEspecial, 80);
	        System.out.println(contaEspecial);
	        System.out.println("=======================================================================================================");
	        System.out.println("\n");
	    }
	    
	    private static void realizarSaque(ContaBancaria conta, double valor)
	    {
	        if (conta.sacar(valor))
	        {
	            System.out.println("Saque efetuado com sucesso, novo saldo = " + conta.getSaldo());
	        } 
	        else 
	        {
	            System.out.println("Saldo insuficiente para saque de " + valor + "; saldo de = " + conta.getSaldo());
	        }
	   }
}

