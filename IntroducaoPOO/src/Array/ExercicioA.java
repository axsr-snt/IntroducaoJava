package Array;

/* Elabore um programa para preencher uma matriz unidimensional (vetor)
 * com 15 posi��es de n�meros inteiros e, em seguida, apresente os elementos.
 */

import java.util.Scanner;

public class ExercicioA {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int[] num = new int[6];
		
		for(int i = 0; i < num.length; i++) {
			System.out.println("Digite os n�meros: ");
			num[i] = leitor.nextInt();
		}
		
		String varString = "";
		
		for(int num2: num) {
			varString = varString + num2 + ", ";
		}
		
		System.out.println("OS N�MEROS DIGITADOS FORAM: \n");
		System.out.println(varString);
		
		leitor.close();
	}
	
}
