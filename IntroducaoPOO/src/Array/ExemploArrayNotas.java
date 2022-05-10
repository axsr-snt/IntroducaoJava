package Array;

import java.util.Scanner;

public class ExemploArrayNotas {

	public static void main(String[] args) {
		
		//VETORES UNIDIMENSIONAIS (ARRAYS)
		
		Scanner leitor = new Scanner(System.in);
		/*
		float[] nota = new float [10];
		float acumuladoNotas = 0;
		
		for(int i = 0; i < nota.length; i++) { //.length recupera o tamanho do objeto
			System.out.println("Digite a nota: ");
			nota[i] = leitor.nextFloat();
			acumuladoNotas = acumuladoNotas + nota[i];
		}
		
		float mediaNotas = acumuladoNotas/nota.length;
		System.out.println("A média da turma é: " + mediaNotas);
		 */
		leitor.close();
		
		
		//MATRIZES (ARRAYS DE ARRAYS)
		
		float[][] notas = new float [9][40];
		
		notas[0][0] = 10f;
		notas[0][1] = 9f;
		
		System.out.println(notas[0][0]);
		System.out.println(notas[0][1]);
		
		/*
		 *É POSSIVEL CRIAR ARRAYS DE QUANTAS DIMENSÕES FOREM NECESSÁRIAS 
		 */
		
	}
}
