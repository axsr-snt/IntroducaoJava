package Array;

/*Altere o programa do ExercicioB para registrar as temperaturas de cada
 * dia do m�s, neste caso, utilize uma matriz com 30 linhas e 24 colunas. 
 * Ao final, verifique qual foi a maior temperatura, a menor temperatura e
 * a temperatura m�dia.
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
				System.out.println("A temperatura no dia " + (i+1) + " �s " + (j+1) + "hr estava " + df.format(temp) + " �");
				if(temp > tempMax)
					tempMax = temp;
				if(temp < tempMin)
					tempMin = temp;
			}
		}
		
		tempMed = tempAcumulado/(registros.length * registros[0].length);
		System.out.println("A temperatura M�XIMA foi: " + df.format(tempMax) + "�");
		System.out.println("A temperatura M�NIMA foi: " + df.format(tempMin) + "�");
		System.out.println("A temperatura M�DIA foi: " + df.format(tempMed) + "�");
	}
}
