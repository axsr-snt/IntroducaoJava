package br.com.fiap.banco;

/**
 * Classe que abstrai uma conta bancária.
 * @author Alexsander
 * @version 1.0
 */

public class Conta {
	
	/**
	 * Número da agência;
	 */
	private int agencia;
	
	/**
	 * Número da conta;
	 */
	private int numero;
	
	/**
	 * Valor do saldo disponível;
	 */
	private double saldo;
		
	/**
	 * Definição do construtor padrão;
	 */
	public Conta() {
		
	}
	
	public double getSaldo() {
		return saldo;
	}
	

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	

	/**
	 * Definição de um construtor;
	 * @param agencia;
	 * @param conta;
	 * @param saldo;
	 */	
	public Conta(int agencia, int numero, double saldo) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}
	/*
	
	/**
	 * Método para vizualizar o saldo disponível;
	 * @return saldo;
	 
	public double visualizarSaldo() {
		return this.saldo;
	}
	*/
	
	/**
	 * Método para subtrair um valor ao valor do saldo através de um saque;
	 * @param valor
	 */
	public boolean efetuarSaque(double valor) {
		boolean resposta = validarSaque(valor);
			if(resposta == true) {
				this.saldo -= valor;
				return true;
			} else {
				return false;
			}
	}
	
	/**
	 * Método para verificar se há saldo disponível para realizar um saque
	 * @param valor
	 * @return
	 * @see efetuarSaque
	 */
	public boolean validarSaque(double valor) {
		if(this.saldo < valor) {
			return false;
		} else {
			return true;
		}
	}
	
	/**
	 * Método para somar um valor ao valor do saldo através de um depósito
	 * @param valor
	 */
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
}
