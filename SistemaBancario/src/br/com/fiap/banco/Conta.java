package br.com.fiap.banco;

public class Conta {
	
	int agencia;
	int numero;
	double saldo;
	
	public Conta() {
		
	}
	
	public Conta(int agencia, int numero, double saldo) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public boolean validarSaque(double valor) {
		if(this.saldo < valor) {
			return false;
		} else {
			return true;
		}
	}
	
	public void sacar(double valor) {
		this.validarSaque(valor);
		if(validarSaque = true)
			this.saldo -= valor;
	}
	
	public double visualizarSaldo() {
		return this.saldo;
	}
	
}
