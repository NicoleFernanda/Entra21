import java.util.Scanner;

public class ExeExtra {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        int capacidade = 10; //luagres
        int otimo = 0;
        int bom = 0;
        int regular = 0;
        int ruim = 0;
        int pessimo = 0;
        int total = 0;

        int maiorPessimo = 0;//idade
        int maiorOtimo = 0;//idade
        int maiorRuim = 0;//idade
        int idade; //scanner
        byte opiniao;//scanner

        int idadesRuim = 0;

        for (int i = 0; i < capacidade; i++) {
        
            System.out.println("\nidade: ");
            idade = t.nextInt();

            while (idade <= 0) {
                System.out.println("idade invalida, digite novamente!");
                System.out.println("\nidade: ");
                idade = t.nextInt();
            }

            System.out.println("\nsabendo que: \n5 = otimo \n4 = bom \n3 = regular \n2 = ruim \n1 = pessimo ");
            System.out.println("de a opiniao: ");
            opiniao = t.nextByte();

            while (opiniao <= 0 && opiniao >= 6) {
                System.out.println("opcao invalida, digite novamente!");
                System.out.println("sabendo que: \notimo = 5 \nbom = 4 \nregular = 3 \nruim = 2 \npessimo = 1 ");
                System.out.println("de a opiniao: ");
                opiniao = t.nextByte();
            }
            
            switch (opiniao) {
                case 5: //otimo
                    otimo++;
                    
                    if (idade > maiorOtimo) {
                        maiorOtimo = idade;
                    }

                    break;

                case 4: //bom
                    bom++;

                    break;

                case 3://regular
                    regular++;

                    break;

                case 2:
                    ruim++;
                    idadesRuim = idadesRuim + idade;//media depois - (idadesRuim/ruim)

                    if (idade > maiorRuim) {
                        maiorRuim = idade;
                    }

                    break;

                case 1:
                    pessimo++;

                    if (idade > maiorPessimo) {
                        maiorPessimo = idade;
                    }

                    break;
                default:
                    break;
            }

            total++;
        }


        float percentualBOM = (bom * 100)/(total);//%
        float percentualREGULAR = (regular * 100)/(total); //%
        float percentualPESSIMO = (pessimo * 100)/(total);
        float diferenca = percentualBOM - percentualREGULAR;
        float media = idadesRuim/ruim;
        int idadeOtimoRuim = maiorOtimo - maiorRuim;

            
        System.out.println("quantidade de respostas otimo = " + otimo);
        System.out.println("diferenca percentual entre respostas bom e regular = " + diferenca);
        System.out.println("media de idades que responderam ruim = " + media);
        System.out.println("percentual de respostas pessimo = " + percentualPESSIMO + "%");
        System.out.println("maior idade que respondeu pessimo = " + maiorPessimo);
        System.out.println("diferenca entre a maior idade que respondeu otimo e a maior idade que respondeu ruim = " + idadeOtimoRuim);

        t.close();

    }
    
}
