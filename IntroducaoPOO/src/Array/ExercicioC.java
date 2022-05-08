package Array;

/*Altere o programa do ExercicioB para registrar as temperaturas de cada
 * dia do mês, neste caso, utilize uma matriz com 30 linhas e 24 colunas. 
 * Ao final, verifique qual foi a maior temperatura, a menor temperatura e
 * a temperatura média.
 */

import java.util.Random;
import java.text.DecimalFormat;

public class ExercicioC {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("0.0");
		Random gerador = new Random();
		
		float[][] registros = new float[30][24];
		float temp = 0;
		float tempMax = 0;
		float tempMin = 100;
		float tempAcumulado = 0;
		float tempMed = 0;
		
		System.out.println(registros.length);
		System.out.println(registros[0].length);
		
		for(int i = 0; i < registros.length; i++){	
			//System.out.println("REGISTRO DIA: " + (i + 1));
			for(int j = 0; j < registros[0].length; j++) {
				temp = gerador.nextFloat(26)+10;
				registros[i][j] = temp;
				tempAcumulado = (tempAcumulado + temp);
				System.out.println("A temperatura no dia " + (i+1) + " às " + (j+1) + "hr estava " + df.format(temp) + " º");
				if(temp > tempMax)
					tempMax = temp;
				if(temp < tempMin)
					tempMin = temp;
			}
		}
		
		tempMed = tempAcumulado/(registros.length * registros[0].length);
		System.out.println("A temperatura MÁXIMA foi: " + df.format(tempMax) + "º");
		System.out.println("A temperatura MÍNIMA foi: " + df.format(tempMin) + "º");
		System.out.println("A temperatura MÉDIA foi: " + df.format(tempMed) + "º");
	}
}
