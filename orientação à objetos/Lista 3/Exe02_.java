package lista3;

import java.util.Scanner;

public class Exe02_ {
    
    Scanner tec = new Scanner(System.in);
	
	String nome;
	int numeroConta;
    double saldo;
	boolean especial;//especial ou nao
	double limite;
    byte status;

    //construtor
    Exe02_() {
        System.out.println("seu nome");
        this.nome = tec.next(); 
        System.out.println("numero da sua conta");
        this. numeroConta = tec.nextInt(); 
        System.out.println("seu saldo atual");
        this.saldo = tec.nextDouble(); 
        System.out.println("qual o limite");
        this.limite = tec.nextDouble();
    }

    public void fazersaque() {
		System.out.println("valor para sacar: ");
		double sacar = tec.nextDouble();
		
        if (sacar <= this.saldo && this.saldo > 0 && sacar > 0) {
			this.saldo = this.saldo - sacar;
		} else {
			System.out.println("saldo insuficiente");
		}
				
	}

    public void fazerdeposito() {
		System.out.println("valor para depositar: ");
		double depositar = tec.nextDouble();
		
		this.saldo = this.saldo + depositar;
		
		if (saldo > limite) {
			this.saldo = this.saldo - depositar;
			System.out.println("limite excedido");
		} else {
            System.out.println("valor  ("+ depositar + ")  depositado");
        }
		
	}

    public void fazerconsultaEspecial(Scanner tec) {
		System.out.println("o cliente [" + this.nome + "] usa cheque especial?            1 - sim / 2 - nao");
		this.status = tec.nextByte();

        if (status == 1) {
            this.especial = true;
        } else {
            this.especial = false;
        }
		
	}

    void imprimir() {
        this.nome =  this.nome.toUpperCase();
		System.out.println("\n" + this.nome);
		System.out.println("NUMERO DA CONTA = " + this.numeroConta);
		System.out.println("SALDO = " + " R$: " + this.saldo );
		
        if (this.status == 1) {
			System.out.println("USO DO CHEQUE ESPECIAL");
		} else {
			System.out.println("DESUSO DO CHEQUE ESPECIAL");
		}
		
	}


    //getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

}
