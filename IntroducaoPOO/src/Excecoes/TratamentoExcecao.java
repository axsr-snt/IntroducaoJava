package Excecoes;

import java.util.Scanner;

public class TratamentoExcecao {

/*
	try{
		<Bloco de c�digo>
	}catch(tipoExce��o){
		<Bloco de c�digo para tratamento da exce��o>
	}	
*/

/*
	try{
		<Bloco de c�digo>	
		}catch(tipoExce��o){
			<Bloco de c�digo para tratamento da exce��o>
		
		}catch(tipoExce��o){
			<Bloco de c�digo para tratamento da exce��o>
		
		}catch(tipoExce��o){
			<Bloco de c�digo para tratamento da exce��o>
	}
 */

	public static void main(String[] args) throws Exception {

/*	ArithmeticException
	 
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int n1 = leitor.nextInt();
		System.out.println("Digite um n�mero: ");
		int n2 = leitor.nextInt();
		
		int res = n1/n2;
		
		System.out.println("O resultado �: " + res);
		
		leitor.close(); 
*/
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
			int n1 = leitor.nextInt();
		System.out.println("Digite um n�mero: ");
			int n2 = leitor.nextInt();
/*		
		try {
		int res = n1/n2;
		System.out.println("O resultado �: " + res);
		
		} catch (ArithmeticException e) { // parametro e armazena a exce��o
			System.out.println("N�o � possiv�l dividir por zero!");
			
			// m�todo para retornar a mensagem de erro
			//System.out.println("Mensagem de erro: "+ e.getMessage());
			
			// m�todo para imprimir a pilha de erro encontrada na exce��o
			//e.printStackTrace();
		} finally { // o bloco finally sempre ser� executado com ou sem exce��o
			System.out.println("Programa finalizado");
			leitor.close();
*/			
		TratExcecCalculadora calc = new TratExcecCalculadora();
		
		String res = calc.dividir(n1, n2);
		
		System.out.println(res);
		
		leitor.close();
		
	}
}
