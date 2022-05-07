package Loop;

/*
 * Elabore um programa que calcule a sequ�ncia de Fibonacci at� o 30� termo
 * A sequencia segue o seguinte padr�o 1, 1, 2, 3, 5... n
 */


public class ExercicioC {

	public static void main(String[] args) {
		
		int n1 = 1;
		int n2 = 0;
		int fibonacci = 0;
		
		for(int i = 1; i <= 30; i++) {
			fibonacci = n1 + n2;	
			n1 = n2;
			n2 = fibonacci;
			System.out.println(i + "� n�mero da sequencia de Fibonacci: " + fibonacci);
		}	
	}
}
