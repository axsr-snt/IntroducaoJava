package Array;

/*Escreva um programa para armazenar em uma matriz as notas das 5
 * diciplinas dos 20 alunos de uma turma
 */

import java.util.Random;
import java.text.DecimalFormat;

public class ExercicioD {

	public static void main(String[] args) {
		
		Random gerador = new Random();
		DecimalFormat df = new DecimalFormat("0.0");
		
		float[][] notas = new float[5][20];
		float notaGerada = 0;
		String materia;
		
		for(int i = 0; i < notas.length; i++) {
			materia = nomeMateria(i);
			for(int j = 0; j < notas[0].length; j++) {
				notaGerada = gerador.nextFloat(11);
				notas[i][j] = notaGerada;
				System.out.println("A nota do aluno " + (j+1) + " na matéria " + materia + " é " + df.format(notaGerada));
			}			
		}
	}
	public static String nomeMateria (int codigoMateria){
		if(codigoMateria == 0) {
			return "Matemática";
		} else if(codigoMateria == 1) {
			return "Literatura";
		} else if(codigoMateria == 2) {
			return "Física";
		} else if(codigoMateria == 3) {
			return "História";
		} else if(codigoMateria == 4) {
			return "Biologia";
		} else {
			return "Matéria não existe";
		}
	}
}
