package lista3;
public class Exe18 {
    public static void main(String[] args) {
        double compra, taxaC,totalC,venda,taxaV, taxa, totalV, lucro;
        compra = 32.87f * 1000;
        System.out.println("Jos� pagou " + compra + " reais pelas a��es");
        
        taxa = 0.02f;
        taxaC = taxa * compra;
        System.out.println("Jos� pagou " + taxaC + " reais pela comiss�o da compra");

        totalC = compra + taxaC;
        //System.out.println("Gastou " + totalC + " na compra das ações (pagou taxa)");

        venda = 1000 * (33.92f);
        System.out.println("Jos� vendeu as a��es por " + venda + " reais");

        taxaV = taxa * venda;
        System.out.println("Jos� pagou " + taxaV + " reais pela comiss�o de venda");

        totalV = venda - taxaV;
        System.out.println("Ganhou ao vender (com taxa): " + totalV);
        
        lucro = totalV - totalC;

        if (lucro > 0) {
            System.out.println("O lucro foi de: " + lucro + " reais");


        } else if ( lucro < 0) {
            lucro = lucro * ( -1);
            System.out.println("O prejuízo foi de: " + lucro + " reais");
        }
	
    }
    
} 
