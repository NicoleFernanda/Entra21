package lista5.exercicio1;

public class ContaEspecial extends ContaBancaria 
{
    
    private double limite;

   
    public double getLimite() 
    {
        return limite;
    }

 
    public void setLimite(double limite) 
    {
        this.limite = limite;
    }

    @Override
    public String toString()
    {
        String conta = "ContaEspecial [";
        conta += " limite: " + limite;
        conta += "; " + super.toString(); 
        conta += "] " ;

       
        return conta; 
    }
    
    public boolean sacar(double valor)
    {
        
        double saldoComLimite = this.getSaldo() + limite;
        
        if ((saldoComLimite-valor) >=0)
        {
            this.setSaldo(this.getSaldo()-valor);
            
            return true;
        }
        
        return false;
    }
}