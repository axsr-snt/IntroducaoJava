package Loop;
/*
 * Elabore um programa para fazer a tabuada de um número fornecido pelo 
 * usuário, variando de 0 a 12, e mostre o resultado a cada iteração
 */

import java.util.Scanner;

public class ExercicioB {

	public static void main(String[] args) {
	
		Scanner leitor = new Scanner(System.in);
		
		int fator;
		char igual = 75;
		
		System.out.println("Digite o fator da tabuada desejada: ");
		fator = leitor.nextInt();
		
		System.out.println("Taboada do número " + fator);
		
		for (int i = 0; i <= 12; i++) {
			int res = fator * i;
			System.out.println(fator + " x " + i + " = " + res);
		}	
	}
}
