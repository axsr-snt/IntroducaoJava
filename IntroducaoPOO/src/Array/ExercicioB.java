package Array;

/* Escreva um programa para preencher uma matriz unidimensional (vetor)
 * que deverá receber as temperaturas ao longo do dia. A medição precisa
 * ser registrada a cada uma hora. Ao final, exiba a temperatura média
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
			System.out.println("Temperatura às " + (i+1) + "hrs: ");
			temp[i] = leitor.nextFloat();
		}
		
		float acumulado = 0;
		
		for(float tem: temp) {
			acumulado = acumulado + tem;
		}
		
		System.out.println("A temperatura média do dia foi: " + df.format(acumulado/temp.length) + "º");
		
		leitor.close();
	}
	
}
