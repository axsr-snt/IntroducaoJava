package Condicao;

import java.util.Scanner; 

/* para fazer uso da classe Scanner precisamos importar o pacote/e a classe da biblioteca java referente a essa classe
 a instru??o import importa um pacote/ e classe */

public class ExemploInputOutput {
	
	public static void main(String[] args) {
		
		int idade = 0;
		String nome;
		
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		

		System.out.println("Digite seu nome: ");
		nome = sc2.nextLine(); 
		// o atributo next pega apenas a pr?xima palavra digitada, para pegar toda a linha deve ser utilizado nextLine()
		
		System.out.println("Ol?, " + nome);
		
		System.out.println("Digite a idade: ");
		idade = sc1.nextInt(); // retorno do input na vari?vel idade
		
		if (idade <= 0)
			System.out.println("Idade inv?lida!!!");
		
		if(idade >= 100) {
			System.out.println("Centen?rio");		
		} else if(idade >= 60 ) {
			System.out.println("Terceira idade");
		} else if(idade >= 18) {
			System.out.println("Adulto");
		} else if(idade >= 15) {
			System.out.println("Adolescente");
		} else if(idade >= 12) {
			System.out.println("Pr?-Adolescente");
		} else if(idade >= 3) {
			System.out.println("Crian?a");
		} else {
			System.out.println("Beb?");
		}
		sc1.close();
		sc2.close();
		
	}
}
