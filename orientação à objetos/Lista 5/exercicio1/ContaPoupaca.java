package lista5.exercicio1;

import java.util.Calendar;

public class ContaPoupaca extends ContaBancaria
{
    
    private int diaRendimento;

    public int getDiaRendimento()
    {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) 
    {
        this.diaRendimento = diaRendimento;
    }

    @Override
    public String toString() 
    {
        String conta = "ContaPoupança [";
        conta += " diaRendimento: " + diaRendimento;
        conta += "; " + super.toString(); 
        conta += "] " ;


        return conta; 
    }
    
    public boolean calcularNovoSaldo(double taxaRendimento)
    {
        
        Calendar hoje = Calendar.getInstance();
        
        if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH))
        {
            ;
            this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento));
            return true;
        }
        return false;
    }
}