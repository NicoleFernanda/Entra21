package lista2;

import java.util.*;

public class ContaTeste {
	public static void main(String[] args) {
		
		Random r = new Random();
		
		ContaPoupanca fulano = new ContaPoupanca();
		fulano.nome = "Fulano";
		fulano.agencia = "Velha";
		fulano.numero = 1234;
		fulano.saldo = 870;
		
		ContaPoupanca ciclano = new ContaPoupanca();
		ciclano.nome = "Ciclano";
		ciclano.agencia = "Vila Nova";
		ciclano.numero = 5678;
		ciclano.saldo = 500;
		
		ContaPoupanca baiano = new ContaPoupanca();
		baiano.nome = "Baiano";
		baiano.agencia = "Garcia";
		baiano.numero = 9999;
		baiano.saldo = 12590;
		
		ContaPoupanca peruano = new ContaPoupanca();
		peruano.nome = "Peruano";
		peruano.agencia = "Centro";
		peruano.numero = 9876;
		peruano.saldo = 1260;
        
		//long tInicio = System.currentTimeMillis();

		List <ContaPoupanca> contas = new LinkedList<ContaPoupanca>();
		contas.add(fulano);
		contas.add(ciclano);
		contas.add(baiano);
		contas.add(peruano);
		
		//Collections.sort(contas);
		//Collections.reverse(contas);

		for (ContaPoupanca linha : contas) {
			linha.setSaldo(r.nextDouble(200));
		}
		
		Collections.sort(contas);

		for (ContaPoupanca a : contas) {
			System.out.println(a);
		}
		
		//long tfim = System.currentTimeMillis();
		//System.out.println(tfim - tInicio);
		
		//nao senti nenhuma diferenca entra ArrayList e LinkedList

	}
}
