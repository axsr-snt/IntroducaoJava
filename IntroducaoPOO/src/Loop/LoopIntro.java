package Loop;

import java.util.Scanner;

public class LoopIntro {

	public static void main (String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		
		int itens = 5;
		int registros = 0;
		
		// QUANDO NÃO É POSSÍVEL DEFINIR A QUANTIDADE EXATA DE REPETIÇÕES QUE O SEU
		// ALGORITMO REALIZARÁ OS LAÇOS MAIS INDICADOS SÃO O "while" E O  "do while"
		
		while (registros < itens) {
			registros ++;
			System.out.println("O caixa 1 registrou " + registros + " itens");
		}
		
		itens = 10;
		
		// A DIFERENÇA ENTRE O "while E O "do while" É QUE O "do while" REALIZA 
		// PRIMEIRO A REPETIÇÃO DEPOIS REALIZA A PROVA DA CONDIÇÃO, AO CONTRÁRIO
		// DO LAÇO "while"
		
		do {
			registros ++;
			System.out.println("O caixa 2 registrou " + registros + " itens");	
		} while(registros < itens);
	
		itens = 15;
		
		// QUANDO SE SABE DEFINIR A QUANTIDADE EXATA DE REPETIÇÕES NECESSÁRIAS
		// NO SEU ALGORITMO O LAÇO MAIS INDICADO É O FOR;
		
		for(int i = registros +1; i <= itens; i++) {
			System.out.println("O caixa 3 registrou " + i + " itens");
		}
		
	}
}
