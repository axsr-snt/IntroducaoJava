package Loop;

/*
 * Elabore um programa para ler 20 valores inteiros fornecidos pelo usu�rio
 * e calcular a soma entre eles. Apresente o resultado ao final
 */

import java.util.Scanner;

public class ExercicioA {
	
	public static void main(String[] args) {
	
		Scanner leitor = new Scanner(System.in);
	
		System.out.println("DIGITE 20 NUM�ROS PARA EFETUAR A SOMA");
			
		System.out.println("\nDigite um n�mero");
			int n = leitor.nextInt();
			int soma = n;
	
		for(int i = 1; i <= 19 ;i++) {
			System.out.println("\nDigite outro n�mero: ");
			n = leitor.nextInt();
			soma = soma + n;
	}
		System.out.println("O valor da soma �: " + soma);
		
		leitor.close();
	}
}	
