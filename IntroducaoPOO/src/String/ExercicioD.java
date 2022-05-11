package String;

import java.util.Arrays;

/* Implementar um algoritmo que crie um CPF com base nas regras:
 * Representação de um CPF: xxx.xxx.xxx-yz
 * x são o conjunto de 9 números aleatórios que fazem parte do calculo de y e z
 *
 * Calculo J 
 *  soma = 10*A + 9*B + 8*C + 7*D + 6*E + 5*F + 4*G + 3*H + 2*I
 * 	resto = resto(soma,11)
 * 	se resto < = 1: J = 0, se não: J = 11-resto
 * 
 * Calculo K 
 *  soma = 11*A + 10*B + 9*C + 8*D + 7*E + 6*F + 5*G + 4*H + 3*I + 2*J
 * 	resto = resto(soma,11)
 * 	se resto < = 1: K = 0, se não: K = 11-resto
 */

import java.util.Random;
import java.util.Scanner;

public class ExercicioD {

	
	public static void main(String[] args){

		Random gerador = new Random();
		Scanner leitor = new Scanner(System.in);

		int[] cpfBase = new int[9];
		int[] cpfComp = new int[11];
		int cpfBaseL = cpfBase.length;
		int cpfCompL = cpfComp.length;

		String uf;
		int j = 0;
		int k = 0;
		int resto = 0;
		
		System.out.print("DIGITE A UF ESTADO DE REGISTRO DO CPF: ");
		uf = leitor.next().toUpperCase();

		for(int i = 0; i < cpfBaseL; i++) {
			if(i != 8) {
				int n = gerador.nextInt(10);
				cpfBase[i] = n;			
			} else {
				if(uf.equals("DF") || uf.equals("GO") || uf.equals("MS") || uf.equals("MT") || uf.equals("TO")){
					cpfBase[i] = 1;
				} else if(uf.equals("AC") || uf.equals("AM") || uf.equals("AP") || uf.equals("PA") || uf.equals("RO") || uf.equals("RR")){
					cpfBase[i] = 2;
				} else if(uf.equals("CE") || uf.equals("MA") || uf.equals("PI")) {
					cpfBase[i] = 3;
				} else if(uf.equals("AL") || uf.equals("PB") || uf.equals("PE") || uf.equals("RN")) {
					cpfBase[i] = 4;
				} else if(uf.equals("BA") || uf.equals("SE")) {
					cpfBase[i] = 5;
				} else if(uf.equals("MG")) {
					cpfBase[i] = 6;
				} else if(uf.equals("ES") || uf.equals("RJ")) {
					cpfBase[i] = 7;
				} else if(uf.equals("SP")) {
					cpfBase[i] = 8;
				} else if(uf.equals("PR") || uf.equals("SC")) {
					cpfBase[i] = 9;
				} else if(uf.equals("RS")) {
					cpfBase[i] = 0;
				} else {
					cpfBase[i] = 0;
				}
			}
		}
		
		//TESTE
		//int[] cpfBase = new int[]{};
		//int cpfBaseL = cpfBase.length;
		
		int soma;
		int fator = 0;
		int mult = 0;	
	
		//DEFIIÇÃO DE J
		fator = 10;
		soma = 0;
		for(int n:cpfBase) {
			mult = n * fator;
			soma += mult;
			fator -= 1;
		}
			resto = soma%11;
		if(resto <= 1) {
			j = 0;
		} else {
			j = 11-resto;
		}
		
		//DEFINIÇÃO DE K
		fator = 11;
		soma = 0;
		for(int n:cpfBase) {
			mult = n * fator;
			soma += mult;
			fator -= 1;
		}
			mult = j * 2;
			soma += mult;
			resto = soma%11;
		if(resto <= 1) {
			k = 0;
		} else {
			k = 11-resto;
		}
		
		//DEFINIÇÃO DO CPF COMPLETO
		for(int i = 0; i < cpfCompL ; i++) {
			if(i < cpfBaseL) {
				cpfComp[i] = cpfBase[i];
			} else if(i == cpfBaseL){
				cpfComp[i] = j;
			} else {
				cpfComp[i] = k;
			}	
		}
	
	String cpfString = new String();
	
	for(int i = 0; i < cpfCompL; i++) {
		if(i == 3 || i == 6  ) {
			cpfString += "." + cpfComp[i];
		} else if(i == 9){
			cpfString += "-"+ cpfComp[i];
		} else {
			cpfString += Integer.toString(cpfComp[i]);
		}			
	}
	System.out.println(cpfString);
	leitor.close();
	}
}


