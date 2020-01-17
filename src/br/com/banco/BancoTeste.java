package br.com.banco;

import java.util.Scanner;

public class BancoTeste {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	Conta ct;
	
	System.out.print("Entre com a conta: ");
	
	double numero = sc.nextDouble();
	
	System.out.print("Entre com o nome: ");
	
	String nome = sc.next();
	
	System.out.print("Existe depósito inicial ?: ");
	
	char resposta = sc.next().charAt(0);
	
	if (resposta == 's') {
		
		System.out.print("Entre com o depósito inicial: ");
		
		double saldo = sc.nextDouble();
		
	
		ct = new Conta(numero, nome, saldo); }
		
		else {
			
		double saldo = 0;
		
		ct = new Conta(numero, nome);
			
		}
	
	System.out.println();
	System.out.println("Dados da Conta:");
	System.out.println(ct);
	
	System.out.println();
	System.out.print("Entre com o valor do depósito: ");
	
	double dp = sc.nextDouble();
	ct.deposito(dp);
	
	System.out.println();
	System.out.print("Atualizar dados da conta:");
	
	System.out.println(ct);
	
	System.out.println();
	System.out.print("Entre com o valor do saque: ");
	
	double sq = sc.nextDouble();
	
	ct.saque(sq);
	
	System.out.println();
	
	System.out.print("Atualizar dados da conta:");
	
	System.out.println(ct);
	
	//System.out.println(ct.getSaldo());
	
	
	sc.close();

	}

}
