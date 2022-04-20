package br.com.fiap.banco;

public class TesteUnitario {
	public static void main(String[] args) {
		
		Conta corrente = new Conta();
		
		corrente.saldo = 100.0;
		corrente.agencia = 123;
		corrente.numero = 321;
		
		corrente.depositar(1000.00);
		
		System.out.println(corrente.visualizarSaldo());
		
		Conta poupanca = new Conta(111, 222, 1200.00);
		
		poupanca.sacar(100.0);
		
		System.out.println(poupanca.visualizarSaldo());
		
	}
}