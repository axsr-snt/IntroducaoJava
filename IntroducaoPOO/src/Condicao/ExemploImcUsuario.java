package Condicao;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ExemploImcUsuario {

	public static void main (String[] args) {
		
		Scanner retorno = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		ExemploInfoUsuario nome = new ExemploInfoUsuario();

		String obj1 = nome.getNomeUsuario();
		
		System.out.print("Ol�, " + obj1 + "!" + "\n\n");
		
		System.out.print("Por favor digite sua altura(m): ");
		float altura = retorno.nextFloat();
		System.out.print("Sua altura �: " + altura + " m \n\n");
		
		System.out.print("Por favor digite seu peso (kg): ");
		float peso = retorno.nextFloat();
		System.out.print("Seu peso �: " + peso + " kg \n\n");
		
		float imc = peso/(altura * altura);
		System.out.println("Seu IMC �: " + df.format(imc)+"\n");
		
		if(imc < 18.5) {
			System.out.println("Seu IMC est� abaixo do ideal!");
		} else if(imc > 25) {
			System.out.println("Seu IMC est� acima do ideal!");
		} else {
			System.out.println("Seu IMC est� ideal!");
		}
		retorno.close();
	}	
}
