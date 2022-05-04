package Loop;

import java.util.Scanner;

public class LoopIntro {

	public static void main (String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		
		int itens = 5;
		int registros = 0;
		
		// QUANDO N�O � POSS�VEL DEFINIR A QUANTIDADE EXATA DE REPETI��ES QUE O SEU
		// ALGORITMO REALIZAR� OS LA�OS MAIS INDICADOS S�O O "while" E O  "do while"
		
		while (registros < itens) {
			registros ++;
			System.out.println("O caixa 1 registrou " + registros + " itens");
		}
		
		itens = 10;
		
		// A DIFEREN�A ENTRE O "while E O "do while" � QUE O "do while" REALIZA 
		// PRIMEIRO A REPETI��O DEPOIS REALIZA A PROVA DA CONDI��O, AO CONTR�RIO
		// DO LA�O "while"
		
		do {
			registros ++;
			System.out.println("O caixa 2 registrou " + registros + " itens");	
		} while(registros < itens);
	
		itens = 15;
		
		// QUANDO SE SABE DEFINIR A QUANTIDADE EXATA DE REPETI��ES NECESS�RIAS
		// NO SEU ALGORITMO O LA�O MAIS INDICADO � O FOR;
		
		for(int i = registros +1; i <= itens; i++) {
			System.out.println("O caixa 3 registrou " + i + " itens");
		}
		
	}
}
