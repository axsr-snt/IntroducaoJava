package Loop;

/*
 * Elabore um programa que leia o nome e o sal�rio de N pessoas, o usu�rio dever�
 * imformar se deseja continuar a itera��o. Ao fina, apresente a quantidade de
 * pessoas informadas e a m�dia entre os sal�rios
 */

import java.util.Scanner;

public class ExercicioD {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		int contador = 0;
		double montante = 0;
		String YN;
		
		do {
			System.out.println("Digite o nome do funcion�rio: ");
			String nome = leitor.next();
			
			System.out.println("Digite o sal�rio do funcion�rio: ");
			double salario = leitor.nextDouble();
			montante = montante + salario;
			
			System.out.println("O funcionpario " + nome + " recebe R$: " + salario );
			
			contador ++;
			
			System.out.println("Deseja continuar com o calculo? (s/n)");
			YN = leitor.next();
		} while (YN.equals("s"));
		
		double media = montante / contador;
		System.out.println("Foram considerados os sal�rios de " + contador + " funcionarios\n A m�dia dos sal�rios pagos � " + media%2f);
		
	}
	
}
