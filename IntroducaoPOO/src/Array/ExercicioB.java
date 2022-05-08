package Array;

/* Escreva um programa para preencher uma matriz unidimensional (vetor)
 * que dever� receber as temperaturas ao longo do dia. A medi��o precisa
 * ser registrada a cada uma hora. Ao final, exiba a temperatura m�dia
 * do dia
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class ExercicioB {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0"); 
		
		float[] temp = new float[24];
		
		for(int i = 0; i < temp.length; i++) {
			System.out.println("Temperatura �s " + (i+1) + "hrs: ");
			temp[i] = leitor.nextFloat();
		}
		
		float acumulado = 0;
		
		for(float tem: temp) {
			acumulado = acumulado + tem;
		}
		
		System.out.println("A temperatura m�dia do dia foi: " + df.format(acumulado/temp.length) + "�");
		
		leitor.close();
	}
	
}
