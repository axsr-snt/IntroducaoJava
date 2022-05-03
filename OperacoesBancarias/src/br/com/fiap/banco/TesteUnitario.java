package br.com.fiap.banco;

import java.util.Scanner;

public class TesteUnitario {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		ContaCorrente corrente = new ContaCorrente();
		corrente.setTipo("Pessoa Fisica");
		corrente.setChequeEspecial(1000.0);
		//corrente.setSaldo(1000);
		
		Conta conta1 = new Conta();
		conta1.depositar(1000);
		conta1.efetuarSaque(200);
		
		corrente.depositar(1000);
		corrente.efetuarSaque(200);
		
		Conta conta3 = new ContaCorrente();
		conta3.depositar(1000);
		conta3.efetuarSaque(200);
		
		System.out.println("Conta 1: " + conta1.getSaldo());
		System.out.println("Conta 2: " + corrente.getSaldoDisponivel());
		System.out.println("Conta 3: " + conta3.getSaldo());
		
		
		int operacao = 0;
		double valor;
		boolean status;
		
		/*
		System.out.println("Qual operação você deseja fazer?\n1 - Consultar Saldo;\n2 - Realizar saque;\n3 - Realizar deposito;");
		operacao = entrada.nextInt();
		
		 if (operacao == 1){
			 	System.out.print("O valor do seu saldo é: R$ " + corrente.getSaldo());
			} else if (operacao == 2) {
				System.out.println("Digite o valor do saque: ");
				valor = entrada.nextDouble();
				status = corrente.efetuarSaque(valor);
				if(status == true) {
					System.out.println("Valor sacado R$: " + valor + "\nSeu saldo atual é R$: " + corrente.getSaldo());
				} else {
					System.out.println("Saldo insuficiente para realizar o saque!");
				}
			} else if (operacao == 3) {
				System.out.println("Digite o valor do deposito: ");
				valor = entrada.nextFloat();
				corrente.depositar(valor);
				System.out.println("Seu saldo atual é R$: " + corrente.getSaldo());
			} else {
				System.out.println("A opção selecionada é inválida!");
			}
		 	entrada.close();
			*/
	}
}
