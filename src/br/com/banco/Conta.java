package br.com.banco;

public class Conta {
	
	private double numero;
	private String nome;
	private double saldo;
	
	public Conta(double numero, String nome, double saldo) {
	
		this.numero = numero;
		this.nome = nome;
		deposito(saldo);
	}

	public Conta(double numero, String nome) {
		
		this.numero = numero;
		this.nome = nome;
	}

	public double getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void deposito (double valor) {
		
		saldo += valor;
		
	}
		
	public void saque  (double valor ) {
		
		saldo -= valor + 5.0; }
		
	public String toString() {
	 return
		"Conta: "
		+ numero 
		+ ","
		+ nome
		+ ","
		+ "saldo: R$ "
		+ saldo;
	}
	
}


