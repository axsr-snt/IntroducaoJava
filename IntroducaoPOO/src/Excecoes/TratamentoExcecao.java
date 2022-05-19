package Excecoes;

import java.util.Scanner;

public class TratamentoExcecao {

/*
	try{
		<Bloco de código>
	}catch(tipoExceção){
		<Bloco de código para tratamento da exceção>
	}	
*/

/*
	try{
		<Bloco de código>	
		}catch(tipoExceção){
			<Bloco de código para tratamento da exceção>
		
		}catch(tipoExceção){
			<Bloco de código para tratamento da exceção>
		
		}catch(tipoExceção){
			<Bloco de código para tratamento da exceção>
	}
 */

	public static void main(String[] args) throws Exception {

/*	ArithmeticException
	 
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int n1 = leitor.nextInt();
		System.out.println("Digite um número: ");
		int n2 = leitor.nextInt();
		
		int res = n1/n2;
		
		System.out.println("O resultado é: " + res);
		
		leitor.close(); 
*/
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
			int n1 = leitor.nextInt();
		System.out.println("Digite um número: ");
			int n2 = leitor.nextInt();
/*		
		try {
		int res = n1/n2;
		System.out.println("O resultado é: " + res);
		
		} catch (ArithmeticException e) { // parametro e armazena a exceção
			System.out.println("Não é possivél dividir por zero!");
			
			// método para retornar a mensagem de erro
			//System.out.println("Mensagem de erro: "+ e.getMessage());
			
			// método para imprimir a pilha de erro encontrada na exceção
			//e.printStackTrace();
		} finally { // o bloco finally sempre será executado com ou sem exceção
			System.out.println("Programa finalizado");
			leitor.close();
*/			
		TratExcecCalculadora calc = new TratExcecCalculadora();
		
		String res = calc.dividir(n1, n2);
		
		System.out.println(res);
		
		leitor.close();
		
	}
}
