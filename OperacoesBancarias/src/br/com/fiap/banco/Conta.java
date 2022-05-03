package br.com.fiap.banco;

/**
 * Classe que abstrai uma conta banc�ria.
 * @author Alexsander
 * @version 1.0
 */

public class Conta {
	
	/**
	 * N�mero da ag�ncia;
	 */
	private int agencia;
	
	/**
	 * N�mero da conta;
	 */
	private int numero;
	
	/**
	 * Valor do saldo dispon�vel;
	 */
	private double saldo;
		
	/**
	 * Defini��o do construtor padr�o;
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
	 * Defini��o de um construtor;
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
	 * M�todo para vizualizar o saldo dispon�vel;
	 * @return saldo;
	 
	public double visualizarSaldo() {
		return this.saldo;
	}
	*/
	
	/**
	 * M�todo para subtrair um valor ao valor do saldo atrav�s de um saque;
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
	 * M�todo para verificar se h� saldo dispon�vel para realizar um saque
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
	 * M�todo para somar um valor ao valor do saldo atrav�s de um dep�sito
	 * @param valor
	 */
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
}
