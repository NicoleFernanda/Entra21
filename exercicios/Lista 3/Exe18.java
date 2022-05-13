package lista3;
public class Exe18 {
    public static void main(String[] args) {
        double compra, taxaC,totalC,venda,taxaV, taxa, totalV, lucro;
        compra = 32.87f * 1000;
        System.out.println("José pagou " + compra + " reais pelas ações");
        
        taxa = 0.02f;
        taxaC = taxa * compra;
        System.out.println("José pagou " + taxaC + " reais pela comissão da compra");

        totalC = compra + taxaC;
        //System.out.println("Gastou " + totalC + " na compra das aÃ§Ãµes (pagou taxa)");

        venda = 1000 * (33.92f);
        System.out.println("José vendeu as ações por " + venda + " reais");

        taxaV = taxa * venda;
        System.out.println("José pagou " + taxaV + " reais pela comissão de venda");

        totalV = venda - taxaV;
        System.out.println("Ganhou ao vender (com taxa): " + totalV);
        
        lucro = totalV - totalC;

        if (lucro > 0) {
            System.out.println("O lucro foi de: " + lucro + " reais");


        } else if ( lucro < 0) {
            lucro = lucro * ( -1);
            System.out.println("O prejuÃ­zo foi de: " + lucro + " reais");
        }
	
    }
    
} 
