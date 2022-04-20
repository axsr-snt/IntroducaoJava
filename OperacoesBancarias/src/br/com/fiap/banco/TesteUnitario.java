package br.com.fiap.banco;

import java.util.Scanner;

public class TesteUnitario {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Conta corrente = new Conta();
		
		int operacao = 0;
		double valor;
		
		System.out.println("Qual operação você deseja fazer?\n1 - Consultar Saldo;\n2 - Realizar deposito;\n3 - Realizar saque;");
		operacao = entrada.nextInt();
		
		 if (operacao == 1){
			 double saldo = corrente.visualizarSaldo();
			 	System.out.print("O valor do seu saldo é: R$ " + saldo);
			} else if (operacao == 2) {
				System.out.println("Digite o valor do saque: ");
				valor = entrada.nextDouble();
				corrente.efetuarSaque(valor);
				System.out.println("Seu saldo atual é R$: " + corrente.saldo);
			} else if (operacao == 3) {
				System.out.println("Digite o valor do deposito: ");
				valor = entrada.nextFloat();
				corrente.depositar(valor);
				System.out.println("Seu saldo atual é R$: " + corrente.saldo);
			} else {
				System.out.println("A opção selecionada é inválida!");
			}
		 	entrada.close();

	}
}
