package Loop;

import java.util.Scanner;

public class LoopExemplo {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		String YN;
		
		
		do {
			System.out.println("Digite o primeiro n�mero: ");
			int n1 = leitor.nextInt();
			System.out.println("\nDigite o segundo n�mero: ");
			int n2 = leitor.nextInt();
			
			int soma = n1 + n2;
			
			System.out.println("\nA soma dos n�meros digitados � " + soma);
			 
			System.out.println("\nDeseja somar novamente? (s/n)");
			YN = leitor.next();
		} while(YN.equals("s"));
		
		leitor.close();
	}
}
