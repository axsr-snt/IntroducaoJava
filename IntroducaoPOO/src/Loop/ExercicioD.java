package Loop;

/*
 * Elabore um programa que leia o nome e o salário de N pessoas, o usuário deverá
 * imformar se deseja continuar a iteração. Ao fina, apresente a quantidade de
 * pessoas informadas e a média entre os salários
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class ExercicioD {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		int contador = 0;
		double montante = 0;
		String YN;
		
		do {
			System.out.println("Digite o nome do funcionário: ");
			String nome = leitor.next();
			
			System.out.println("Digite o salário do funcionário: ");
			double salario = leitor.nextDouble();
			montante = montante + salario;
			
			System.out.println("O funcionpario " + nome + " recebe R$: " + salario );
			
			contador ++;
			
			System.out.println("Deseja continuar com o calculo? (s/n)");
			YN = leitor.next();
		} while (YN.equals("s"));
		System.out.println(montante);
		double media = montante / contador;
		System.out.println("Foram considerados os salários de " + contador + " funcionarios\n A média dos salários pagos é " + df.format(media));		
		
		leitor.close();
	}
}
